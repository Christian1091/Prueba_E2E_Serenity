package prueba.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import prueba.interfaces.CompleteShoppingInterface;

public class CompleteShopping implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CompleteShoppingInterface.btnFinish)
        );
    }
}
