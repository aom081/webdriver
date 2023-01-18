import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class test {

	@Test
	void test() throws Exception {
		WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver","D:\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://katalon-demo-cura.herokuapp.com");
		
		//page 1
		driver.findElement(By.id("btn-make-appointment")).click();
		
		//page2
		driver.findElement(By.id("txt-username")).sendKeys("John Doe");
		driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
		driver.findElement(By.id("btn-login")).click();
		
		//page3
		Select optionl = new Select(driver.findElement(By.id("combo_facility")));
		optionl.selectByVisibleText("Hongkong CURA Healthcare Center");
		driver.findElement(By.id("chk_hospotal_readmission")).click();
		WebElement radiol = driver.findElement(By.id("radio_program_none"));
		radiol.click();
		driver.findElement(By.id("txt_visit_date")).sendKeys("18/01/2023");
		driver.findElement(By.id("txt_comment")).sendKeys("Heart");
		driver.findElement(By.id("btn-book-appointment")).click();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
