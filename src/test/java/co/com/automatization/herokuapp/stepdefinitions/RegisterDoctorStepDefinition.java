package co.com.automatization.herokuapp.stepdefinitions;

import co.com.automatization.herokuapp.models.Doctor;
import co.com.automatization.herokuapp.questions.ResponseDoctor;
import co.com.automatization.herokuapp.tasks.AddDoctor;
import co.com.automatization.herokuapp.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;


public class RegisterDoctorStepDefinition {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("^that Carlos needs register a new doctor$")
    public void thatCarlosNeedsRegisterANewDoctor(){
        theActorCalled("Carlos").wasAbleTo(OpenUp.thePageHerokuapp() );
    }

    @When("^he realizes the register from doctor in the hospital administrative system$")
    public void heRealizesTheRegisterFromDoctorInTheHospitalAdministrativeSystem(List<Doctor> data){
        theActorCalled("Carlos").attemptsTo(
                AddDoctor.WithThe(data.get(0))
        );
    }

    @Then("^he validates the doctor menssage in the window (.*)$")
    public void heValidatesTheDoctorMenssageInTheWindowDatosGuardadosCorrectamente(String save){
        theActorInTheSpotlight().should(seeThat(ResponseDoctor.inTheWindow(save)));
    }
}
