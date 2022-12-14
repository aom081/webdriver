package google;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class googletest {

	@Test
	void test() throws Exception {
		WebDriver driver = null;
		String browser = "edge";
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chome.diver","D:\\chomedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.diver","D:\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edgeo.diver","D:\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("npru");
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.quit();
	}

}
