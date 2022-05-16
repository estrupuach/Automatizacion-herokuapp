package co.com.automatization.herokuapp.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/register_patient.feature",
        tags = "@ScenarioPatient",
        glue = "co.com.automatization.herokuapp.stepdefinitions",
        snippets = SnippetType.CAMELCASE )
public class RegisterPatientRunner {
}
