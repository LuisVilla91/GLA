package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import ui.ProcesoAutomaticoUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ProcesoAutomaticoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ProcesoAutomaticoUI.EJECUTAR_BTN),
                Click.on(ProcesoAutomaticoUI.ACEPTAR_BTN_MODAL));

    }

    public static Performable Ejecutar(){
        return instrumented(ProcesoAutomaticoTask.class);
    }
}
