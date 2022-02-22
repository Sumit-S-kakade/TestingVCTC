package AssingmentAnswer;

public class ArrayProgram 
{

	int empId;
	String empName;
	int empSalary;
	String CompanyName;
	
	   public  ArrayProgram (String a)
	{
		   empId = 100;
			empName = "Sumit Kakade";
			empSalary = 50000;
			CompanyName = "Velocity";
		
	}
	   
	   public  ArrayProgram (int a)
		{
			   empId = 10;
				empName = "Sumit Kakade";
				empSalary = 5000;
				CompanyName = "Velocity";
		}
	   
	   void empData()
	   {
		   System.out.println("empId: "+empId +"empName: "+empName+"empSalary: "+empSalary+"CompanyName: "+CompanyName);
	   }
	   
	   public static void main(String[] args)
	 {
		   ArrayProgram x = new ArrayProgram (6); 
		   x.empData();
		   
		
	}
	   
}
