package basicJavaProgram;

public class MethodOverloadingExample 
{

	static int add(int a, int b)
	{
		return a+b;
	}
	
	static int add(int a , int b , int c)
	{
		return a+b+c;
	}
	
	
	
	
	public static void main(String[] args) 
	{
		
		System.out.println(MethodOverloadingExample.add(11, 11));
		
	   System.out.println( MethodOverloadingExample .add(11, 11, 11));
	}

}
