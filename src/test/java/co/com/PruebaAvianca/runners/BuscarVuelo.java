package co.com.PruebaAvianca.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/buscar_vuelo.feature",
        glue = "co.com.PruebaAvianca.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class BuscarVuelo {
}

