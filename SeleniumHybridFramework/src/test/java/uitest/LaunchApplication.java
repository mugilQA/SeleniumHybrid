package uitest;

import static org.testng.Assert.assertEquals;

import java.net.HttpURLConnection;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseTest;

public class LaunchApplication extends BaseTest {

	WebDriver driver;

	@Test(enabled = true)
	public void login() { // TODO Auto-generated method stub

		loginpage.launch("standard_user", "secret_sauce");
		String pagetitle = driver.getTitle();
		String expectedtitle = "Swag Labs";
		Assert.assertEquals(pagetitle, expectedtitle);

	}

	@Test(enabled = false)
	public void loginfailure() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(1000);
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
		String error = driver.findElement(By.cssSelector("h3")).getText();
		Assert.assertEquals(error, "Epic sadface: Username is required");
	}

	@Test(enabled = false, dependsOnMethods = "login")
	public void logout() {
		login();
		driver.findElement(By.id("react-burger-menu-btn")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Logout"))));

		driver.findElement(By.linkText("Logout")).click();
		
		

	}

}
