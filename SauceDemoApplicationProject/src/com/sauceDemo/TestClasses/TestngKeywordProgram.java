package com.sauceDemo.TestClasses;

import org.testng.annotations.Test;

public class TestngKeywordProgram 
{
	@Test(priority = -1)
	public void methodA()
	{
		System.out.println("method A");
	}
	
	@Test(invocationCount=2,priority = 0)
	public void methodB()
	{
		System.out.println("method B");
	}
	
	@Test(priority=1)
	public void methodC()
	{
		System.out.println("methodC");
	}
	
	@Test(enabled = false)
	public void methodD()
	{
		System.out.println("method D");
	}
	
	@Test
	public void methodE()
	{
		System.out.println("methodE");
	}
	
	

}
