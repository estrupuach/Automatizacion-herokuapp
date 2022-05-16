package co.com.automatization.herokuapp.stepdefinitions;

import co.com.automatization.herokuapp.models.Appointment;
import co.com.automatization.herokuapp.questions.ResponseAppointment;
import co.com.automatization.herokuapp.tasks.OpenUp;
import co.com.automatization.herokuapp.tasks.ScheduleAppointment;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ScheduleAppointmentStepDefinition {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("^that Carlos needs assits to the doctor$")
    public void thatCarlosNeedsAssitsToTheDoctor(){
        theActorCalled("Carlos").wasAbleTo(OpenUp.thePageHerokuapp() );
    }

    @When("^he realizes the schedule of appointment$")
    public void heRealizesTheScheduleOfAppointment(List<Appointment> data){
        theActorCalled("Carlos").attemptsTo(
                ScheduleAppointment.withTheData(data.get(0))
        );
    }

    @Then("^he validates the appointment menssage in the window (.*)$")
    public void heValidatesTheAppointmentMenssageInTheWindowDatosGuardadosCorrectamente(String save){
        theActorInTheSpotlight().should(seeThat(ResponseAppointment.inTheWindow(save)));
    }
}
