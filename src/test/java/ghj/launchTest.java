package ghj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class launchTest {
	
	WebDriver driver;
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	@Test
	void testLogin() throws InterruptedException
	{
		//input[@id='input-password']
		
		 driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("fjigkkog");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("njvrvkcl");//input[@value='Login']
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);//span[normalize-space()='My Account']
}
}