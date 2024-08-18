package kt.queations;

import java.util.Arrays;

public class CoutntAphabates_sortIt 
{
	static int countApla;
	public static void main(String[] args)
	{
		String s = "world is beautifull";
		char[] c = s.toCharArray();
		
		for(int i = 0; i<s.length();i++)
		{
			boolean b1 = Character.isAlphabetic(c[i]);
			if (b1 == true)
			{
				countApla++;
			}
		}
		
		System.out.println(countApla);
		System.out.println(Arrays.toString(c));

		 Arrays.sort(c);
		System.out.println(Arrays.toString(c));
		
	}

}
