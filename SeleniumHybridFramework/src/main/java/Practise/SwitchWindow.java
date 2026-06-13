package Practise;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SwitchWindow {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
driver.switchTo().newWindow(WindowType.TAB);
driver.get("https://www.saucedemo.com/");
Set<String> windows=driver.getWindowHandles();
Iterator<String> it=windows.iterator();
if(it.hasNext()) {
	System.out.println(it.next());
}

TakesScreenshot screen=(TakesScreenshot)driver;
File src=screen.getScreenshotAs(OutputType.FILE);
File desfile=new File("C:\\SeleniumWorkspace26\\SeleniumHybridFramework\\test-output\\Screenshots\\screenshot.png");
Files.copy(src, desfile);
	}

}
