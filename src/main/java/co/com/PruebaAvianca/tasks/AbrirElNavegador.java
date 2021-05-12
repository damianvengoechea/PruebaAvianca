package co.com.PruebaAvianca.tasks;

import co.com.PruebaAvianca.user_interfaces.PaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirElNavegador implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(new PaginaPrincipal()));
    }

    public static AbrirElNavegador en() {
        return instrumented(AbrirElNavegador.class);
    }


}
