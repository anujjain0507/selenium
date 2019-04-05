package selenium;

import org.testng.Assert;
import org.testng.annotations.Test;



public class DependencyTestUsingAnnotation {

	String message = "Anuj";
	MessageUtil messageutil = new MessageUtil(message);

	@Test
	public void testprintTestMessage() {
		System.out.println("Inside testprintTestMessage() ");
		message =  "Anuj";
		Assert.assertEquals(message, messageutil.printMessage());
	}
	
	@Test(dependsOnMethods = {"initEnvironmentTest"})
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage() ");
		message =  "Hi!" + "Anuj";
		Assert.assertEquals(message, messageutil.salutationMessage());
	}
	
	@Test
	public void initEnvironmentTest() {
		System.out.println("This is initEnvironmentTest");
	}

}
