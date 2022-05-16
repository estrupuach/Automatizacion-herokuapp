package co.com.automatization.herokuapp.tasks;

import co.com.automatization.herokuapp.userinterfaces.HerokuappPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {

    private HerokuappPage herokuappPage;

    public static OpenUp thePageHerokuapp() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(herokuappPage));
    }
}
