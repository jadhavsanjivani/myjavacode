package assignment;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_checkAll_Conditiond 
{

	public static void main(String[] args)
	{
		LinkedList ll = new LinkedList();
		ll.add("Ram");
		ll.add("Urvish");
		ll.add(34);
		ll.add(true);
		ll.add('U');
		ll.add(3.14);
		ll.add(null);
		ll.add(null);
		ll.add('U');
		//Collections.sort(ll);// GETTING EXCEPTION
		ListIterator li = ll.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}

		while(li.hasPrevious())
		{
			System.out.println("backword    "+li.previous());
		}
		//System.out.println(ll);
		

	}

}
