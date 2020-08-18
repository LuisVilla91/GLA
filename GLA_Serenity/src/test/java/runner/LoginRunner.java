package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/Login.feature","src/test/resources/features/ProcesoAutomatico.feature," +
                "src/test/resources/features/AlertasSinAgrupar.feature"},
        glue = "stepDefinition"
        //tags = "@m"
)
public class LoginRunner {

}
