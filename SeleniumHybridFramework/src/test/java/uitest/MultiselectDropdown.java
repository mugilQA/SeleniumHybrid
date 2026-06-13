package uitest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class MultiselectDropdown {
	
	@Test
	public void multiselect() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://techcanvass.com/Examples/multi-select.html?srsltid=AfmBOoqY2U_mzOu9KSuDJoZMmKOjct-nhH3yCZ_WOM89lHzwlVzbU_L5");
		WebElement multiselect=driver.findElement(By.id("multiselect"));
		Select select=new Select(multiselect);
		if(select.isMultiple()) {
			select.selectByValue("opel");
			select.selectByContainsVisibleText("Audi");
		}
		
		List <WebElement> opt=select.getAllSelectedOptions();
		for (int i=0;i<opt.size();i++) {
			System.out.println
			(opt.get(i).getText());
		}
		
		
	}
	

}
