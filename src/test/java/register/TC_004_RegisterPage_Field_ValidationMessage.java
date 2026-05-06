package register;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_004_RegisterPage_Field_ValidationMessage {
	
	@Test
	public void verifyRegisrationMessageSuccessAccountcreated() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		Thread.sleep(3000);
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(3000);
		
		//driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//input[@value=\"Continue\"]")).click();
		
        String expectedHead_FirstName = "First Name must be between 1 and 32 characters!";
		
		String actualHead_FirstName = driver.findElement(By.xpath("//div[contains(text(),'First Name must be between 1 and 32 characters!')]")).getText();
		
		System.out.println(actualHead_FirstName);
		
		Assert.assertEquals(expectedHead_FirstName, actualHead_FirstName);

        String expectedHead_LastName = "Last Name must be between 1 and 32 characters!";
		
		String actualHead_LastName = driver.findElement(By.xpath("//div[contains(text(),'Last Name must be between 1 and 32 characters!')]")).getText();
		
		System.out.println(actualHead_LastName);
		
		Assert.assertEquals(expectedHead_LastName, actualHead_LastName);
		
        String expectedHead_Email = "E-Mail Address does not appear to be valid!";
		
		String actualHead_Email = driver.findElement(By.xpath("//div[contains(text(),'E-Mail Address does not appear to be valid!')]")).getText();
		
		System.out.println(actualHead_Email);
		
		Assert.assertEquals(expectedHead_Email, actualHead_Email);
		
        String expectedHead_Telephone = "Telephone must be between 3 and 32 characters!";
		
		String actualHead_Telephone = driver.findElement(By.xpath("//div[contains(text(),'Telephone must be between 3 and 32 characters!')]")).getText();
		
		System.out.println(actualHead_Telephone);
		
		Assert.assertEquals(expectedHead_Telephone, actualHead_Telephone);
		
        String expectedHead_Password = "Password must be between 4 and 20 characters!";
		
		String actualHead_Password = driver.findElement(By.xpath("//div[contains(text(),'Password must be between 4 and 20 characters!')]")).getText();
		
		System.out.println(actualHead_Password);
		
		Assert.assertEquals(expectedHead_Password, actualHead_Password);
		
        String expectedHead_Warning = "Warning: You must agree to the Privacy Policy!";
		
		String actualHead_Warning = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		
		System.out.println(actualHead_Warning);
		
		Assert.assertEquals(expectedHead_Warning, actualHead_Warning);
		
	}
}
