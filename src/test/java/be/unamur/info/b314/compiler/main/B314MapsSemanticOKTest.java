package be.unamur.info.b314.compiler.main;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class B314MapsSemanticOKTest {

    private static final Logger LOG = LoggerFactory.getLogger(B314MapsSemanticOKTest.class);

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
    public void missing_colon_play_card_SHOULD_NOT_be_OK_Test() throws Exception {
        CompilerTestHelper.launchCompilation("/semantics/maps/ko/missing_colon_play_card.b314", testFolder.newFile(), false, "maps: missing_colon_play_card");
    }

    @Test
    public void missing_numbers_size_play_card_SHOULD_NOT_be_OK_Test() throws Exception {
        CompilerTestHelper.launchCompilation("/semantics/maps/ko/missing_numbers_size_play_card.b314", testFolder.newFile(), false, "maps: missing_numbers_size_play_card");
    }
}