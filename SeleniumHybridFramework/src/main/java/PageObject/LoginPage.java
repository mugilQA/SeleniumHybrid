package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	LoginPage loginpage;
	
	By username=By.id("user-name");
	By password=By.id("password");
	By loginbutton=By.id("login-button");
	By errormessage=By.cssSelector("h3");
	By logout=By.id("login_sidebar_link");
			
			
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void launch(String user,String pwd) {
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginbutton).click();
		
	
	}
	
}
