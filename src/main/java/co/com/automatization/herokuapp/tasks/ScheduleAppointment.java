package co.com.automatization.herokuapp.tasks;

import co.com.automatization.herokuapp.models.Appointment;
import co.com.automatization.herokuapp.userinterfaces.ScheduleAppointmentPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class ScheduleAppointment implements Task {
    private Appointment appointment;

    public ScheduleAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public static ScheduleAppointment withTheData(Appointment data) {
        return Tasks.instrumented(ScheduleAppointment.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ScheduleAppointmentPage.LINK_ADD_APPOINTMENT),
                Enter.theValue(appointment.getDate()).into(ScheduleAppointmentPage.INPUT_DATE),
                Hit.the(Keys.ENTER).into(ScheduleAppointmentPage.INPUT_DATE),
                Enter.theValue(appointment.getIdPatient()).into(ScheduleAppointmentPage.INPUT_ID_PATIENT),
                Enter.theValue(appointment.getIdDoctor()).into(ScheduleAppointmentPage.INPUT_ID_DOCTOR),
                Enter.theValue(appointment.getObservation()).into(ScheduleAppointmentPage.TEXT_AREA_OBSERVATION),
                Click.on(ScheduleAppointmentPage.BUTTON_SAVE)
        );
    }
}
