package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "F:\\Akshay Study\\Study IT\\Selenium\\Project Files\\Chromedriver\\Chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	
	@Test()
	public void googleTitle() {
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Assert.assertEquals(Title, "Google123", "Title is not matched.");
	}
	
	@Test()
	public void googleLogoTest() {
		Boolean b = driver.findElement(By.xpath(".//*[@id='hplogo']/a/img")).isDisplayed();
		Assert.assertTrue(b);
		//Assert.assertEquals(b, true);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
