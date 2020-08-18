package tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;
import ui.HomeUI;
import ui.LoginUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTask implements Task {

    private final String user;
    private final String pass;

    public LoginTask(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(user).into(LoginUI.USERNAME_INPUT),
            Enter.theValue(pass).into(LoginUI.PASSWORD_INPUT),
                Click.on(LoginUI.SUBMIT_BUTTON));


    }
    public static  Performable Login(String user, String pass){
        return instrumented(LoginTask.class, user, pass);
    }

}
