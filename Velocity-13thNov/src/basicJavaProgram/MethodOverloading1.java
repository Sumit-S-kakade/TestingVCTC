package basicJavaProgram;

public class MethodOverloading1 
{
	public static void method1()
	{
		System.out.println("HI");
	}
	public static void method1(int a)
	{
		System.out.println("Hello");
	}
	public static void method1(int a,int b)
	{
		System.out.println("Bye");
	}
	public static void main(String[]args)
	{
		 MethodOverloading1.method1();
		 MethodOverloading1.method1(1);
		 MethodOverloading1.method1(2, 3); 
		
		
		
		
		
		
	}
	
	
	
	

}
