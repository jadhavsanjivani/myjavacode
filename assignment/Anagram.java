package kt.queations;

import java.util.Arrays;

public class Anagram 
{

	public static void main(String[] args)
	{
		String s = "angle";
		String s1 = "angel";
		
		char [] c = s.toCharArray();
		char [] c1 = s1.toCharArray();
		
		Arrays.sort(c);
		Arrays.sort(c1);
		
		System.out.println(Arrays.equals(c, c1));

	}

}
