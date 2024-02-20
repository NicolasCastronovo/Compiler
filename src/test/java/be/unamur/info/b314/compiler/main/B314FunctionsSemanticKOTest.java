package be.unamur.info.b314.compiler.main;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class B314FunctionsSemanticKOTest {

    private static final Logger LOG = LoggerFactory.getLogger(B314FunctionsSemanticKOTest.class);

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

    @Test
    public void mistake_boolean_function_no_local_var_SHOULD_NOT_be_OK_Test() throws Exception {
        CompilerTestHelper.launchCompilation("/semantics/functions/ko/mistake_boolean_function_no_local_var.b314", testFolder.newFile(), false, "functions: mistake_boolean_function_no_local_var");
    }

    @Test
    public void mistake_functions_no_local_var_SHOULD_NOT_be_OK_Test() throws Exception {
        CompilerTestHelper.launchCompilation("/semantics/functions/ko/mistake_functions_no_local_var.b314", testFolder.newFile(), false, "functions: mistake_functions_no_local_var.b314");
    }

    @Test
    public void mistake_global_vars_and_functions_no_local_var_SHOULD_NOT_be_OK_Test() throws Exception {
        CompilerTestHelper.launchCompilation("/semantics/functions/ko/mistake_global_vars_and_functions_no_local_var.b314", testFolder.newFile(), false, "functions: mistake_global_vars_and_functions_no_local_var");
    }

    @Test
    public void mistake_square_function_no_local_var_SHOULD_NOT_be_OK_Test() throws Exception {
        CompilerTestHelper.launchCompilation("/semantics/functions/ko/mistake_square_function_no_local_var.b314", testFolder.newFile(), false, "functions: mistake_square_function_no_local_var.b314");
    }

    @Test
    public void mistake_void_function_no_local_var_SHOULD_NOT_be_OK_Test() throws Exception {
        CompilerTestHelper.launchCompilation("/semantics/functions/ko/mistake_void_function_no_local_var.b314", testFolder.newFile(), false, "functions: mistake_void_function_no_local_var");
    }
}