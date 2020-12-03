package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	public static WebDriver driver ;

	public static void abreNavegador() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		Driver.driver = new ChromeDriver();
		Driver.driver.manage().window().maximize();			
	}
	
	public static void fechaNavegador() {
		Driver.driver.quit();
	}
}
