package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "F:\\Akshay Study\\Study IT\\Selenium\\Project Files\\Geckodriver\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		takeScreenshot("facebook-Home Page");
		
	}
		public static void takeScreenshot(String fileName) throws IOException {
			//1. Take Screenshot and store it as a file format.
			File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			//2. Now copy the file/screenshot in desired location using copyfile method.
			FileHandler.copy(file, new File("F:\\Akshay Study\\Study IT\\Java Training\\Selenium\\src\\Screenshot\\"+fileName+".jpg"));
			
	}

}
