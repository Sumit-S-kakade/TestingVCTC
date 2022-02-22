package basicJavaProgram;

public class ConstructorProgram1 
{
	
	int a;
	int b;
//	Program--compilation + execution
	ConstructorProgram1()    // 1st without argument
	{
		a = 10;
		b = 20;
	}
	
	ConstructorProgram1(int a)  //// 1st with argument
	{
		a = 50;
		b = 60;
	}
	
	ConstructorProgram1(double b)  //// 1st with argument -not possible
	{
		a = 50;
		b = 60;
	}
	
	ConstructorProgram1(char a)  //// 2nd with argument
	{
		a = 500;
		b = 600;
	}
	
	ConstructorProgram1(int c,int d,int e)  //// 3rd with argument
	{
		a = c;
		b = d;
	}
	
	
	

	public static void main(String[] args)
	{
		
		
		
		
		
		
		
		
		
		
		
	}

}
