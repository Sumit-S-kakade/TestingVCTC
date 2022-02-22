package pack1;

public class ClassB extends ClassA
{
	
	public static void method3()
	{
		System.out.println("static-ClassB-Method3");
	}
	
	public void method4()
	{
		System.out.println("Non Static-ClassB-Method4");
	}
	
	
	

	public static void main(String[] args) 
	{
		
//		1.Normal method calling process  for Static - Method3 call
		ClassB.method3();
		
//		method3();	 
		
		//2.NonStatic Method4 call by creating object
		
		 ClassB b = new  ClassB();
		 b.method4();
		
		 //Static method calling from another class
		 
		 ClassA.method1();
		 
		 
// Normal process -Non static calling from another class
		 ClassA x = new ClassA ();
		 x.method2();
		 
		 //inheritance process-method calling with inheritance (non static)
		 
		 ClassB z = new ClassB();
		 z.method2();
				 
		 
		
		
		
	}

}
