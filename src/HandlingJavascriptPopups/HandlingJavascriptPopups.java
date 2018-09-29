package HandlingJavascriptPopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingJavascriptPopups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "F:\\Akshay Study\\Study IT\\Selenium\\Project Files\\Geckodriver\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(5000);
		driver.findElement(By.name("proceed")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		String text = alert.getText();
		if(text.equals("Please enter a valid user name")){
			System.out.println("Test Case is Passed");
		}
		else {
			System.out.println("Test Case is Failed");
		}
		
		alert.accept();
		
		
	}

}
