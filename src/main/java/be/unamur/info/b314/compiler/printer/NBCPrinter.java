package be.unamur.info.b314.compiler.printer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Objects;

/**
 * The printer contains the methods to be called by the visitor to translate the symbol tree into NBCode to a text file.
 */
public class NBCPrinter {

    /**
     * Defines the motor percentage to use when moving the robot
     */
    static final int POWER = 5;

    /**
     * Translate java types to their NBC equivalent
     */
    public enum NBCCodeTypes {
        Int("sdword"),
        Char("sbyte"),
        Bool("byte");

        private final String representation;

        private NBCCodeTypes(String r) {
            representation = r;
        }
    }

    private final PrintWriter writer;

    public NBCPrinter(File outFile) throws FileNotFoundException {
        writer = new PrintWriter(outFile);
    }

    public NBCPrinter(String fileName) throws FileNotFoundException {
        writer = new PrintWriter(fileName);
    }

    public NBCPrinter(OutputStream out) {
        writer = new PrintWriter(out);
    }


    public void printLoadConstant(NBCCodeTypes type, int value) {
        writer.printf("ldc %s %d", type.representation, value).println();
    }

    public void printLoadAdress(String var, int nvar) {
        writer.printf("mov %s %d", var, nvar).println();
    }


    public void printLoad(NBCCodeTypes type, String var) {
        writer.printf("%s %s", var, type.representation).println();
    }

    public void printStop() {
        writer.println("exit");
    }

    public void printComments(String comment) {
        writer.printf("; %s", comment).println();
    }

    public void printAssignationIdContextScalar(String exprG, String value) {
        writer.printf("set %s, %s\n", exprG, value);
    }

    public void printAssignationIdContextConstant(String exprG, String value) {
        writer.printf("#DEFINE %s %s\n", exprG, value);
    }

    public void printAssignationArrayContextSimple(String exprG, String value, String index) {
        writer.printf("set %s[%s], %s\n", exprG, index, value);
    }

    public void printAssignationArrayContextDouble(String exprG, String value, String index1, String index2) {
        writer.printf("set %s[%s, %s], %s\n", exprG, index1, index2, value);
    }

    public void printAssignationRecordContext(String exprG, String key, String value) {
        writer.printf("set %s.%s, %s\n", exprG, key, value);
    }

    public void printAssignationArrayRecordContextSimple(String exprG, String key, String value, String index) {
        writer.printf("set %s.%s[%s], %s\n", exprG, key, index, value);
    }

    public void printAssignationArrayRecordContextDouble(String exprG, String key, String value, String index1, String index2) {
        writer.printf("set %s.%s[%s, %s], %s\n", exprG, key, index1, index2, value);
    }

    /**
     * Move the robot to the left then take its initial position. The parameter multiply the motor power to move multiple boxes
     * @param nbr
     */
    public void printLeft(String nbr) {
        writer.printf("RotateMotor(OUT_A, @d, 270)", POWER * Integer.parseInt(nbr)).println();
        writer.printf("OnFwdReg(OUT_BC, @d, OUT_REGMODE_SYNC)", POWER * Integer.parseInt(nbr)).println();
        writer.printf("wait 2000").println();
        writer.printf("Off(OUT_BC)").println();
        writer.printf("RotateMotor(OUT_A, @d, 90)", POWER * Integer.parseInt(nbr)).println();
    }

    /**
     * Move the robot to the right then take its initial position. The parameter multiply the motor power to move multiple boxes
     * @param nbr
     */
    public void printRight(String nbr) {
        writer.printf("RotateMotor(OUT_A, @d, 90)", POWER * Integer.parseInt(nbr)).println();
        writer.printf("OnFwdReg(OUT_BC, @d, OUT_REGMODE_SYNC)", POWER * Integer.parseInt(nbr)).println();
        writer.printf("wait 2000").println();
        writer.printf("Off(OUT_BC)").println();
        writer.printf("RotateMotor(OUT_A, @d, 270)", POWER * Integer.parseInt(nbr)).println();
    }

