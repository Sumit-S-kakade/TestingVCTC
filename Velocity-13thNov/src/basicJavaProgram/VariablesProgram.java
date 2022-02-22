package basicJavaProgram;

public class VariablesProgram 
{
	
	static int a = 10;    //global v
	int b = 20;      //global v
//	int b = 30;   Duplicate variable b is not allowed
	
	
	public VariablesProgram( )
	{
		int a = 30;  //local v
		int b = 40;   //local v
		int c = 50;    //local v
		int d = 60;    //local v
//		int d = 70;   Duplicate local variable d is ot allowed
		
	}
	
	public VariablesProgram(int a)
	{
		int c = 150;  //local v
		int d = 160;  //local v
	}
	
	

	public static void main(String[] args) 
    {
		
		System.out.println(a);   //call for static variable
	
		//to create a obj for calling the non static variable
		VariablesProgram x = new VariablesProgram();
	System.out.println(x.b);
		
		
		
		
		

	}

}
