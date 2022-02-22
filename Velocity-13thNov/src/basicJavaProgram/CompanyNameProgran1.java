package basicJavaProgram;

public class CompanyNameProgran1 
{

	int empId;
	String empName;
	int empSalary;
	String companyName;
	
	public CompanyNameProgran1 (String a)
	{
		empId = 100;
		empName = "Sumit Kakade";
		empSalary = 50000;
		companyName = "Velocity";
	}
	
	public CompanyNameProgran1 (int a)
	{
		empId = 200;
		empName = "Sumit Shivaji Kakade";
		empSalary = 60000;
		companyName = "Velocity";
	}
	void empData()
	{
		System.out.println("empID "+empId + " empName "+empName+"empSalary"+empSalary);
	}
	
	
	
	
	
	
	
public static void main(String[] args) 
	{
	
		
	CompanyNameProgran1 x = new CompanyNameProgran1("Sumit");
	x.empData();
	
	CompanyNameProgran1 y = new CompanyNameProgran1(3);
	y.empData();
			
	}
}
