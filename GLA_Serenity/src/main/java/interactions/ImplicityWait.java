package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class ImplicityWait implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {

        WebDriver driver = getProxiedDriver();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

    }

    public static Interaction Loading(){
        return instrumented(ImplicityWait.class);
    }
}
