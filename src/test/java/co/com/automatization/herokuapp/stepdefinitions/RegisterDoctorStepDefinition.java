package co.com.automatization.herokuapp.stepdefinitions;

import co.com.automatization.herokuapp.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;


public class RegisterDoctorStepDefinition {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("^that Carlos needs register a new doctor$")
    public void thatCarlosNeedsRegisterANewDoctor(){
        theActorCalled("Carlos").wasAbleTo(OpenUp.thePageHerokuapp() );
    }

    @When("^he realizes the register from same in the hospital administrative system$")
    public void heRealizesTheRegisterFromSameInTheHospitalAdministrativeSystem(){
    }

    @Then("^he validates the menssage in the window Datos guardados correctamente$")
    public void heValidatesTheMenssageInTheWindowDatosGuardadosCorrectamente(){
    }
}
