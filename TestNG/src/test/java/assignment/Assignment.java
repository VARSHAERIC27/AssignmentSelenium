package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Assignment extends Base{
	@Test
	public void DoubleAndRightCLICK() {
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
        WebElement rightclick=driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions actions=new Actions(driver);
		actions.contextClick(rightclick).build().perform();
		WebElement doubleclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		actions.doubleClick(doubleclick).build().perform();
		driver.switchTo().alert().accept();
		}
	@Test
	public void MoveElementAction() {
		driver.navigate().to("https://demoqa.com/menu/");
		WebElement menu=driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(menu).build().perform();
		}
	@Test
	public void dragAndDrop() {
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop=driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
		Actions action=new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();
	}
	@Test
	public void registerForm() {
		driver.navigate().to("https://demowebshop.tricentis.com/register");
		WebElement gender=driver.findElement(By.xpath("//input[@id='gender-female']"));
		gender.click();
		WebElement firstname=driver.findElement(By.xpath("//input[@id='FirstName']"));
		firstname.sendKeys("varsha");
		WebElement lastname=driver.findElement(By.xpath("//input[@id='LastName']"));
		lastname.sendKeys("Eric");
		WebElement email=driver.findElement(By.xpath("//input[@id='Email']"));
		email.sendKeys("varshaanna1311@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
		password.sendKeys("AiraKutty@27");
		WebElement confirmpassword=driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
		confirmpassword.sendKeys("AiraKutty@27");
		WebElement register=driver.findElement(By.xpath("//input[@id='register-button']"));
		register.click();
		}
	@Test
	public void checkBox() {
		driver.navigate().to("https://total-qa.com/checkbox-example/#google_vignette");
		WebElement checkbox=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		checkbox.click();
	}
	@Test
	public void iframe() {
		driver.navigate().to("https://www.dezlearn.com/nested-iframes-example/");
		WebElement iframeelement=driver.findElement(By.id("parent_iframe"));
		driver.switchTo().frame(iframeelement);
		WebElement clickelement=driver.findElement(By.xpath("//button[@id='u_5_5']"));
		clickelement.click();
        }
	@Test
	public void dropAndDown() {
		driver.navigate().to("https://www.geodatasource.com/software/country-region-dropdown-menu-demo");
		WebElement country=driver.findElement(By.xpath("//select[@class='form-control gds-cr']"));
		Select select=new Select(country);
		select.selectByIndex(3);
		
		
	}
	@Test
	public void alerts() {
		driver.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");
		WebElement simple=driver.findElement(By.id("alertBox"));
		simple.click();
		driver.switchTo().alert().accept();
		WebElement confirm=driver.findElement(By.id("confirmBox"));
		confirm.click();
		driver.switchTo().alert().accept();
		WebElement prompt=driver.findElement(By.id("promptBox"));
		prompt.click();
		driver.switchTo().alert().sendKeys("varsha");
		driver.switchTo().alert().accept();

		
		
		

		

		
		
		

		
		
		
	}
	
	
	
	
	

}

