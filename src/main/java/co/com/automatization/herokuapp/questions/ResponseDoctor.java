package co.com.automatization.herokuapp.questions;

import co.com.automatization.herokuapp.userinterfaces.ResponseDoctorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ResponseDoctor implements Question<Boolean> {
    private String messageToValidate;

    public ResponseDoctor(String messageToValidate) {
        this.messageToValidate = messageToValidate;
    }

    public static ResponseDoctor inTheWindow(String save) {
        return new ResponseDoctor(save);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String response = Text.of(ResponseDoctorPage.RESPONSE_MESSAGE).viewedBy(actor).asString();
        if(response.equals(messageToValidate))
            return true;
        else
            return false;
    }
}
