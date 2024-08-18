package practice;

import java.util.Arrays;
import java.util.Collections;

public class Anagram_String 
{

	public static void main(String[] args) 
	{
		String s1 = "raw";
		String s2 = "war";
		
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		
		 Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(Arrays.equals(c1, c2));
		
		

	}

}
