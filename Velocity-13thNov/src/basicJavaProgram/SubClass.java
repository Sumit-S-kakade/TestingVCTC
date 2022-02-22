package basicJavaProgram;

public class SubClass extends SuperClass
{
	int c = 30;
	int d = 40;
	
	
	public  void method3()
	{
		System.out.println("Method3-non Static-Sub class");
	}
	
	public static void method4()
	{
		System.out.println("Method4-Static-Sub class");
	}
	
	

	public static void main(String[] args) 
	{
		
		//call by non static method
		SubClass y = new SubClass();
		y.method3();
		
		// call by  StatiC method
		
		SubClass.method4();
		
		SuperClass.method2();   //Static- SuperClass -SubClass
		
		SuperClass z = new SuperClass();
		z.method1();
		
		
		
		
		

	}

}
