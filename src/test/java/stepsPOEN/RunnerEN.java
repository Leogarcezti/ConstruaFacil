package stepsPOEN;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = {"src/test/resources/featuresPO"}, //Onde estão os cenários Gherkin
        glue = {"stepsPO"},                            //Onde estão as definições de passos
        dryRun = false,                                //Exibição de log
        monochrome = true,                             //Detalhes do log
        plugin = {

                "pretty",                              //Formatação visual do Cucumber
                "html:target/reports/extentreports",   //Saida HTML do Relatório simples
                "json:target/reports/extentreports.json",  //Saida Json com os dados
                //"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/reports/dashboard.html"
        }
)
public class RunnerEN extends AbstractTestNGCucumberTests { //Equivale ao @RunWith do Junit
    // Configuração de modelo de relatório ou de outra caracteristica
}
