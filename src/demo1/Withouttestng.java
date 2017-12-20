package demo1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Withouttestng {

	
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/selenium/upload/");
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Set<String> allwindows = driver.getWindowHandles();
		int length=allwindows.size();
		for(String win : allwindows){
			System.out.println(win);
			
		}
		
		driver.switchTo().window(parent);
		
		driver.findElement(By.id("uploadfile_0")).sendKeys("F:\\Interview\\learn-automation interviews.docx");

	}

}
