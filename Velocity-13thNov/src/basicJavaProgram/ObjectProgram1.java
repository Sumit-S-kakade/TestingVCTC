package basicJavaProgram;

public class ObjectProgram1 
{

	static int x = 10;
	       int y = 20;
	       
	
	static int a=30;
	       int b=50;
	
	
	public static void main(String[] args) 
	{
		System.out.println("First Static variable"+x);
//		System.out.println("Static variable"+y);  // Can not call non static variable y directly we can create obj
		
		ObjectProgram1 z= new ObjectProgram1 ();
		System.out.println("first non static variable "+z.y);
		
		//Second variable call
		
		System.out.println("Second Static variable"+a);
		ObjectProgram1 s= new ObjectProgram1 ();
		System.out.println("Second non static variable "+s.b);
		
		
		x = 11;
		System.out.println("new value for static "+x);
		
		z.y=33;
		System.out.println("new value for non static "+z.y);
		
		
		
		
		
	}
}
