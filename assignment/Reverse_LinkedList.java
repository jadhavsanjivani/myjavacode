package assignment;

import java.util.LinkedList;

public class Reverse_LinkedList 
{
	public static void main(String[] args) 
	{
		LinkedList l1 = new LinkedList();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		LinkedList l2 = new LinkedList();
		int j = 0;
		System.out.println(l1);
		//System.out.println(l1.size());
		for(int i = l1.size()-1; i>=0;i--)
		{
			l2.add(j, l1.get(i));
			j++;
			
		}
		
		System.out.println(l2);
		
		
		
	}

}
