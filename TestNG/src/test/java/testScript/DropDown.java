package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown  extends Base{
	@Test
	public void dropDown() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement drop=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select=new Select(drop);
		select.selectByIndex(3);
		}
	@Test
	public void simplealert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alert=driver.findElement(By.xpath("(//button[text()='Click me!'])[1]"));
		alert.click();
		driver.switchTo().alert().accept();
	}
	@Test
	public void confirmAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement confirm=driver.findElement(By.xpath("(//button[text()='Click me!'])[2]"));
		confirm.click();
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
        }
	@Test
	public void promptAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement prompt=driver.findElement(By.xpath("(//button[text()='Click for Prompt Box'])"));
		prompt.click();
		driver.switchTo().alert().sendKeys("varsha");
		driver.switchTo().alert().accept();
		}
	

}
