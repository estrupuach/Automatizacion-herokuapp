package co.com.automatization.herokuapp.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddPatientPage extends PageObject {
    public static final Target LINK_ADD_PATIENT = Target.the("link that directs the patient form")
            .located(By.cssSelector("a[href='addPatient']"));
    public static final Target INPUT_NAME = Target.the("where you can write the name")
            .located(By.name("name"));
    public static final Target INPUT_LAST_NAME = Target.the("where you can write the last name")
            .located(By.name("last_name"));
    public static final Target INPUT_TELEPHONE = Target.the("where you can write the telephone")
            .located(By.name("telephone"));
    public static final Target SELECT_ID_TYPE = Target.the("where you can select the id type ")
            .located(By.name("identification_type"));
    public static final Target INPUT_ID = Target.the("where you can write the id")
            .located(By.name("identification"));
    public static final Target CHECK_PREPAID_HEALTH = Target.the("Check for active the prepaid health")
            .located(By.name("prepaid"));
    public static final Target BUTTON_SAVE = Target.the("Button for save data and register")
            .located(By.cssSelector("a[class='btn btn-primary pull-right']"));
}
