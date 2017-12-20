package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class draganddrop {
	
	@Test
	public void dad() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml5_draganddrop");
		
		driver.manage().window().maximize();
		
		String p=driver.getWindowHandle();
		
		Thread.sleep(2000);
		
		driver.switchTo().window(p);
		
		Actions a= new Actions(driver);
		
		driver.switchTo().frame("iframeResult");
		
		//a.dragAndDrop(driver.findElement(By.xpath("//*[@id='drag1']")), driver.findElement(By.xpath("//*[@id='div1']"))).build().perform();
		
		a.clickAndHold(driver.findElement(By.xpath("//*[@id='drag1']"))).moveToElement(driver.findElement(By.xpath("//*[@id='div1']"))).release().build().perform();
		
		//driver.close();
		
	}

}
