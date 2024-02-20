package be.unamur.info.b314.compiler.main;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class B314IfInstructionSemanticTest {

    private static final Logger LOG = LoggerFactory.getLogger(B314IfInstructionSemanticTest.class);

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
        Serie de tests pour instruction if KO
    */
    @Test
    public void if_wrong_type_condition_SHOULD_NOT_be_OK_Test() throws Exception {
        CompilerTestHelper.launchCompilation("/semantics/ifinstruction/ko/if_wrong_type_condition.b314", testFolder.newFile(), false, "ifinstruction: if_wrong_type_condition");
    }

    @Test
    public void if_else_wrong_condition_SHOULD_NOT_be_OK_Test() throws Exception {
        CompilerTestHelper.launchCompilation("/semantics/ifinstruction/ko/if_else_wrong_condition.b314", testFolder.newFile(), false, "ifinstruction: if_else_wrong_condition");
    }

    @Test
    public void if_else_with_sub_if_and_wrong_operators_SHOULD_NOT_be_OK_Test() throws Exception {
        CompilerTestHelper.launchCompilation("/semantics/ifinstruction/ko/if_else_with_sub_if_and_wrong_operators.b314", testFolder.newFile(), false, "ifinstruction: if_else_with_sub_if_and_wrong_operators");
    }

}