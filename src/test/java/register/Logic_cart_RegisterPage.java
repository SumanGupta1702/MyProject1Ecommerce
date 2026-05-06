package register;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Logic_cart_RegisterPage {
	
	@Test
	public void verifyRegisrationSuccessfully() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("https://logicnextgen.com/projects/logiccart/upload/");
		// Thread.sleep(3000);
		driver.findElement(By.linkText("My Account")).click();
		// Thread.sleep(3000);
		driver.findElement(By.linkText("Register")).click();
		// Thread.sleep(3000);
		
		driver.findElement(By.id("input-firstname")).sendKeys("Suman");
		driver.findElement(By.id("input-lastname")).sendKeys("Gupta");
		//driver.findElement(By.id("input-email")).sendKeys(generateBrandNewEmail());
		driver.findElement(By.id("input-email")).sendKeys("suman" + System.currentTimeMillis() + "@test.com");     //For Auto generate Email
		driver.findElement(By.id("input-password")).sendKeys("12345");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//button[@id='k_kapoor_developer_button']")).click();
		
}
}
