package stepDefinition.procesoAutomatico;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import interactions.ImplicityWait;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.procesoAutomatico.CarguePeriodicoQuestion;
import tasks.ProcesoAutomaticoTask;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.is;

public class ProcesoAutomaticoSteps {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        ImplicityWait.Loading();
    }

    @Given("^El administrador entra la seccion proceso automatico$")
    public void el_administrador_entra_la_seccion_proceso_automatico()  {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        theActorCalled("Admin").attemptsTo(Open.url("http://pragmacero01:8017/#/procesoautomatico"));
        theActorCalled("Admin").attemptsTo(Open.url("http://pragmacero01:8017/#/procesoautomatico"));
    }


    @When("^Ejecuta el proceso automatico$")
    public void ejecuta_el_proceso_automatico() {
        theActorCalled("Admin").attemptsTo(ProcesoAutomaticoTask.Ejecutar());
    }

    @Then("^Debe ver la información cargada$")
    public void debe_ver_la_información_cargada() {
        theActorCalled("Admin").attemptsTo(Open.url("http://pragmacero01:8017/#/logacciones"));

        theActorInTheSpotlight().should(seeThat(CarguePeriodicoQuestion.Logacciones(),is(true)));


    }

}
