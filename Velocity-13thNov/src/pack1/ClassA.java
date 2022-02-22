package pack1;

public class ClassA 
{
	
	 protected static void method1()
	{
		System.out.println("Static-ClassA-method1");
	}
	
	protected void method2()
	{
		System.out.println("Non Static-ClassA-method2");
	}
	
	
	

	public static void main(String[] args) 
	{
///		Static method1 call //  we can directly call static method in the main method do not require the create object
		
		ClassA.method1();
		 
//		Non Static method1 call //  we can noyt directly call non static method in the main method require the create object
		
		 ClassA a = new ClassA ();
		 a.method2();
		
	}

}
