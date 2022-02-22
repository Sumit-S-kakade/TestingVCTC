package pack8;

public class ConcreteClass extends Abstractclass 
{
	@Override
	public void method3() 
	{
		System.out.println("method 3 is complete   concreate class");
		
	}

	
	@Override
	public void method4() 
	{
		System.out.println("method 4 is complete   concreate class");
		
		
	}

	
	

	public static void main(String[] args) 
	{
		ConcreteClass x = new ConcreteClass();
		x.method3();
		x.method4();
		x.method1();
		x.method2();
		
		
		
		
		

	}




	




	
}
