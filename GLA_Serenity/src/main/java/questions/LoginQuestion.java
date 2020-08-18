package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import ui.HomeUI;

public class LoginQuestion implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        if (Text.of(HomeUI.USUARIO_LOGEADO_LABEL).viewedBy(actor).asString().equals("Bienvenido(a) : admin")){
            System.out.println((Text.of(HomeUI.USUARIO_LOGEADO_LABEL).viewedBy(actor)).asString());
            return true;
        }
        else {
            System.out.println((Text.of(HomeUI.USUARIO_LOGEADO_LABEL).viewedBy(actor)));
            return false;
        }

    }
    public static LoginQuestion usuarioValido(){
        return new LoginQuestion();
    }
}
