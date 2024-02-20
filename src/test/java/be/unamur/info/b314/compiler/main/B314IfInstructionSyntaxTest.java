package be.unamur.info.b314.compiler.main;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class B314IfInstructionSyntaxTest {

    private static final Logger LOG = LoggerFactory.getLogger(B314IfInstructionSyntaxTest.class);

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
    public void if_else_with_sub_ifs_SHOULD_be_OK_Test() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/ifinstruction/ok/if_else_with_sub_ifs.b314", testFolder.newFile(), true, "ifinstruction: if_else_with_sub_ifs");
    }

    @Test
    public void previous_series_and_if_SHOULD_be_OK_Test() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/ifinstruction/ok/previous_series_and_if.b314", testFolder.newFile(), true, "ifinstruction: previous_series_and_if");
    }

    @Test
    public void previous_series_and_if_else_SHOULD_be_OK_Test() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/ifinstruction/ok/previous_series_and_if_else.b314", testFolder.newFile(), true, "ifinstruction: previous_series_and_if_else");
    }

    @Test
    public void previous_series_and_if_else_with_sub_if_else_SHOULD_be_OK_Test() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/ifinstruction/ok/previous_series_and_if_else_with_sub_if_else.b314", testFolder.newFile(), true, "ifinstruction: previous_series_and_if_else_with_sub_if_else");
    }

    @Test
    public void previous_series_and_if_with_sub_if_SHOULD_be_OK_Test() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/ifinstruction/ok/previous_series_and_if_with_sub_if.b314", testFolder.newFile(), true, "ifinstruction: previous_series_and_if_with_sub_if");
    }

}