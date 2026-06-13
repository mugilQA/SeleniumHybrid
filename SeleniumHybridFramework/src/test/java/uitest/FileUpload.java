package uitest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUpload {
	WebDriver driver;
	@Test
	public void fileupload() {
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		WebElement filepath = driver.findElement(By.id("file-upload"));
		filepath.sendKeys("C:\\SeleniumWorkspace26\\SeleniumHybridFramework\\src\\test\\java\\Testdata\\IMG_0751.jpeg");
		driver.findElement(By.xpath("//input[@class='button']")).click();
		WebElement msg=driver.findElement(By.tagName("h3"));
		Assert.assertEquals(msg.getText(), "File Uploaded!");
		
	}

	@Test
	public void scrollto() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/documentation/webdriver/");
		WebElement brwo=driver.findElement(By.linkText("Actions API"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(5000);
		js.executeScript("arguments[0].scrollIntoView(true);", brwo);
		brwo.click();
		driver.quit();
	}
}
