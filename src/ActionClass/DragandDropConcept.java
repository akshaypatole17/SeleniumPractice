package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "F:\\Akshay Study\\Study IT\\Selenium\\Project Files\\Geckodriver\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		Actions action = new Actions(driver);
		
		action.clickAndHold(driver.findElement(By.xpath(".//*[@id='draggable']/p"))).moveToElement(driver.findElement(By.xpath(".//*[@id='droppable']"))).release().build().perform();
		
		
		
	}

}
