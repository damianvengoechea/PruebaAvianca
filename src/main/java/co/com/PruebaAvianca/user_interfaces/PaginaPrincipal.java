package co.com.PruebaAvianca.user_interfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.avianca.com/co/es/")
public class PaginaPrincipal extends PageObject {

    public static final Target RESERVA_TU_VUELO = Target.the("Reserva tu vuelo").located(By.id("reservatuvuelo"));
    public static final Target SOLO_IDA = Target.the("Solo ida").locatedBy("//*[@id='tab-navigation-1']/li[2]/a");
    public static final Target ORIGEN = Target.the("Seleccionar origen").locatedBy("//*[contains(@id,'pbOrigen_2_')]");
    public static final Target DESTINO = Target.the("Seleccionar destino").locatedBy("//*[contains(@id,'pbDestino_2_')]");
    public static final Target FECHA_IDA = Target.the("Seleccionar fecha de ida").locatedBy("//input[@name='pbFechaIda' and (contains(@id,'pbFechaIda_2_'))]");
    public static final Target FECHA_IDA_DIA = Target.the("Seleccionar fecha de ida").locatedBy("//div/form/div/div[2]/div/div/div[2]/fieldset/div/div/div[3]/div[1]/table/tbody/tr/td[1]/div[3]/table/tbody/tr[3]/td[3]/div");
    //public static final Target FECHA_IDA_DIA = Target.the("Seleccionar fecha de ida").locatedBy("//div[@data-space='ida_regreso']//td[@class='cal1']/div[3]//tr[3]/td[3]");
    //public static final Target FECHA_IDA_DIA = Target.the("Seleccionar fecha de ida").locatedBy("//div[@class='bookingflow not-initial calendar_ida bookingflow-tarifas c_pbFechaIda_2_2128097367 new-pad']//td[@class='cal1']/div[3]//tr[3]/td[3]/div");
    public static final Target BOTON_CONTINUAR = Target.the("Boton continuar dentro de pasajeros").locatedBy(" //div[@class='passenger float' ]/button[1]");
    public static final Target BOTON_MAS_ADULTO = Target.the("Adicionar un Adulto").locatedBy(" //div[@class='passenger float' ]/div[2]/div[@class='number']/div[3]");
    public static final Target BOTON_MAS_NINIOS = Target.the("Adicionar un niño").locatedBy(" //div[@class='passenger float' ]/div[3]/div[@class='number']/div[3]");
    public static final Target BOTON_MAS_BEBES = Target.the("Adicionar un bebe").locatedBy(" //div[@class='passenger float' ]/div[4]/div[@class='number']/div[3]");
    public static final Target BOTON_BUSCAR_VUELOS = Target.the("Boton para buscar vuelos").locatedBy(" //div[@class='col-xs-12 campo-pasajerosboton col-sm-12 col-md-5 new-margin-l-booking new-margin-r-booking comoViajas-container']//div[@class='row']/div[4]/button");

}
