package be.unamur.info.b314.compiler.main;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class B314ActionInstructionSemanticKOTest {

    private static final Logger LOG = LoggerFactory.getLogger(B314ActionInstructionSemanticKOTest.class);

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
    public void action_move_down_SHOULD_NOT_be_OK_Test() throws Exception {
        CompilerTestHelper.launchCompilation("/semantics/actioninstruction/ko/testnextinstruction_action_move_down_ko.b314", testFolder.newFile(), false, "nextinstruction: action_move_down");
    }
}