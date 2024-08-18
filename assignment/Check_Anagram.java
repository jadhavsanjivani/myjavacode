package stringClass;

import java.util.Arrays;

public class Check_Anagram 
{

	public static void main(String[] args) 
	{
	String s = "saw";
	String s1 = "was";
	
	char[] c1 = s.toCharArray();
	char[] c2 = s1.toCharArray();
	
	 Arrays.sort(c1);
	Arrays.sort(c2);
			
	System.out.println(Arrays.equals(c1, c2));

	}

}
