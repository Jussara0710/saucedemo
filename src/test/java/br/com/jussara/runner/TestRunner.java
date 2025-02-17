package br.com.jussara.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/br/com/jussara/features/login.feature", // Caminho para os arquivos de feature
        glue = "br.com.jussara.steps",  // Caminho para as classes de steps
        plugin = {"pretty", "html:target/cucumber-reports.html"}, // Plugins de relatório
        tags = "@successfulLogin" // Filtra e executa apenas o cenário com a tag @successfulLogin
)
public class TestRunner {
}
