package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTestPriority {
	
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
	@Test(priority=1, groups="Title")
	public void googleTitle() {
		String Title = driver.getTitle();
		System.out.println(Title);
	}
	//5
	@Test(priority=2, groups="Logo")
	public void googleLogoTest() {
		Boolean b = driver.findElement(By.xpath(".//*[@id='hplogo']/a/img")).isDisplayed();
	}
	//8
	@Test(priority=3, groups="LinkTest")
	public void mailLinkTest() {
		boolean b = driver.findElement(By.linkText("Mail")).isDisplayed();
	}
	
	@Test(priority=4, groups="Test")
	public void test1() {
		System.out.println("Test 1");	
	}
	
	@Test(priority=5, groups="Test")
	public void test2() {
		System.out.println("Test 2");	
	}
	
	@Test(priority=6, groups="Test")
	public void test3() {
		System.out.println("Test 3");	
	}
	
	//3 //6 //9
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	

}
