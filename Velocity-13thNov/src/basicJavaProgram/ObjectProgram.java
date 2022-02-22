package basicJavaProgram;

public class ObjectProgram 
{
  static void print()     //class name static method
  {
	  System.out.println("Static method");
  }
	
	void print1()   //object non static
	{
		System.out.println("Non static");
	}
	
	void add(int a,int b)
	{
		int c = a+b;
		System.out.println("Addition of a & b is : "+c);
	}
	
	
	void subb(int a,int b)
	{
		int c = a-b;
		System.out.println("Subtraction of a & b is : "+c);
	}
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		
		//static method call
		ObjectProgram.print();
		
		//object creation for non static element call
		
		ObjectProgram x = new ObjectProgram ();   //Object creation
		x.print1();
		
		x.add(50, 50);
		x.add(500, 500);
		
		
		ObjectProgram y = new ObjectProgram ();//Second object creation
		y.subb(100, 50);
		
		
		
		
		
		
		

	}

}
