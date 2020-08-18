package stepDefinition;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import interactions.ImplicityWait;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import questions.LoginQuestion;
import tasks.LoginTask;

import static org.hamcrest.CoreMatchers.is;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class LoginSteps {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        ImplicityWait.Loading();
    }


    @Given("^El administrador abre la aplicacion$")
    public void elAdministradorAbreLaAplicacion()  {
        theActorCalled("Admin").attemptsTo(Open.url("http://pragmacero01:8017/"));
    }

    @When("^Ingreso (.*) y (.*)$")
    public void ingresoY(String usuario, String contrasena)  {
        theActorCalled("Admin").attemptsTo(LoginTask.Login(usuario,contrasena));

    }

    @Then("^Debo ver mi nombre de usuario (.+)$")
    public void deboVerMiNombreDeUsuario(String nombre){
        theActorInTheSpotlight().should(seeThat(LoginQuestion.usuarioValido(),is(true)));
    }


}
