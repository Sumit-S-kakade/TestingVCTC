package basicJavaProgram;

public class NastedIfStatement 
{
	public static void main(String[]args)
	{
		int age = 23;
		int weight = 40;
		if(age>20)
		{
			System.out.println("Check your weight now");
			if(weight>50)
			{
				System .out.println("Eligible for bolld donation");
			}
			
		}
		System.out.println("End of the program");
	}

}
