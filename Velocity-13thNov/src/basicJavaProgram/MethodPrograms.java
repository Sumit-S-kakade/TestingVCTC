package basicJavaProgram;

public class MethodPrograms 
{
	public static void demo1()
	{
		System.out.println("demo1 method non return type method");
	}
	
	
	
	public static void demo2(int a)
	{
	System.out.println("demo2 method with parenthesis");
	}
	
	
	public static void demo3(char a)
	{
	System.out.println("demo3 method with parenthesis with char");
	}
	
	
	public static void demo4(int a ,int b)
	{
	System.out.println("demo4 method with parenthesis ");
	}
	
	
	public static void demo5(int a ,int b)
	{
//		int a=500;
//		int b=500;
		int c= a+b;
	System.out.println("Value of c:"+c);
	}
	
	
	public static int demo6(int c,int d)
	{
	   int x=c-d;
	   return x;
	}
	
	
	public static void demo7 (int c, char d)
	{
	System.out.println("demo7 method");
	}
	
	

	public static void main(String[] args) 
	{
		//ClassName.methodName();
		demo1();
		MethodPrograms .demo1();
		
		
		demo2(10);
		MethodPrograms .demo2(10);
	
		
		demo3('a');
		MethodPrograms .demo3('a');
	
		
		demo4(5,6);
		MethodPrograms .demo4(5,6);
		
		demo5(100,200);
		MethodPrograms .demo5(500,600);
	
		

		MethodPrograms .demo6(10,20);
		
		int z = MethodPrograms .demo6(20,10);
		System.out.println(z);
		
		
		MethodPrograms .demo7(10,'a');
		
		
		
		
		
		
		

	}

}
