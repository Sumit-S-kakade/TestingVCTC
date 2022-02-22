//MethodOverloading

package basicJavaProgram;

public class MethodOverloading 
{
//	Static Method Creation
	public static void method1()
	{
		System.out.println("StaticMethod - Hii");
	}
	
	public static void method1(int a)
	{
		System.out.println("StaticMethod-Hello");
	}
	
	public static void method1(int a ,int b)
	{
		System.out.println("StaticMethod-Bye");
	}
	
//	NonStatic Method Creation
	public void method2()
	{
		System.out.println("NonStatic-Hi");
	}
	
	public void method2(int a)
	{
		System.out.println("NonStatic-Hello");
	}
	
	public void method2(int a, int b)
	{
		System.out.println("NonStatic-Bye");
	}
	
	

	public static void main(String[] args) 
	{
        //Call for static method
		method1();
		method1(5);
		method1(5,5);
		
		//Call for non static method
		
		MethodOverloading x = new MethodOverloading ();  //object creating
		x.method2();
		x.method2(5);
		x.method2(5, 5);
				
		
		
		
		
	}

}
