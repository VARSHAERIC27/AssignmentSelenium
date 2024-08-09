package testScript;

import org.testng.annotations.Test;

public class TestProgram extends Base {
	@Test(priority=1)
public void test1() {
	System.out.println("automation");
}
	@Test(priority=2)
	public void show() {
		System.out.println("selenium");
	}
	@Test(priority=3)
	public void display() {
		System.out.println("testing");

	}
	

}
