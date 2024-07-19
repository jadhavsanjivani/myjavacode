package assignment;

import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class Check_TreeSet 
{

	public static void main(String[] args) 
	{
		TreeSet ts = new TreeSet();
		ts.add("ram");
		//ts.add(null);
		ts.add("ram");
		ts.add("sita");
		ts.add("lakshman");
		ts.add("uru");
		/*ts.add(55);
		ts.add(4.87);
		ts.add('a');
		ts.add(null);
		ts.add(null);
		ts.add(55);
		ts.add(true);*/
		//Collections.sort(ts); sorting by default
		Iterator i1 = ts.iterator();
		//ListIterator li = ts.listiterator
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		
		}
		System.out.println(ts);

	}

}
