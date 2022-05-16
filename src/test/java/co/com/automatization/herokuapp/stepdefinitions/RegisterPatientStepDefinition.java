package co.com.automatization.herokuapp.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class RegisterPatientStepDefinition {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }
    @Given("^that Carlos needs register a new patient$")
    public void thatCarlosNeedsRegisterANewPatient(){
    }

    @When("^he realizes the register from patient in the hospital administrative system$")
    public void heRealizesTheRegisterFromPatientInTheHospitalAdministrativeSystem(){
    }

    @Then("^he validates the patient menssage in the window Datos guardados correctamente$")
    public void heValidatesThePatientMenssageInTheWindowDatosGuardadosCorrectamente(){
    }
}
