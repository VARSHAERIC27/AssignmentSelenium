package testScript;

import java.awt.Desktop.Action;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WindowHandle extends Base{
	@Test
	public void windowHhandle() {
		driver.navigate().to("https://webdriveruniversity.com/");
		WebElement login=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		login.click();
		
		WebElement contact=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contact.click();
	String parent=	driver.getWindowHandle();
	System.out.println("parent " +parent);
	Set<String> allwindows=driver.getWindowHandles();
	for(String temp:allwindows) {
		if(!temp.equals(parent)) {
		System.out.println("window "+temp);
		driver.switchTo().window(temp);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		}
	}}
	@Test
	public void action() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drageelement=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		
		WebElement dropeelement=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(dropeelement).build().perform();
	//actions.doubleClick(drageelement).build().perform();
		//actions.contextClick(drageelement).build().perform();
		actions.dragAndDrop(drageelement, dropeelement).build().perform();
		


		

	}
	@Test
	public void frame() {
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		WebElement frameelement=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(frameelement);
		WebElement element=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		element.click();

		

		
	}

}
