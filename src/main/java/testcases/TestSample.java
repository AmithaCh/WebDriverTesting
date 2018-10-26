package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSample {
public WebDriver driver;

	@BeforeTest
	public void setUp()
	{
		
     driver = new ChromeDriver();
     driver.navigate().to("http://gmail.com");
     //driver.navigate().forward();
     driver.manage().window().fullscreen();
	}
     //System.out.println(driver.getPageSource());
     //System.out.println(driver.getWindowHandle());
     //System.out.println(driver.getTitle());
	@Test
	public void verifyTitle()
	{
     String actual_title=driver.getTitle();
     System.out.println(actual_title.length());
     String expected_title="Gmail";
     
     if(actual_title.equals(expected_title)) {
    	 System.out.println("test case pass");
     }
     else {
    	 System.out.println("test case fail");
     }
	}
	@AfterTest
	public void tearDown()
	{
    driver.close();
     //driver.quit();
	}
	
	

}
