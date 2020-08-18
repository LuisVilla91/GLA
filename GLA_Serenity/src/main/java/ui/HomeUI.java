package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUI {

    public static final Target USUARIO_LOGEADO_LABEL = Target.the("Debe ver su usuario").located(By.xpath("//*[@id=\"menuSesionIniciada\"]/a"));

}
