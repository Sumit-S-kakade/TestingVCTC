//Method Overriding
package pack6;

public class SubClass extends SuperClass 
{
	
public void demo()
{ 
	System.out.println("Hello-SubClass");
	}
public void demo2()
{
	System.out.println("demo2-SubClass");
	
}
	
	

	public static void main(String[] args) 
	{
//		//Without inheritance calling Superclass
//		SuperClass x = new SuperClass();
//		x.demo();
//		x.demo1();
				
		//With inheritance 
		
		SubClass y = new SubClass();
		y.demo();
		y.demo1();
		y.demo2();
		

	}

}
