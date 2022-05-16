package co.com.automatization.herokuapp.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ResponsePatientPage {
    public static final Target RESPONSE_MESSAGE = Target.the("Capture the status from register")
            .located(By.xpath("//p[contains(.,'Datos guardados correctamente.')]"));
}
