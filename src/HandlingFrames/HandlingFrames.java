package HandlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "F:\\Akshay Study\\Study IT\\Selenium\\Project Files\\Geckodriver\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.crmpro.com/index.html");
		driver.findElement(By.xpath(".//*[@id='loginForm']/div/input[1]")).sendKeys("akshaypatole17");
		driver.findElement(By.xpath(".//*[@id='loginForm']/div/input[2]")).sendKeys("test@123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath(".//*[@id='navmenu']/ul/li[4]/a")).click();
	}

}
