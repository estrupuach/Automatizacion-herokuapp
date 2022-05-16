package co.com.automatization.herokuapp.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ScheduleAppointmentPage extends PageObject {
    public static final Target LINK_ADD_APPOINTMENT = Target.the("link that directs at the appointment form")
            .located(By.cssSelector("a[href='appointmentScheduling']"));
    public static final Target INPUT_DATE = Target.the("input for write date")
            .located(By.id("datepicker"));
    public static final Target INPUT_ID_PATIENT = Target.the("input for write patient id")
            .located(By.cssSelector("input[placeholder='Ingrese el documento de identidad del paciente']"));
    public static final Target INPUT_ID_DOCTOR = Target.the("input for write doctor id")
            .located(By.cssSelector("input[placeholder='Ingrese el documento de identidad del doctor']"));
    public static final Target TEXT_AREA_OBSERVATION = Target.the("text area for write observation")
            .located(By.cssSelector("textarea[class='form-control']"));
    public static final Target BUTTON_SAVE = Target.the("button that save the register")
            .located(By.cssSelector("a[class='btn btn-primary pull-right']"));
}
