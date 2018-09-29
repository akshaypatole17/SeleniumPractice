package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	//1 //4 //7
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "F:\\Akshay Study\\Study IT\\Selenium\\Project Files\\Chromedriver\\Chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	//2
	@Test
	public void googleTitle() {
		String Title = driver.getTitle();
		System.out.println(Title);
	}
	//5
	@Test
	public void googleLogoTest() {
		Boolean b = driver.findElement(By.xpath(".//*[@id='hplogo']/a/img")).isDisplayed();
	}
	//8
	@Test
	public void mailLinkTest() {
		boolean b = driver.findElement(By.linkText("Mail")).isDisplayed();
	}
	//3 //6 //9
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	

}
