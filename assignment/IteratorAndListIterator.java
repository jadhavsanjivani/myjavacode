package practice;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class IteratorAndListIterator
{

	public static void main(String[] args) 
	{
		LinkedList l1 = new LinkedList();
		l1.add("Ram");
		l1.add("Sita");
		l1.add("Laksh");
		l1.addFirst("First");
		l1.addLast("Last");
		
		LinkedList l2 = new LinkedList();
		l2.add("Ra");
		l2.add("Si");
		l2.add("La");
		l2.addFirst("Fi");
		l2.addLast("La");
		
		Iterator i1 = l1.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
			i1.remove();
			
		}
	
		System.out.println(l1);*/
		
		ListIterator li = l1.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
			li.set("1");
			
		}
		System.out.println(l1);
		Stack s = new Stack();
		s.add("Ram");
		s.add("Sita");
		s.add("Laksh");
		//s.addFirst("First");
		//s.addLast("Last");
		
		Enumeration e = s.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
			
			
		}
		
		
	}
	

}
