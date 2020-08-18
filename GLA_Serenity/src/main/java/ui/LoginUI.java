package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI {
    public static final Target USERNAME_INPUT = Target.the("Ingresa su usuario").located(By.name("nombreUsuario"));
    public static final Target PASSWORD_INPUT = Target.the("Ingresa su clave").located(By.name("password"));
    public static final Target SUBMIT_BUTTON = Target.the("Presiona el botón iniciar sesión").located(By.xpath("//*[@id=\"wrapper\"]/div/div/div[2]/form/div/div[5]/div/input"));
}
