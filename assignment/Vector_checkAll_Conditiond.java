package assignment;

import java.util.Collections;
import java.util.Vector;

class Vector_checkAll_Conditiond 
{

	public static void main(String[] args) 
	{
		Vector v = new Vector();
		v.add(55);
		v.add(47);
		/*v.add("ram");
		v.add("urvish");
		
		v.add('a');
		v.add(null);
		v.add(null);
		v.add(55);
		v.add(true);*/
		Collections.sort(v);
		System.out.println(v);
		

	}

}
