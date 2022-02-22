
//PrimitiveCastingProgram 
package packageCastingProgram;

public class PrimitiveCastingProgram 
{
	
	public static void main (String[]args)
	{
		//implicite Casting-Automatically
		
		int a = 10;
		double b;
		b = a;
		System.out.println("Before casting");
		System.out.println(a);
		System.out.println("After Casting");
		System.out.println(b);
		
		//Explicite Casting -Manually
		
		double c = 20;
		int d;
		d =(int) c;
		System.out.println("Before Casting");
		System.out.println(c);
		System.out.println("After Casting");
		System.out.println(d);
		
		
		//EX.3
		long x = 10l;
		int y;
		y = (int)x;
		System.out.println(x);
		System.out.println(y);
		long z;
		z = y;
		System.out.println(z);
		
		
	}
	

}
