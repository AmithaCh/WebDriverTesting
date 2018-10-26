package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Switch {
	public WebDriver driver;

	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium prerequistes\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.qaclickacademy.com/interview.php");
		System.out.println(driver.getCurrentUrl());
	}
	@Test
	public void switchingTabs()
	{
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		//driver.navigate().back();
		//driver.get("http://gmail.com");
		//driver.navigate().forward();
		//driver.get("http://seleniumhq.org");
		//driver.findElement(By.xpath("//*[@id='identifierNext']/content")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//li[text()=' Appium ']")).click();
		driver.findElement(By.xpath("//li[text()=' Selenium ']")).click();
		driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();
		driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[3]")).click();
		//driver.findElement(By.xpath("//body/section/div/div/div/div/ul/li[1]/following-sibling::li[3]"));
		System.out.println(driver.findElement(By.xpath("//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));
	}
	@AfterTest
	public void tearDown()
	{
    driver.close();
	 
	}




}
