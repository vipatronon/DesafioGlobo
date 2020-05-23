package config;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Config {
	private static WebDriver driver = null;
	private static WebDriver driverMobile = null;
	
	/**getWebDriver
	 * : retorna a instancia ativa do webdriver. caso nao esteja disponivel, inicia uma nova
	 * @return webDriver
	 */
	public static WebDriver getWebDriver(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\lib\\chromedriver.exe");
		if (driver == null){
			driver = new ChromeDriver(); 
		}
		return driver;
	}
	
	/**getWebDriverMobile
	 * : retorna a instancia ativa do webdriver emulando um mobile. caso nao esteja disponivel, inicia uma nova
	 * @return webDriver
	 */
	public static WebDriver getWebDriverMobile(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\lib\\chromedriver.exe");
		if (driverMobile == null){
			Map<String, String> mobileEmulation = new HashMap<String, String>();
			mobileEmulation.put("deviceName", "Nexus 5X");

			Map<String, Object> chromeOptions = new HashMap<String, Object>();
			chromeOptions.put("mobileEmulation", mobileEmulation);
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);	
			driverMobile = new ChromeDriver(capabilities);
			//driverMobile.manage().window().maximize();
		}
		
		return driverMobile;
	}
	
	/**quitWebDriver
	 * : encerra a sessao ativa do browser
	 */
	public static void quitWebDriver (){
		getWebDriver().quit();
		driver = null;
	}
	
	/**quitWebDriver
	 * : encerra a sessao ativa do browser emulando um mobile
	 */
	public static void quitWebDriverMobile (){
		getWebDriverMobile().quit();
		driverMobile = null;
	}
}
