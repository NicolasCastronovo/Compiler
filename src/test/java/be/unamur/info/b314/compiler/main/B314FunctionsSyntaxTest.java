package be.unamur.info.b314.compiler.main;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class B314FunctionsSyntaxTest {

    private static final Logger LOG = LoggerFactory.getLogger(B314FunctionsSyntaxTest.class);

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
        Serie de tests pour instruction if OK
    */
    @Test
    public void multiple_functions_no_local_var_SHOULD_be_OK_Test() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/functions/ok/multiple_functions_no_local_var.b314", testFolder.newFile(), true, "functions: multiple_functions_no_local_var");
    }

    @Test
    public void one_square_function_no_local_var_SHOULD_be_OK_Test() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/functions/ok/one_square_function_no_local_var.b314", testFolder.newFile(), true, "functions: one_square_function_no_local_var");
    }

    @Test
    public void testfunctions_factorial_ok_SHOULD_be_OK_Test() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/functions/ok/testfunctions_factorial_ok.b314", testFolder.newFile(), true, "functions: testfunctions_factorial_ok");
    }

    @Test
    public void one_void_function_no_local_var_SHOULD_be_OK_Test() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/functions/ok/one_void_function_no_local_var.b314", testFolder.newFile(), true, "functions: one_void_function_no_local_var");
    }

    @Test
    public void multiple_global_vars_and_functions_with_parameters_no_local_var_SHOULD_be_OK_Test() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/functions/ok/multiple_global_vars_and_functions_with_parameters_no_local_var.b314", testFolder.newFile(), true, "functions: multiple_global_vars_and_functions_with_parameters_no_local_var");
    }

}