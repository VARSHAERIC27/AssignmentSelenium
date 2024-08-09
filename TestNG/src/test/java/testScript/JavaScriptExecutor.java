package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecutor extends Base{
	@Test
	public void javaScriptExecutor() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,150)","");
		//js.executeScript("window.scrollBy(0,-150)","");
		driver.navigate().to("https://www.amazon.in/");
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		//driver.navigate().to("https://www.amazon.in/");
		//WebElement amazone=driver.findElement(By.id("nav-search-submit-button"));
		//js.executeScript("arguments[0].click;",amazone );

		
	}

}