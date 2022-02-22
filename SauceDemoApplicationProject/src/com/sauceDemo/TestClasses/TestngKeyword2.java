package com.sauceDemo.TestClasses;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TestngKeyword2 
{
	
	@Test
	public void methodA()
	{
		System.out.println("methodA");
		Assert.assertFalse(true);
	}
	
    @Test(dependsOnMethods= {"methodA"})	
    public void methodB()
    {
    	System.out.println("methodB");
    }
    
    @Test(priority = 0)
    public void methodC()
    {
    	System.out.println("MethodC");
    }
    
    @Test
    public void methodD()
    {
    	System.out.println("methodD");
    }
    
    @Test
    public void methodE()
    {
    	System.out.println("methodE");
    }

}
