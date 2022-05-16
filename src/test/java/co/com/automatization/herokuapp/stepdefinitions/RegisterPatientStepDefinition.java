package co.com.automatization.herokuapp.stepdefinitions;

import co.com.automatization.herokuapp.models.Persona;
import co.com.automatization.herokuapp.questions.ReponsePatient;
import co.com.automatization.herokuapp.tasks.AddDoctor;
import co.com.automatization.herokuapp.tasks.AddPatient;
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

public class RegisterPatientStepDefinition {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }
    @Given("^that Carlos needs register a new patient$")
    public void thatCarlosNeedsRegisterANewPatient(){
        theActorCalled("Carlos").wasAbleTo(OpenUp.thePageHerokuapp() );
    }

    @When("^he realizes the register from patient in the hospital administrative system$")
    public void heRealizesTheRegisterFromPatientInTheHospitalAdministrativeSystem(List<Persona> data){
        theActorCalled("Carlos").attemptsTo(
                AddPatient.WithThe(data.get(0))
        );
    }

    @Then("^he validates the patient menssage in the window (.*)$")
    public void heValidatesThePatientMenssageInTheWindowDatosGuardadosCorrectamente(String save){
        theActorInTheSpotlight().should(seeThat(ReponsePatient.inTheWindow(save)));
    }
}
