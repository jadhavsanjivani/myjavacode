package assignment;

import java.util.ArrayList;

public class Assignment50 
{

	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add(0, "Ram");
		al.add("Sita");
		al.add("Lakshaman");
		ArrayList a2 = new ArrayList();
		a2.addAll(al);
		//a2.addAll("UR");
		System.out.println(al);
		System.out.println(a2);
		
		


	}

}
