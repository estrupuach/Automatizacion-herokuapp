package co.com.automatization.herokuapp.questions;

import co.com.automatization.herokuapp.userinterfaces.ResponseAppointmentPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ResponseAppointment implements Question<Boolean> {
    private String messageToValidate;

    public ResponseAppointment(String messageToValidate) {
        this.messageToValidate = messageToValidate;
    }

    public static ResponseAppointment inTheWindow(String save) {
        return new ResponseAppointment(save);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String response = Text.of(ResponseAppointmentPage.RESPONSE_MESSAGE).viewedBy(actor).asString();
        if(response.equals(messageToValidate))
            return true;
        else
            return false;
    }
}
