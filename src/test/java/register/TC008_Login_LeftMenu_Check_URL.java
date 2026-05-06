package register;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC008_Login_LeftMenu_Check_URL {
	
	@Test
	public void verifyRegisrationSuccessfully() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		Thread.sleep(1000);
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("input-email")).sendKeys("sumank1702@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		driver.findElement(By.xpath("//a[normalize-space()='Edit Account']")).click();
		
        //String expectedHeading = "My Account Information";        //My Account
		
		//String actualHeading = driver.findElement(By.xpath("//h1[normalize-space()='My Account Information']")).getText();
		
		//System.out.println(actualHeading);
		
		//Assert.assertEquals(actualHeading, expectedHeading);
		
		String actualURL = driver.getCurrentUrl();

        if (actualURL.contains("ABCDroute=account/edit")) {
      
            System.out.println("My Account Information");
        } else {
            System.out.println("Verification failed");
        }
		
}
}
