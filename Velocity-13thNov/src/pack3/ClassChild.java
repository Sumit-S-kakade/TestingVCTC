//Multi Level Inheritance
package pack3;

public class ClassChild extends ClassParent
{
	public void method3()
	{
		System.out.println("Child Class Method");
	}
	
	
	
	

	public static void main(String[] args) 
	{
		
		ClassChild z = new ClassChild ();
		z.method3();
		
		z.method2();
		
		z.method1();
		

	}

}
