package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProcesoAutomaticoUI {
    public static final Target EJECUTAR_BTN = Target.the("El usuario presiona el botón ejecutar").located(By.xpath("//*[@id=\"wrapper\"]/div/div/div[2]/div[3]/div[3]/div/a[1]"));
    public static final Target ACEPTAR_BTN_MODAL = Target.the("El usuario presiona Aceptar").located(By.xpath("/html/body/div[1]/div/div/div/div[3]/button"));
}
