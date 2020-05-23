import config.Config;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks{	
	@Before
	public void beforeScenario(Scenario scenario) throws Throwable {		
		Config.getWebDriverMobile().manage().window().maximize();
	}
	
	@After
	public void afterScenario(Scenario scenario) throws Throwable {
		Config.quitWebDriverMobile();
	}	
}