 package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion extends Base{
	@Test
	public void assertEqualsTest() {
		driver.navigate().to("https://www.browserstack.com/");
		String actualstring=driver.getTitle();
		System.out.println(actualstring);
		String expectedstring="Most Reliable App & Cross Browser Testing Platform | BrowserStack";
		Assert.assertEquals(actualstring, expectedstring);
		
		}
	@Test
	public void assertNotEqualsTest() {
		driver.navigate().to("https://www.browserstack.com/");
		String actualstring=driver.getTitle();
		System.out.println(actualstring);
		String expectedstring=" Most Reliable App & Cross Browser Testing Platform | BrowserStack";
		Assert.assertNotEquals(actualstring,expectedstring);

		}
	@Test
     public void assertTrueTest() {
 		driver.navigate().to("https://www.browserstack.com/");
 		boolean verifyTite=driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
        Assert.assertTrue(verifyTite);
    	 
	
     }
	@Test
	public void assertFalseTest() {
 		driver.navigate().to("https://www.browserstack.com/");
 		boolean verifytitle=driver.getTitle().equalsIgnoreCase(" Reliable App & Cross Browser Testing Platform | BrowserStack");
        Assert.assertFalse(verifytitle);

		
		
		
	}
	@Test
	public void assertNullTest() {
 		driver.navigate().to("https://www.browserstack.com/");
 		String verifyassert=null;
 		Assert.assertNull(verifyassert);

		}
	@Test
	public void assertNotNull() {
 		driver.navigate().to("https://www.browserstack.com/");
 		boolean verifyassert=driver.getTitle().equalsIgnoreCase(" Reliable App & Cross Browser Testing Platform | BrowserStack");
          Assert.assertNotNull(verifyassert);
		}

	

}

// https://demo.guru99.com/test/simple_context_menu.html
// https://demoqa.com/menu/
//  https://demoqa.com/droppable
//  https://demowebshop.tricentis.com/fiction
//https://www.dezlearn.com/nested-iframes-example/
//https://www.geodatasource.com/software/country-region-dropdown-menu-demo
//https://total-qa.com/checkbox-example/#google_vignette
//https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette

/*test ng provide class-assrtion
validate
condition true execute
false assertion */