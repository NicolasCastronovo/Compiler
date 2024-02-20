package be.unamur.info.b314.compiler.main;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class B314LoopInstructionSemanticTest {

    private static final Logger LOG = LoggerFactory.getLogger(B314LoopInstructionSemanticTest.class);

    @Rule
    public TemporaryFolder testFolder = new TemporaryFolder(); // Create a temporary folder for outputs deleted after tests

    @Rule
    public TestRule watcher = new TestWatcher() { // Prints message on logger before each test
        @Override
        protected void starting(Description description) {
            LOG.info(String.format("Starting test: %s()...",
                    description.getMethodName()));
        }

        ;
    };


    /*
        Serie de tests pour instruction loop KO
    */
    @Test
    public void array_tour_for_SHOULD_be_OK_Test() throws Exception {
        CompilerTestHelper.launchCompilation("/semantics/loopinstruction/ok/whileinstruction_array_tour_for.b314", testFolder.newFile(), true, "forinstruction: array_tour_for");
    }

}