package basicJavaProgram;

public class ReturnTypeMethodProgram 
{

//	Two no addition
	public static int
	demoAdditionMethod()   //Return type method
	{
		int x=10;
		int y=20;
		int z = x+y;
		char p = 'A';
		boolean q = true;
		return z;
		
	}
	public static void dremoPrint()  //Non return type method
	
	{
		int a=30;
		int b=20;
		int c=a+b;
		System.out.println("Return Nothing");
		
	}
	
	public static void main(String[] args)
	{
		//Return Type method
		int z = demoAdditionMethod(); 
		System.out.println("Valu of z: "+z);
		
		int r=demoAdditionMethod() ;
		int s=demoAdditionMethod() ;
		int i=demoAdditionMethod() ;
		int g=demoAdditionMethod() ;
		int h=demoAdditionMethod() ;
		
        int q=demoAdditionMethod();
        System.out.println(z+q);
        demoAdditionMethod() ;
        //non return type method
		
		
		
		
		
		
	}

}
