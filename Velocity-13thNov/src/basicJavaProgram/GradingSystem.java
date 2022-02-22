package basicJavaProgram;

public class GradingSystem
{

	public static void main(String[]args)
	
	
//	WAP to check grADING SYSTEM OF STUDENT
	// 80 - 100 = A
	// 60 - 80 = B
	// 40 - 60 = C
	//Marks < 40 = F
	
	{
	  int mark = 20;
	  if (mark>80 && mark <100 )
	  {
		  System.out.println("Student grade is A ");
	  }
	  else if (mark>60 && mark <80)
	  {
		  System.out.println("Student grade is B ");
	  }
	  else if (mark >40 && mark <60)
	  {
		  System.out.println("Student grade is c ");
	  }
	  else
	  {
		  System.out.println("Student grade is F ");
	  }
	  System.out.println("End of the program ");
		}
}
