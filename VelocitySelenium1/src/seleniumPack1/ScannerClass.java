package seleniumPack1;

import java.util.Scanner;

public class ScannerClass 
{
	public static void main(String[] args) 
	{
		
	
	
	Scanner a = new Scanner(System.in);
	System.out.println("Enter the frst number");
	int x = a.nextInt();
	System.out.println("Enter the second number");
	int y = a.nextInt();
    System.out.println("Result:"+(+x+y));

    
}
}