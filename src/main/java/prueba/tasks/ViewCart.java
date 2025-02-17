package prueba.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import prueba.interfaces.ViewCartInterface;

public class ViewCart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ViewCartInterface.btnViewCart),
                Click.on(ViewCartInterface.btnCheckout)
        );
    }
}
