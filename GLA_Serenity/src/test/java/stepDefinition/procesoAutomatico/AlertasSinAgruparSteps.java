package stepDefinition.procesoAutomatico;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import interactions.ImplicityWait;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.ProcesoAutomaticoTask;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class AlertasSinAgruparSteps {

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        ImplicityWait.Loading();
    }

    @Given("^El administrador ingresa en Administracion/proceso automatico$")
    public void el_administrador_ingresa_en_Administracion_proceso_automatico() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        theActorCalled("Admin").attemptsTo(Open.url("http://pragmacero01:8017/#/procesoautomatico"));
        theActorCalled("Admin").attemptsTo(Open.url("http://pragmacero01:8017/#/procesoautomatico"));
    }


    @When("^Ejecutar el proceso automatico$")
    public void ejecutar_el_proceso_automatico() {
        theActorCalled("Admin").attemptsTo(ProcesoAutomaticoTask.Ejecutar());
    }

    @Then("^Debe ver las alertas sin agrupar generadas$")
    public void debe_ver_las_alertas_sin_agrupar_generadas() {


    }

}
