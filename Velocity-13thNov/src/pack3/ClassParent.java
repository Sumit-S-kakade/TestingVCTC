//Multi Level Inheritance
package pack3;

public class ClassParent extends  ClassGrandParent 
{
	public void method2()
	{
		System.out.println("Parent Class Method");
	}
	
	
	

	public static void main(String[] args) 
	{
		
		ClassParent y = new ClassParent();
		
		y.method2(); //Class Parent Method
		
		y.method1(); //Class Grand Parent Method
		
		
		

	}

}
