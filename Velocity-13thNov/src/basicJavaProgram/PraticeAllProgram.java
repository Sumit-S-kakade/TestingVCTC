package basicJavaProgram;

public class PraticeAllProgram {

	public static void main(String[] args) 
	{
//		*Arithmetic Operation*
		
		
//		int a = 50;
//		int b = 50;
//		int c = a+b;
//		System.out.println("Additon of a & b is : "+c);
//		System.out.println("Multiplication of a & b is : "+a*b);
		
		
		
//		*Conditional Statement in Java*
		
//		# If-Statement #
		
//		int mark = 55;
//		if (mark>=40)
//		{
//			System.out.println("Pass");
//		}
//		
//		
//		System.out.println("End of the program");
//		
//
////		# if else statement #
		
//		int mark = 5;
//		if (mark>=40)
//		{
//			System.out.println("Pass");
//		}
//		else
//		{
//			System.out.println("Fail");
//		}
//		System.out.println("End of the program");
		
		
//		# if- elseif ladder #

//		int number = 20;
//		if (number>0)
//		{
//			System.out.println("No is Positive");
//			
//		}
//				else if(number<0)
//			
//			{
//				System.out.println("No is Negative");
//			}
//		
//				else
//				{
//					System.out.println("No is Zero");
//				}
		
		
//		# Nasted - if Statement #
		
//		int age =99;
//		int weight = 50;
//		if(age>20)
//		{
//			System.out.println("Check your weight");
//			if (weight>45)
//			{
//				System.out.println("Eligible for blood donation");
//			}
//		}
//		
//		
		
		
//		# Loops in java #
		
		
//		int x = 10;
//		for(x = 1; x<=10;x++)
//		{
//			System.out.println(x);
//		}
//		System.out.println("End of the program");
//		
		
//		# While loop #
		
//		int i = 1;
//		while(i<=10)
//		{
//			System.out.println(i);
//			i = i+1;
//		
//		}
//		System.out.println("End of the program");
//		
		
//		# do while loop #
		
//		int i = 1;
//		do
//		{
//			System.out.println(i);
//			i++;
//		}
//		while(i<=10);
//		System.out.println("End of the program");
//		
		
		
//		# Nasted for loop #
		
	
//			int week = 4;
//			int day = 7;
//			for(int i= 1;i<=week;i++)
//			{
//				System.out.println("week"+i);
//				for(int j = 1;j<=day;j++)
//				{
//					System.out.println("Day"+j);
//				}
//			
//			}
		
		
//		# Odd even number #
		
//		int i = 13;
//		if(i%2==0)
//		{
//			System.out.println(" No is even");
//		}
//		else
//		{
//			System.out.println("No is odd");
//		}
//		
		
//		# Star Program #
	
//		******
//		******
//		******
//		******
//		******
//          PATTERN 1
//		
//	for (int i =1;i<=5;i++)
//	{
//		System.out.print("*");
//		for(int j = 1;j<=5;j++)
//		{
//			System.out.print("*");
//		}
//		System.out.println( );
//	}
//		
		
//		 PATTERN 2
		
		
//		*
//		**
//		***
//		****
//		*****
//		******

		
//		for(int i = 0;i<=5;i++)
//		{
//			System.out.print("*");
//			for(int j = 1;j<=i;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println( );
//			}
		
//		 PATTERN 3
		
//		*****
//		****
//		***
//		**
//		*
		
//		for (int i = 4;i>=0;i--)
//		{
//			System.out.print("*");
//			for(int j = 1;j<=i;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println("End of the program");
//		

		
//		# Array concept program #
//		int a = 1;
//		int b = 2;
//		int c = 3;
//		int d = 4;
//		int e = 5;
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
//		
//		
//		
//		int a[]= {1,2,3,4,5};
//		{
//			System.out.println(a[0]);
//			System.out.println(a[1]);
//			System.out.println(a[2]);
//			System.out.println(a[3]);
//			System.out.println(a[4]);
//		}
//		
		
		
//		Array using for loop
		
//		int a[]= {1,2,3,4,5};
//		for(int i = 0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//			
//		}
//		System.out.println("Length of array is : "+
//		a.length);
//	
		
		
//		Array length is assigned to another variable
//		int a[]= {1,2,3,4,5};
//		int c = a.length;
//		System.out.println("length of string : "+c);
//		for(int i = 0;i<c;i++)
//		{
//			System.out.println(a[i]);
//		}
//		
		
//		Program 1
		
//		int a[]= {1,2,3,4,5};
//		for (int i=0;i<a.length;i++)
//		{
//			System.out.println("Element of array are "+a[i]);
//			System.out.println("Element at index position "+ i + " is "+a[i]);
//		}
//
//		
//		Program 2
//		int a[]= {1,2,3,4,5};
//		for(int i = a.length-1;i>=0;i--)
//		{
//			System.out.println(a[i]);
//		}
//		
//		
//		
//		Even position element
		
//		int a[]= {1,2,3,4,5};
//		System.out.println("Even position elements");
//		for(int i = 0;i<a.length;i=i+2)
//		{
//			System.out.println(a[i]);
//		}
//		
		
//		
		//Odd position no
//		int a[]= {1,2,3,4,5};
//	    System.out.println("Even position elements");
//		for(int i = 1;i<a.length;i=i+2)
//		{
//			System.out.println(a[i]);
//	}		
//		
//		
		
//		Largest no in array
//		int a[]= {1,2,3,4,5};
//		System.out.println("Size is "+a.length);
//		for(int i=0;i<a.length;i++)
//		{
//		
		System.out.println(a[i]);
//		}
//		int max;
//		max = a[0];
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]>a[0]) 
//			{
//				max = a[i];
//			}
//		}
//		System.out.println("Max no is " +max);
//		
		
//		# String #
//		String a = "Sumit";
//		String b = "Kakade";
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println("After concating : "+a.concat (b));
//		System.out.println("After UPper : "+ a.toUpperCase());
//		System.out.println("After Lower : "+ b.toLowerCase());
//		System.out.println("Start with Su : "+ a.startsWith("Su"));
//		System.out.println("Start with Ka : "+ b.startsWith("Ka"));
//System.out.println("end with it : "+ a.endsWith("it"));
//		System.out.println("end with de : "+ b.endsWith("de"));
//		System.out.println("equals ignore : "+a.equalsIgnoreCase(b));
//		System.out.println("Substring 1,3 : "+a.substring(1,3));
//		
//		
		
//	
		
		
		
		
		
		
	
}
}