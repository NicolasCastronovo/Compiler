package be.unamur.info.b314.compiler.main;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class B314CodeGenerationMapTest {

    private static final Logger LOG = LoggerFactory.getLogger(B314CodeGenerationMapTest.class);

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
    public void action_use_dig_SHOULD_not_be_OK_Test() throws Exception {
        CompilerTestHelper.launchCompilation("/codegeneration/maptest/ko/testnextinstruction_action_use_dig.b314", testFolder.newFile(), false, "coucou la map");
    }

    /*
        Serie de tests pour instruction loop KO
    */
    @Test
    public void mixing_SHOULD_be_OK_Test() throws Exception {
        CompilerTestHelper.launchCompilation("/codegeneration/maptest/ok/mixing.b314", testFolder.newFile(), true, "mixing");
    }

    @Test
    public void check_global_var_is_initialized_SHOULD_be_OK_Test() throws Exception {
        CompilerTestHelper.launchCompilation("/codegeneration/maptest/ok2/check_global_var_is_initialized.b314", testFolder.newFile(), true, "check_global_var_is_initialized");
    }

}