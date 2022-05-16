package co.com.automatization.herokuapp.questions;

import co.com.automatization.herokuapp.userinterfaces.ResponsePatientPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ReponsePatient implements Question<Boolean> {
    private String menssageToValidate;

    public ReponsePatient(String menssageToValidate) {
        this.menssageToValidate = menssageToValidate;
    }

    public static ReponsePatient inTheWindow(String save) {
        return new ReponsePatient(save);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String response = Text.of(ResponsePatientPage.RESPONSE_MESSAGE).viewedBy(actor).asString();
        if(response.equals(menssageToValidate))
            return true;
        else
            return false;
    }
}
