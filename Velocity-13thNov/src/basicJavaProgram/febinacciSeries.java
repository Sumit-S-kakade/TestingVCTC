package basicJavaProgram;

public class febinacciSeries 
{

	public static void main(String[] args)
	{
       //Java Program for febinacci series		
		
		int x=0,y=1,z,n=10;
		System.out.println(y);
		for (int i=1;i<=10;i++)
		{
			z=x+y;
			System.out.println(z);
			x=y;
			y=z;
		}
		
		 System.out.println("End of the program");
	}

}
       //OUtPut= 1,1,2,3,5,8,,13,,21,34,55
       //Logic = in this series each no is sum of previous two numbers
     