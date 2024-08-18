package stringClass;

import java.util.*;
import java.util.Set;

public class HashSet_Set_Upcasting 
{

	public static void main(String[] args) 
	{
		Set s = new HashSet();
		s.add("Ram");
		s.add("Sita");
		s.add("Lakshaman");
		Set s1 = new HashSet();
		s1.add("Ram");
		s1.add("Lakshaman");
		s1.add("Sita");
		s1.add("Sit");
		
		
		
		System.out.println(s);
		boolean b = s.contains("Ram");
		System.out.println(b);
		
		System.out.println(s.equals(s1));
		System.out.println(s1.containsAll(s));
		System.out.println(s.size());
		System.out.println(s1.retainAll(s));
		System.out.println(s1.getClass());
		
		Iterator j = s1.iterator();
		
		Stack  s2 = new Stack <String>();
		s2.add("Ram");
		s2.add("Lakshaman");
		s2.add("Sita");
		s2.add("Sit");
		s2.add(12);
		s2.add(23);
		 Iterator k = s2.iterator();
		
		//HashSet h = (HashSet)s;
		
		
		
	Enumeration e = s2.elements();
	
	while (e.hasMoreElements())
	{
		System.out.println(e.nextElement());
	
	}
		Scanner z = new Scanner(System.in);
		String w = "";
		//Arrays.sort(null);
		
		ArrayList a = new ArrayList();
		a.add("Ram");
		a.add("Lakshaman");
		a.add("Sita");
		a.add("Sit");
		a.add(12);
		a.add(23);
		System.out.println(a.get(1));
		a.set(3, "Rama");
		System.out.println(a);
		String s = "";		
	
		

		
	}

}
