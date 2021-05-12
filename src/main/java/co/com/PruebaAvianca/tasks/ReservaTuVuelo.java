package co.com.PruebaAvianca.tasks;

import co.com.PruebaAvianca.user_interfaces.PaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromElement;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ReservaTuVuelo implements Task {

    private String origen;
    private String destino;

    public ReservaTuVuelo(String origen, String destino) {
        this.origen = origen;
        this.destino = destino;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Click.on(PaginaPrincipal.RESERVA_TU_VUELO),
                Click.on(PaginaPrincipal.SOLO_IDA),
                Click.on(PaginaPrincipal.ORIGEN),
                Enter.theValue(origen).into(PaginaPrincipal.ORIGEN),
                Hit.the(Keys.ARROW_DOWN).keyIn(PaginaPrincipal.ORIGEN),
                Hit.the(Keys.ENTER).keyIn(PaginaPrincipal.ORIGEN),
                Click.on(PaginaPrincipal.DESTINO),
                Enter.theValue(destino).into(PaginaPrincipal.DESTINO),
                Hit.the(Keys.ARROW_DOWN).keyIn(PaginaPrincipal.DESTINO),
                Hit.the(Keys.ENTER).keyIn(PaginaPrincipal.DESTINO),
                Click.on(PaginaPrincipal.FECHA_IDA),
                Click.on(PaginaPrincipal.FECHA_IDA_DIA),
                Hit.the(Keys.TAB).keyIn(PaginaPrincipal.FECHA_IDA),
                Click.on(PaginaPrincipal.BOTON_MAS_ADULTO),
                Click.on(PaginaPrincipal.BOTON_MAS_NINIOS),
                Click.on(PaginaPrincipal.BOTON_MAS_BEBES),
                Click.on(PaginaPrincipal.BOTON_CONTINUAR),
                Click.on(PaginaPrincipal.BOTON_BUSCAR_VUELOS)



        );
       /* try {
            Thread.sleep(17000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }

    public static ReservaTuVuelo origenDestino(String origen, String destino) {
        return instrumented(ReservaTuVuelo.class,origen, destino);
    }
}
