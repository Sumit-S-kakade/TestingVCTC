package com.sauceDemo.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngAssertions 
{
	@Test
	public void methodLogin()
	{
		String actualTitle = "Swag Labs";
		String expectedTitle = "Labs";
		 Assert.assertEquals(actualTitle, expectedTitle,"URL not matched");
        String actualURL = "URl1";
		String expectedURL = "URL1";
        Assert.assertEquals(actualURL, expectedURL,"URL not matched");
	}
        
        @Test
        public void methodLogOut()
        {
        	Assert.assertTrue(true);
        }
        
        
	}
	
	

 
