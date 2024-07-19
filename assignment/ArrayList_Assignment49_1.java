package assignment;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayList_Assignment49_1 
{

	public static void main(String[] args)
	{
	     ArrayList ll = new ArrayList();
		ll.add("Ram");
		ll.add("Urvish");
		ll.add(34);
		ll.add(true);
		ll.add('U');
		ll.add(3.14);
		ll.add(null);
		ll.add(null);
		ll.add('U');
		Collections.sort(ll);
		System.out.println(ll);
		
	
	}

}
