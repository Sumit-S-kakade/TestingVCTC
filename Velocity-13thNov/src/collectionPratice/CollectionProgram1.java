package collectionPratice;

import java.util.ArrayList;
import java.util.List;

public class CollectionProgram1 
{
	public static void main(String[]args)
	{
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add('a');
		a.add("Sumit");
		a.add(22.22);
		System.out.println(a);
		
		
//		Specific data type - int
		ArrayList<Integer> b = new ArrayList<Integer> ();
	    b.add(10);
//	    b.add(30.0);
//	    b.add('a');
//	    b.add("Sumit");
	    System.out.println(b);
	    
	    List c = new ArrayList();    //Upcasting
	    c.add(10);
	    c.add('a');
	    c.add("Sumit");
	    System.out.println(c);
	}

}
