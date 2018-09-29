package HandlingJavascriptPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleFileUploadPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "F:\\Akshay Study\\Study IT\\Selenium\\Project Files\\Geckodriver\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.xpath(".//*[@id='fileupload']")).sendKeys("G:\\AkshayPatole_QA_Exp_1.10Years.docx");
	}

}
