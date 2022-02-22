package samplePack;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listenerPack.listener.class)
public class SampleClassListener 
{
	@Test
	public void method1()
	{
		System.out.println("in method 1");
		Reporter.log("TestPassed",true);
		Assert.assertTrue(true);
	}
	

	@Test
	public void method2()
	{
		System.out.println("in method 2");
		Reporter.log("TestFaild",true);
		Assert.assertTrue(false);
	}
	

	@Test
	public void method3()
	{
		System.out.println("in method 3");
		Reporter.log("TestPassed",true);
		Assert.assertTrue(true);
	}
	

	@Test
	public void method4()
	{
		System.out.println("in method 4");
		Reporter.log("Testfaild",true);
		Assert.assertTrue(false);
	}
	

	@Test(dependsOnMethods="method2")
	public void method5()
	{
		System.out.println("in method 5");
		Reporter.log("TestSkiped",true);
	}

	

}
