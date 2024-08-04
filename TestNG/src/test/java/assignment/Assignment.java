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
	@Test
		public void webForm() {
			driver.navigate().to("https://formsmarts.com/html-form-example");
			WebElement iframe=driver.findElement(By.xpath("//iframe[@allow='camera; fullscreen; geolocation']"));
			driver.switchTo().frame(iframe);
            WebElement firstname=driver.findElement(By.xpath("//input[@placeholder='Your first name']"));
			firstname.sendKeys("varsha");
            WebElement lastname=driver.findElement(By.xpath("//input[@placeholder='Your last name']"));
			lastname.sendKeys("Eric");
			WebElement email=driver.findElement(By.xpath("//input[@placeholder='Your email address']"));
			email.sendKeys("varshaanna1311@gmail.com");
			WebElement subinquiry=driver.findElement(By.xpath("//select[@aria-required='true']"));
			Select select=new Select (subinquiry);
			select.selectByValue("Support Inquiry");
			WebElement inquiry=driver.findElement(By.xpath("//textarea[@placeholder='Your comment']"));
			inquiry.sendKeys("windows installation problum");
            WebElement continueelement=driver.findElement(By.xpath("//input[@value='Continue →']"));
            continueelement.click();
      }
	@Test
		public void practiceForm() {
		driver.navigate().to("https://www.techlistic.com/p/selenium-practice-form.html");
		WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("varsha");
		WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("eric");
		WebElement gender=driver.findElement(By.id("sex-1"));
		gender.click();
		WebElement exp=driver.findElement(By.id("exp-2"));
		exp.click();
		WebElement date=driver.findElement(By.xpath("//input[@id='datepicker']"));
		date.sendKeys("27-3-2024");
		WebElement profession=driver.findElement(By.xpath("(//input[@name='profession'])[2]"));
		//profession.click();
		WebElement tool=driver.findElement(By.xpath("//input[@id='tool-2']"));
		tool.click();
		WebElement continent=driver.findElement(By.xpath("//select[@id='continents']"));
		Select select=new Select(continent);
		select.selectByIndex(3);
		WebElement comment=driver.findElement(By.xpath("//select[@id='selenium_commands']"));
		Select select1=new Select(comment);
		select1.selectByIndex(3);
		WebElement image=driver.findElement(By.xpath("//input[@id='photo']"));
		image.sendKeys("C:\\Users\\DELL\\Downloads.jpg");
		WebElement submit=driver.findElement(By.xpath("//button[@id='submit']"));
		submit.click();
	}
	@Test
		public void roboForm() {
		driver.navigate().to("https://www.roboform.com/filling-test-all-fields");
		WebElement title=driver.findElement(By.xpath("//input[@name='01___title']"));
		title.sendKeys("mrs");
		WebElement firstname =driver.findElement(By.xpath("//input[@name='02frstname']"));
		firstname.sendKeys("varsha");
		WebElement middlename  =driver.findElement(By.xpath("//input[@name='03middle_i']"));
		middlename.sendKeys("anna");
		WebElement lastname  =driver.findElement(By.xpath("//input[@name='04lastname']"));
		lastname.sendKeys("eric");
		WebElement fullname =driver.findElement(By.xpath("//input[@name='04fullname']"));
		fullname.sendKeys("varsha anna eric");
		WebElement company =driver.findElement(By.xpath("//input[@name='05_company']"));
		company.sendKeys("global");
		WebElement position =driver.findElement(By.xpath("//input[@name='06position']"));
		position.sendKeys("tester");
		WebElement addressline1 =driver.findElement(By.xpath("//input[@name='10address1']"));
		addressline1.sendKeys("Ab nagar");
		WebElement addressline2 =driver.findElement(By.xpath("//input[@name='11address2']"));
		addressline2.sendKeys("thrissur");
		WebElement city =driver.findElement(By.xpath("//input[@name='13adr_city']"));
		city.sendKeys("irinjalakuda");
		WebElement state =driver.findElement(By.xpath("//input[@name='14adrstate']"));
		state.sendKeys("kerala");
		WebElement country =driver.findElement(By.xpath("//input[@name='15_country']"));
		country.sendKeys("india");
		WebElement zip =driver.findElement(By.xpath("//input[@name='16addr_zip']"));
		zip.sendKeys("1234");
		WebElement homephone =driver.findElement(By.xpath("//input[@name='20homephon']"));
		homephone.sendKeys("123456789");
		WebElement workphone =driver.findElement(By.xpath("//input[@name='21workphon']"));
		workphone.sendKeys("143535677");
		WebElement fax =driver.findElement(By.xpath("//input[@name='22faxphone']"));
		fax.sendKeys("+190788667");
		WebElement cellphone =driver.findElement(By.xpath("//input[@name='23cellphon']"));
		cellphone.sendKeys("+48067889");
		WebElement email =driver.findElement(By.xpath("//input[@name='24emailadr']"));
		email.sendKeys("varsha@gmail.com");
		WebElement website =driver.findElement(By.xpath("//input[@name='25web_site']"));
		website.sendKeys("www.varsha.com");
		WebElement userid  =driver.findElement(By.xpath("//input[@name='30_user_id']"));
		userid.sendKeys("ID12345");
		WebElement password =driver.findElement(By.xpath("//input[@name='31password']"));
		password.sendKeys("Varsha@17");
		WebElement  creditcard =driver.findElement(By.xpath("//select[@name='40cc__type']"));
		Select select=new Select(creditcard);
		select.selectByIndex(2);
		WebElement creditnum =driver.findElement(By.xpath("//input[@name='41ccnumber']"));
		creditnum.sendKeys("12121212");
		WebElement creditverification  =driver.findElement(By.xpath("//input[@name='43cvc']"));
		creditverification.sendKeys("12345");
		WebElement expirydate  =driver.findElement(By.xpath("//select[@name='42ccexp_mm']"));
		Select select1=new Select(expirydate);
		select1.selectByIndex(3);
		WebElement expiryyear  =driver.findElement(By.xpath("//select[@name='43ccexp_yy']"));
		Select select2=new Select(expiryyear);
		select2.selectByVisibleText("2024");
		WebElement cardusername  =driver.findElement(By.xpath("//input[@name='44cc_uname']"));
		cardusername.sendKeys("varsha");
		WebElement cardissuebank  =driver.findElement(By.xpath("//input[@name='45ccissuer']"));
		cardissuebank.sendKeys("SBI");
		WebElement customerservicephone  =driver.findElement(By.xpath("//input[@name='46cccstsvc']"));
		customerservicephone.sendKeys("180001800");
		WebElement sex  =driver.findElement(By.xpath("//input[@name='60pers_sex']"));
		sex.sendKeys("female");
		WebElement socialsecuritynum =driver.findElement(By.xpath("//input[@name='61pers_ssn']"));
		socialsecuritynum.sendKeys("1234445");
		WebElement driverlicence  =driver.findElement(By.xpath("//input[@name='62driv_lic']"));
		driverlicence.sendKeys("avg1234");
		WebElement DOBmonth  =driver.findElement(By.xpath("//select[@name='66mm']"));
		Select select3=new Select(DOBmonth);
		select3.selectByIndex(3);
        WebElement DOBday  =driver.findElement(By.xpath("//select[@name='67dd']"));
		Select select4=new Select(DOBday);
		select4.selectByVisibleText("13");
        WebElement DOByear  =driver.findElement(By.xpath("//select[@name='68yy']"));
		Select select5=new Select(DOByear);
		select5.selectByVisibleText("2024");
        WebElement age  =driver.findElement(By.xpath("//input[@name='66pers_age']"));
        age.sendKeys("1");
		WebElement birthplace  =driver.findElement(By.xpath("//input[@name='67birth_pl']"));
		birthplace.sendKeys("thrissur");
		WebElement income  =driver.findElement(By.xpath("//input[@name='68__income']"));
		income.sendKeys("15000");
		WebElement customemsg  =driver.findElement(By.xpath("//input[@name='71__custom']"));
		customemsg.sendKeys("good");
        WebElement comment  =driver.findElement(By.xpath("//input[@name='72__commnt']"));
        comment.sendKeys("ABC");
		WebElement reset  =driver.findElement(By.xpath("//input[@value='Reset']"));
		reset.click();



		
		





		
		
		




		





















		






			
		}

		
		
		

		

		
		
		

		
		
		
	}
	
	
	
	
	



