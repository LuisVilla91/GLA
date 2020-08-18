package questions.procesoAutomatico;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class CarguePeriodicoQuestion implements Question {

    WebDriver driver = getProxiedDriver();

    @Override
    public Boolean answeredBy(Actor actor) {
        List<WebElement> celdas = driver.findElements(By.cssSelector("span.ng-binding"));
        Iterator<WebElement> iter = celdas.iterator();
        int cont = 0;
        Boolean validacion = false;
        while (iter.hasNext()) {
            cont = cont + 1;
            String valor_celda = iter.next().getText();
            if (cont == 1 && valor_celda.contains("Cargue")) {
                System.out.println(valor_celda);
                validacion = true;
            }
        }
        if(validacion.equals(true)){
            return true;
        }
        else{
            return false;
        }

    }
    public static CarguePeriodicoQuestion Logacciones() {
        return new CarguePeriodicoQuestion();
    }
}

