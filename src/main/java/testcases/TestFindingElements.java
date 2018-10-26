package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestFindingElements {
public WebDriver driver;

	//public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/config/login?.src=fpctx&.intl=us&.lang=en-US&.done=https%3A%2F%2Fwww.yahoo.com");
	    driver.manage().window().maximize();
	}
	
	@Test
	public void Sample() throws InterruptedException {
		
		WebElement username=driver.findElement(By.id("login-username"));
		username.sendKeys("amithachidurala91@gmail.com");
		
        WebElement nextBtn=driver.findElement(By.id("login-signin"));
        //nextBtn.sendKeys("faceboojk");
        //WebElement nextBtn=driver.findElement(By.xpath("//input[@id='login-signin']"));
        nextBtn.click();
        WebElement error=driver.findElement(By.xpath("//p[contains(@id,'username-error')]"));
        System.out.println(error.getText());
       	Thread.sleep(2000);
	}
	@AfterTest
	public void tearDown()
	{
       	driver.close();
	}   
}
	