    /**
     * Move the robot up then take its initial position. The parameter multiply the motor power to move multiple boxes
     * @param nbr
     */
    public void printUp(String nbr) {
        writer.printf("OnFwdReg(OUT_BC, @d, OUT_REGMODE_SYNC)", POWER * Integer.parseInt(nbr)).println();
        writer.printf("wait 2000").println();
        writer.printf("Off(OUT_BC)").println();
    }

    /**
     * Move the robot down then take its initial position. The parameter multiply the motor power to move multiple boxes
     * @param nbr
     */
    public void printDown(String nbr) {
        writer.printf("RotateMotor(OUT_A, @d, 180)", POWER * Integer.parseInt(nbr)).println();
        writer.printf("OnFwdReg(OUT_BC, @d, OUT_REGMODE_SYNC)", POWER * Integer.parseInt(nbr)).println();
        writer.printf("wait 2000").println();
        writer.printf("Off(OUT_BC)").println();
        writer.printf("RotateMotor(OUT_A, @d, 180)", POWER * Integer.parseInt(nbr)).println();
    }

    /**
     * plays a tone to signify that the robot has jumped.
     */
    public void printJump() {
        writer.printf("PlayTone(TONE_C3,500)").println();
    }

    /**
     * plays a tone to signify that the robot has fought
     */
    public void printFight() {
        writer.printf("PlayTone(TONE_D5,500)").println();
    }

    /**
     * plays a tone to signify that the robot has dug
     */
    public void printDig() {
        writer.printf("PlayTone(TONE_E7,500)").println();
        writer.printf("endt").println();
    }

    public void flush() {
        writer.flush();
    }

    public void close() {
        writer.flush();
        writer.close();
    }

    public void printStrucDecl(String nvar) {
        writer.printf("%s as record", nvar).println();
    }

    public void printStrucDeclEnd() {
        writer.printf("end;").println();
    }

    public void printInclude() {
        writer.printf("#include \"NXTDefs.h\" ").println();
    }

    public void printVarDecl(String type, String nvar) {
        type = ReturnNbcType(type);
        writer.printf("dseg segment ").println();
        writer.printf("    %s as %s ", nvar, type).println();
        writer.printf("dseg ends ").println();
    }


    public void printVarDeclArray(String type, String nvar, int size, String index1, String index2) {
        type = ReturnNbcType(type);
        writer.printf("dseg segment ").println();
        if (size == 1) {
            writer.printf("    %s as %s[%s] ", nvar, type, index1).println();
        } else if (size == 2) {
            writer.printf("    %s as %s[%s, %s] ", nvar, type, index1, index2).println();
        }
        writer.printf("dseg ends ").println();
    }

    public void printVarDeclInit(String type, String nvar, String value) {
        type = ReturnNbcType(type);
        writer.printf("dseg segment ").println();
        writer.printf("    %s as %s ", nvar, type).println();
        writer.printf("dseg ends ").println();
        writer.printf("set %s, %s", nvar, value);
    }

    /**
     * takes a java type and return its NBC equivalent
     * @param type
     * @return
     */
    public String ReturnNbcType(String type) {
        if (Objects.equals(type, "integer")) {
            return "sdword";
        } else if (Objects.equals(type, "boolean")) {
            return "sbyte";
        } else if (Objects.equals(type, "char")) {
            return "byte";
        } else if (Objects.equals(type, "void")) {
            return null;
        }
        return null;
    }

    public void printOpenThread(String name, String scalar) {
        if (scalar != null) {
            writer.printf("dseg segment ").println();
            writer.printf("    %s as %s ", name, scalar).println();
            writer.printf("dseg ends ").println();
        }
        writer.printf("thread %s", name).println();
    }

    public void printCloseThread() {
        writer.printf("endt").println();
    }

    public void printCallThread(String name) {
        writer.printf("precedes %s", name).println();
    }
}
