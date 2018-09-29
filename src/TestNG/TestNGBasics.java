package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	/*	@BeforeSuite--Setup system property for chrome
		@BeforeTest--Launch Browser
		@BeforeClass--Login to App
		
		@BeforeMethod--Enter URL
		@Test--googleLogoTest
		@AfterMethod--Logout from App
		
		@BeforeMethod--Enter URL
		@Test--Google Title Test
		@AfterMethod--Logout from App
		
		@BeforeMethod--Enter URL
		@Test--Search Test
		@AfterMethod--Logout from App
		
		@AfterClass--Close Browser
		@AfterTest--Delete All Cookies */
	
	
	//PreCondition starting with @Before
	
	@BeforeSuite //1
	public void setup() {
		System.out.println("@BeforeSuite--Setup system property for chrome");
	}
	
	@BeforeTest //2
	public void launchBrowser() {
		System.out.println("@BeforeTest--Launch Browser");
	}
	
	@BeforeClass //3
	public void login() {
		System.out.println("@BeforeClass--Login to App");
	}
	
	/*
	 * @BeforeMethod
	 * @Test 1
	 * @AfterMethod
	 *
	 * @BeforeMethod
	 * @Test 2
	 * @AfterMethod
	 * 
	 * @BeforeMethod
	 * @Test 3
	 * @AfterMethod
	*/
	
	
	@BeforeMethod //4
	public void enterURL() {
		System.out.println("@BeforeMethod--Enter URL");
	}
	
	//Test Cases Starting with @Test
	@Test //5
	public void googleTitleTest() {
		System.out.println("@Test--Google Title Test");
	}
	
	@Test
	public void searchTest() {
		System.out.println("@Test--Search Test");
	}
	
	@Test
	public void googleLogoTest() {
		System.out.println("@Test--googleLogoTest");
	}
	
	@AfterMethod //6
	public void logout() {
		System.out.println("@AfterMethod--Logout from App");
	}
	
	@AfterClass //7
	public void closeBrowser() {
		System.out.println("@AfterClass--Close Browser");
	}
	
	//Post Condition Staring with @After
	@AfterTest //8
	public void deleteallcookies() {
		System.out.println("@AfterTest--Delete All Cookies");
	}
		
	@AfterSuite //9
	public void generatetestreport() {
		System.out.println("@AfterSuite--Generate Test Report");
	}
}
