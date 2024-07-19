package assignment;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSet_Check
{

	public static void main(String[] args) 
	{
		LinkedHashSet ts = new LinkedHashSet();
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
		System.out.println(ts);

	}

}
