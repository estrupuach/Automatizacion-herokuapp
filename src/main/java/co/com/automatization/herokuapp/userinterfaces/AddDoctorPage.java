package co.com.automatization.herokuapp.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddDoctorPage extends PageObject {
    public static final Target LINK_ADD_DOCTOR = Target.the("")
            .located(By.cssSelector("a[href='addDoctor']"));
    public static final Target INPUT_NAME = Target.the("")
            .located(By.id("name"));
    public static final Target INPUT_LAST_NAME = Target.the("")
            .located(By.id("last_name"));
    public static final Target INPUT_TELEPHONE = Target.the("")
            .located(By.id("telephone"));
    public static final Target SELECT_ID_TYPE = Target.the("")
            .located(By.id("identification_type"));
    public static final Target INPUT_ID = Target.the("")
            .located(By.id("identification"));
    public static final Target BUTTON_SAVE = Target.the("")
            .located(By.cssSelector("a[class='btn btn-primary pull-right']"));
}
