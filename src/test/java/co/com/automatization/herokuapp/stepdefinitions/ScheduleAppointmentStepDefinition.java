package co.com.automatization.herokuapp.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class ScheduleAppointmentStepDefinition {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("^that Carlos needs assits to the doctor$")
    public void thatCarlosNeedsAssitsToTheDoctor(){
    }

    @When("^he realizes the schedule of appointment$")
    public void heRealizesTheScheduleOfAppointment(){
    }

    @Then("^he validates the appointment menssage in the window Datos guardados correctamente$")
    public void heValidatesTheAppointmentMenssageInTheWindowDatosGuardadosCorrectamente(){
    }
}
