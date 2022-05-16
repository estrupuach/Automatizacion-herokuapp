package co.com.automatization.herokuapp.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ResponseDoctorPage extends PageObject {
    public static final Target RESPONSE_MESSAGE = Target.the("")
            .located(By.xpath("//p[contains(.,'Datos guardados correctamente.')]"));
}
