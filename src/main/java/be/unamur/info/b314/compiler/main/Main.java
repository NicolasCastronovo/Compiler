package be.unamur.info.b314.compiler.main;


import be.unamur.info.b314.compiler.PlayPlusLexer;
import be.unamur.info.b314.compiler.PlayPlusParser;
import be.unamur.info.b314.compiler.printer.NBCPrinter;
import be.unamur.info.b314.compiler.visitor.NBCVisitor;
import lombok.val;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import static com.google.common.base.Preconditions.checkArgument;

/**
 * @author James Ortiz - james.ortizvega@unamur.be
 */
public class Main {

    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    private static final String NAME = "b314-compiler";
    private static final String HELP = "h";
    private static final String INPUT = "i";
    private static final String OUTPUT = "o";

    /**
     * Main method launched when starting compiler jar file.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        Main main = new Main();
        CommandLineParser parser = new DefaultParser();
        CommandLine line = null;
        try {
            line = parser.parse(main.options, args);
        } catch (ParseException ex) {
            LOG.error("Error while parsing command line!", ex);
            main.printHelpMessage();
        }
        // If help is requested, print help message and exit.
        if (line != null) {
            if (line.hasOption(HELP)) {
                main.printHelpMessage();
            } else {
                // Else start compilation
                try {
                    main.initialise(line);
                    main.compile(); // Call compile method (to be completed)
                    System.err.println("OK"); // Print OK on stderr
                } catch (Exception e) {
                    LOG.error("Exception occured during compilation!", e);
                    System.err.println("KO"); // Print KO on stderr if a problem occured
                }
            }
        }
    }

    /**
     * The command line options.
     */
    private final Options options;

    /**
     * The input B314 file.
     */
    private File inputFile;

    /**
     * The output PCode file.
     */
    private File outputFile;

    private PlayPlusParser parser;

    private Main() {
        // Create command line options
        options = new Options();
        options.addOption(Option.builder(HELP)
                .desc("Prints this help message.")
                .build());

        options.addOption(Option.builder(INPUT)
                .desc("The B314 input file.")
                .hasArg()
                .build());

        options.addOption(Option.builder(OUTPUT)
                .desc("The PCOde output file.")
                .hasArg()
                .build());
    }

    /**
     * Prints help message with this options.
     */
    private void printHelpMessage() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(128);
        formatter.printHelp(String.format("java -jar %s.jar -%s | %s %s",
                NAME, HELP, INPUT, OUTPUT), options);
    }

    /**
     * Initialise the input compiler using the given input line.
     *
     * @throws Exception If one of the three required arguments is not provided.
     */
    private void initialise(CommandLine line) throws Exception {
        LOG.debug("Initialisation");
        // Check that the arguments are there
        if (!line.hasOption(INPUT)) {
            throw new ParseException(String.format("Option %s is mandatory!", INPUT));
        } else if (!line.hasOption(OUTPUT)) {
            throw new ParseException(String.format("Option %s is mandatory!", OUTPUT));
        }
        // Get given files and check they exist
        inputFile = new File(line.getOptionValue(INPUT));
        checkArgument(inputFile.exists() && inputFile.isFile(), "File %s not found!", inputFile.getName());
        LOG.debug("Input file set to {}", inputFile.getPath());

        System.out.println("Contenu du fichier: ");
        val file = new File(line.getOptionValue(INPUT));
        val scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            System.out.println(data);
        }
        scanner.close();

        outputFile = new File(line.getOptionValue(OUTPUT));
        if (!outputFile.exists()) {
            outputFile.createNewFile();
        }
        checkArgument(outputFile.exists() && outputFile.isFile(), "File %s not created!", outputFile.getName());
        LOG.debug("Output file set to {}", outputFile.getPath());

        LOG.debug("Initialisation: done");
    }


    /**
     * Compiler Methods, this is where the MAGIC happens !!! \o/
     */
    private void compile() throws IOException {

        // Put your code here !

        // Get abstract syntax tree
        LOG.debug("Parsing input");
        PlayPlusParser.RootContext tree = parse(new ANTLRInputStream(new FileInputStream(inputFile)));
        LOG.debug("Parsing input: done");
        LOG.debug("AST is {}", tree.toStringTree(parser));
        // Build symbol table
        LOG.debug("Building symbol table");
        LOG.debug("Building symbol table: done");
        // Print NBC Code
        LOG.debug("Printing NBC Code");
        printNBCCode(tree);
        LOG.debug("Printing NBC Code: done");

    }

    /**
     * Builds the abstract syntax tree from input.
     */
    private PlayPlusParser.RootContext parse(ANTLRInputStream input) throws ParseCancellationException {
        // Create the token stream
        CommonTokenStream tokens = new CommonTokenStream(new PlayPlusLexer(input));
        // Intialise parser
        parser = new PlayPlusParser(tokens);
        // Set error listener to adoc implementation
        parser.removeErrorListeners();
        MyConsoleErrorListener errorListener = new MyConsoleErrorListener();
        parser.addErrorListener(errorListener);
        // Launch parsing
        PlayPlusParser.RootContext tree;
        try {
            tree = parser.root();
        } catch (RecognitionException e) {
            throw new IllegalArgumentException("Error while retrieving parsing tree!", e);
        }
        if (errorListener.errorHasBeenReported()) {
            throw new IllegalArgumentException("Error while parsing input!");
        }
        return tree;
    }


    private void printNBCCode(PlayPlusParser.RootContext tree) throws IOException {

        NBCPrinter printer = new NBCPrinter("nbcCode.nbc");

        val currentDirectory = inputFile.getPath().substring(0, inputFile.getPath().length() - inputFile.getName().length());

        NBCVisitor visitor = new NBCVisitor(printer, currentDirectory);
        tree.accept(visitor);
        printer.flush();
        printer.close();
    }

}