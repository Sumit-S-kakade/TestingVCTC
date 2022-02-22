package com.sauceDemo.TestClasses;

import org.testng.annotations.Test;

public class TestngKeywordTimeOut
{
//	TimeOutKeyword
	
	@Test
	public void aMethod()
	{
		System.out.println("MethodA");
	}
	

	@Test(timeOut=2000)
	public void bMethod() throws InterruptedException
	{
		System.out.println("MethodB");
		Thread.sleep(5000);
	}

	@Test
	public void cMethod()
	{
		System.out.println("MethodC");
	}
	

	@Test
	public void dMethod()
	{
		System.out.println("MethodD");
	}
	

	@Test
	public void eMethod()
	{
		System.out.println("MethodE");
	}
	
	
	

}
