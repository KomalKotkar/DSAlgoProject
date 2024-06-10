package factory;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import utilities.ConfigReader;



public class DriverFactory {
	public static WebDriver driver;

	public static WebDriver initDriver() {
		
		Properties prop = ConfigReader.init_prop();
		String browser = prop.getProperty("browser");
		if(driver==null) {
			if(browser.equals("chrome")) {
				driver = new ChromeDriver();
			}else if(browser.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			}else if(browser.equalsIgnoreCase("Edge")) {
				driver = new EdgeDriver();
			}
		}
		driver.get(prop.getProperty("URL"));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return driver;
	
	}
	public static WebDriver getDriver() {
		initDriver();
		return driver;

	}

}
