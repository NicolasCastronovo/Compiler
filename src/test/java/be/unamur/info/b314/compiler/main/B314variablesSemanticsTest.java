package be.unamur.info.b314.compiler.main;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class B314variablesSemanticsTest {

    private static final Logger LOG = LoggerFactory.getLogger(B314variablesSemanticsTest.class);

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

    //
    // Serie variables OK
    //
//    @Test
//    public void testvariables_id_operationAdd_ok() throws Exception{
//        CompilerTestHelper.launchCompilation("/semantics/variables/ok/id_operationAdd.b314", testFolder.newFile(), true, "variables: id_operationAdd");
//    }


    //
    // Serie variables KO
    //
    @Test
    public void testvariables_id_operationAdd_mistake_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/semantics/variables/ko/id_operationAdd_mistake.b314", testFolder.newFile(), false, "variables: id_operationAdd_mistake");
    }


}