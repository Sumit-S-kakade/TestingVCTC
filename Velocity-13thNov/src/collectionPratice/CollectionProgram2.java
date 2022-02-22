package collectionPratice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.Vector;

public class CollectionProgram2 
{
	public static void main (String[]args)
	{
		
//		ArrayList a = new ArrayList();
//		a.add(10);
//		a.add(20.0);
//		a.add('A');
//		a.add("Sumit");
//		System.out.println(a);
		
//		Specific dataType int
		
//		ArrayList<Integer> b = new ArrayList<Integer>();
//		b.add(30);
//		b.add(30.0);

		
//		List c =  new ArrayList();
//		c.add(12);
//		c.add(23);
//		c.add('s');
		
//		List<String> d = new ArrayList<String>();
//		d.add(23);
//		d.add('s');
//		d.add("Sumit");
		
		
//		ArrayList a = new ArrayList();
//		a.add(10);
//		a.add(20.0);
//		a.add('A');
//		a.add("Sumit");
//		System.out.println(a);
		
//		a.add(2, 30);
//		
//		System.out.println(a);
//		a.remove(2);
//		System.out.println(a);
//		
//		a.set(2, 30);
//		System.out.println(a);
//		
//		System.out.println(a.get(0));
//		
//		for(int i = 0;i<=3;i++)
//		{
//			System.out.println(a.get(i));
//		}
		
		
//		List a =  new LinkedList();
//		a.add(10);
//		a.add(20.0);
//		a.add('A');
//		a.add("Sumit");
//		System.out.println(a);
		
		
//		List b = new Vector();
//		
//		b.add(10);
//		b.add(20.0);
//		b.add('A');
//		b.add("Sumit");
//		System.out.println(b);
//		
		
//		Set a = new HashSet();
//		a.add(10);
//		a.add(20.0);
//		a.add('A');
//		a.add("Sumit");
//		System.out.println(a);
//		
		
//		Set a = new LinkedHashSet();
//		a.add(10);
//		a.add(20.0);
//		a.add('A');
//		a.add("Sumit");
//		System.out.println(a);	
//		
		Set a = new LinkedHashSet();
		a.add(10);
		a.add(20.0);
		a.add('A');
		a.add("Sumit");
	Iterator x  = a.iterator();
//	System.out.println(x.next());
//	System.out.println(x.next());
	System.out.println(x.next());
	
	
	for(int i = 0;i<=3;i++)
		
	{
		System.out.println(x.next());
	}
		
		
		
		
	}

}
