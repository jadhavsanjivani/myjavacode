package practice;
import java.util.*;
public class LinkedList_Class 
{

	public static void main(String[] args)
	{
		LinkedList l1 = new LinkedList();
		l1.add("Ram");
		l1.add("Sita");
		l1.add("Laksh");
		l1.addFirst("First");
		l1.addLast("Last");
		System.out.println(l1);
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		System.out.println(l1.removeFirst());
		System.out.println(l1);
		l1.removeLast();
		System.out.println(l1);
		l1.pollFirst();
		l1.pollLast();
		System.out.println(l1);
		

	}

}
