package co.com.automatization.herokuapp.tasks;

import co.com.automatization.herokuapp.models.Persona;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.automatization.herokuapp.userinterfaces.AddPatientPage.*;

public class AddPatient implements Task {
    private Persona persona;

    public AddPatient(Persona persona) {
        this.persona = persona;
    }

    public static AddPatient WithThe(Persona persona) {
        return Tasks.instrumented(AddPatient.class, persona);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LINK_ADD_PATIENT),
                Enter.theValue(persona.getName()).into(INPUT_NAME),
                Enter.theValue(persona.getLastName()).into(INPUT_LAST_NAME),
                Enter.theValue(persona.getTelephone()).into(INPUT_TELEPHONE),
                SelectFromOptions.byVisibleText(persona.getIdType()).from(SELECT_ID_TYPE),
                Enter.theValue(persona.getId()).into(INPUT_ID),
                Click.on(CHECK_PREPAID_HEALTH),
                Click.on(BUTTON_SAVE)
        );
    }
}
