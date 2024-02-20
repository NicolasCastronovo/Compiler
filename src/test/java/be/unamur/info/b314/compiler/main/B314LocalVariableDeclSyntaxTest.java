package be.unamur.info.b314.compiler.main;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class B314LocalVariableDeclSyntaxTest {

    private static final Logger LOG = LoggerFactory.getLogger(B314LocalVariableDeclSyntaxTest.class);

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
        Serie de tests pour déclaration variable locale OK
    */
    @Test
    public void mixing_SHOULD_be_OK() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/localvariabledecl/ok/mixing.b314", testFolder.newFile(), true, "localvariabledecl: mixing");
    }

    @Test
    public void when_local_variable_same_names_as_global_SHOULD_be_OK() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/localvariabledecl/ok/when_local_variable_same_names_as_global.b314", testFolder.newFile(), true, "localvariabledecl: while_local_variable_same_names_as_global");
    }

    @Test
    public void when_local_var_diff_names_than_global_vars_SHOULD_be_OK() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/localvariabledecl/ok/when_local_var_diff_names_than_global_vars.b314", testFolder.newFile(), true, "localvariabledecl: while_local_var_diff_names_than_global_vars");
    }

    @Test
    public void fct_local_var_same_names_and_different_types_than_global_vars_SHOULD_be_OK() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/localvariabledecl/ok/fct_local_var_same_names_and_different_types_than_global_vars.b314", testFolder.newFile(), true, "localvariabledecl: fct_local_var_same_names_and_different_types_than_global_vars");
    }

    @Test
    public void fct_local_var_diff_names_than_global_vars_but_same_name_in_different_functions_SHOULD_be_OK() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/localvariabledecl/ok/fct_local_var_diff_names_than_global_vars_but_same_name_in_different_functions.b314", testFolder.newFile(), true, "localvariabledecl: fct_local_var_diff_names_than_global_vars_but_same_name_in_different_functions");
    }

    @Test
    public void fct_local_var_diff_names_than_global_vars_SHOULD_be_OK() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/localvariabledecl/ok/fct_local_var_diff_names_than_global_vars.b314", testFolder.newFile(), true, "localvariabledecl: fct_local_var_diff_names_than_global_vars");
    }

    @Test
    public void when_local_var_same_names_and_different_types_than_global_vars_condition_on_global_vars_in_when_SHOULD_be_OK() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/localvariabledecl/ok/when_local_var_same_names_and_different_types_than_global_vars_condition_on_global_vars_in_when.b314", testFolder.newFile(), true, "localvariabledecl: while_local_var_same_names_and_different_types_than_global_vars_condition_on_global_vars_in_main");
    }

    @Test
    public void when_local_var_same_names_and_different_types_than_global_vars_SHOULD_be_OK() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/localvariabledecl/ok/when_local_var_same_names_and_different_types_than_global_vars.b314", testFolder.newFile(), true, "localvariabledecl: while_local_var_same_names_and_different_types_than_global_vars");
    }

    @Test
    public void when_local_var_diff_names_than_global_vars_but_same_name_in_different_whens_SHOULD_be_OK() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/localvariabledecl/ok/when_local_var_diff_names_than_global_vars_but_same_name_in_different_whens.b314", testFolder.newFile(), true, "localvariabledecl: while_local_var_diff_names_than_global_vars_but_same_name_in_main");
    }

    @Test
    public void when_local_variable_diff_names_SHOULD_be_OK() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/localvariabledecl/ok/when_local_variable_diff_names.b314", testFolder.newFile(), true, "localvariabledecl: while_local_variable_diff_names");
    }

}