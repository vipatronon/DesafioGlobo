import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber; 

@RunWith(Cucumber.class) 
@CucumberOptions(monochrome = true, snippets = SnippetType.CAMELCASE,
				features = "C:\\DesafioQualidade\\src\\main\\resource\\features\\Desafio2.feature",
				plugin = { "json:target/surefire-reports/cucumber.json"})

public class RunTest { }