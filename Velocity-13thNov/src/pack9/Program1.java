package pack9;

public class Program1 
{
	 final int retirementAge = 60;
	
	public void print()
	    
	{
//		 retirementAge = 65; we can not change age bcz use in final keyword
		System.out.println("RetirementAge is : "+retirementAge );
	}	
	
	
	

	public static void main(String[] args) 
	{
		Program1 x = new Program1();
		x.print(); 
		
		
		
	}

}
