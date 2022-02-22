//UpCasting Program
package packageCastingProgram;

public class SubClass extends SuperClass
{
	
	public void method3()
	{
		System.out.println("SubClass- Method3");
	}
	public void method4()
	{
		System.out.println("SubClass-Method4");
	}
	
	public static void main(String[]args)
	{
		//Normal object Calling
		
		//SuperClass
		SuperClass x = new SuperClass();
		x.method1();
		x.method2();
		
		//SubClass
		
		SubClass y = new SubClass();
		y.method3();
		y.method4();
		
		//Inhertance calling
		
		y.method1();
		y.method2();
		
		//Upcasting
		
		SuperClass z = new SubClass();
		z.method1();
		z.method2();
				
		
		
	}
	

}
