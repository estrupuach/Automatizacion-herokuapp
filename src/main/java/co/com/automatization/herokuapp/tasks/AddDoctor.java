package co.com.automatization.herokuapp.tasks;

import co.com.automatization.herokuapp.models.Doctor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.automatization.herokuapp.userinterfaces.AddDoctorPage.*;

public class AddDoctor implements Task {
    private Doctor doctor;

    public AddDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public static AddDoctor WithThe(Doctor data) {
        return Tasks.instrumented(AddDoctor.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LINK_ADD_DOCTOR),
                Enter.theValue(doctor.getName()).into(INPUT_NAME),
                Enter.theValue(doctor.getLastName()).into(INPUT_LAST_NAME),
                Enter.theValue(doctor.getTelephone()).into(INPUT_TELEPHONE),
                SelectFromOptions.byVisibleText(doctor.getIdType()).from(SELECT_ID_TYPE),
                Enter.theValue(doctor.getId()).into(INPUT_ID),
                Click.on(BUTTON_SAVE)
        );
    }
}
