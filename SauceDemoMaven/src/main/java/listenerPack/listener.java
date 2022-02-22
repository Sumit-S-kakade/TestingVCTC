package listenerPack;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listener implements ITestListener

{
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("My test is started");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("test case is success");
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("test is failure ");	
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("test is skipped");
	}

}
