package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "F:\\Akshay Study\\Study IT\\Selenium\\Project Files\\Geckodriver\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://spicejet.com/");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(".//*[@id='highlight-addons']"))).build().perform();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='header-addons']/ul/li[3]/a")).click();
		
		
		
	}

}
