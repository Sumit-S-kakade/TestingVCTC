package basicJavaProgram;

public class ConstructorOverloadingProgram 
{
	
	int x;
	int y;
	
	
	public ConstructorOverloadingProgram ()
	{
		x = 10;
		y = 20;
	}	
	
	
	public ConstructorOverloadingProgram (int a)
	{
		x = 1000;
		y = 2000;
	}	
	
	
	public ConstructorOverloadingProgram (int a,int b)
	{
		x = a;
		y = b;
	}
	
	public ConstructorOverloadingProgram (char a)
	{
		x = 70;
		y = 20;
	}	
	
	
	
	
	void addition()
	{
		int z = x+y;
		System.out.println("Addition of x & y : "+z);
	}
	
	void subb()
	{
		int z = x-y;
		System.out.println("Subtraction of x & y : "+z);
	}
	
	void mul()
	{
		int z = x*y;
		System.out.println("Mulitplication of x & y : "+z);
	}
	
	void div()
	{
		int z = x/y;
	System.out.println("Division of x & y: "+z);	
	}

	public static void main(String[] args) 
	{
		//object creation
		ConstructorOverloadingProgram x=new ConstructorOverloadingProgram ();
		x.addition();
		
		
		//Second object
		ConstructorOverloadingProgram y=new ConstructorOverloadingProgram ();
		y.addition();
		
		//Third object
		
		ConstructorOverloadingProgram z=new ConstructorOverloadingProgram (5,5);
		z.addition();
		
		//Fourth object
		
		ConstructorOverloadingProgram p=new ConstructorOverloadingProgram ('n');
//		p.addition();
		p.subb();
		
		
//		fifth object
		ConstructorOverloadingProgram q=new ConstructorOverloadingProgram ('n');
		q.mul();
		
//		sixth object
		ConstructorOverloadingProgram w=new ConstructorOverloadingProgram (4);
		w.addition();
		
         
//		seven object
		ConstructorOverloadingProgram e= new ConstructorOverloadingProgram(5,5);
		e.div();
		
		
		
		
		
		
		
		
	}

}
