package co.com.PruebaAvianca.stepdefinitions;

import co.com.PruebaAvianca.tasks.AbrirElNavegador;
import co.com.PruebaAvianca.tasks.ReservaTuVuelo;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class BuscarVueloStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver herBrowser;

    private Actor damian = Actor.named("Damian");

    @Before
    public void setUp() {
        damian.can(BrowseTheWeb.with(herBrowser));
    }

    @Dado("^que Damian esta en la pagina de avianca$")
    public void queDamianEstaEnLaPaginaDeAvianca() {
        damian.wasAbleTo(AbrirElNavegador.en());

    }

    @Cuando("^realiza la busqueda de la reserva del vuelo de ida de (.*) a (.*)$")
    public void realizaLaBusquedaDeLaReservaDelVueloDeIda(String origen, String destino ) {
        damian.attemptsTo(ReservaTuVuelo.origenDestino(origen, destino));
    }

    @Entonces("^podra visualizar la tarifa del vuelo$")
    public void podraVisualizarLaTarifaDelVuelo() {

    }
}
