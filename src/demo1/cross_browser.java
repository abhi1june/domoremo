package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class cross_browser {
	
	@Test
	@Parameters("browser")
	public  void do_something(String s){
		
		if(s.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.gecko.driver", ".\\geckodriver.exe");
			WebDriver driver= new FirefoxDriver();
			DesiredCapabilities capabilities1=DesiredCapabilities.firefox();
			capabilities1.setCapability("marionette", true);
			
			FirefoxOptions op= new FirefoxOptions();
			op.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
			
			DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability("moz:firefoxOptions", op);
			driver.get("https://www.google.com");
		}
		else if(s.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com");
			
		}
		
	}

}
