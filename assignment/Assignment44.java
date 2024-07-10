package assignment;

import java.util.Arrays;

public class Assignment44 
{
	static int count = 0;
public static void main(String[] args) {
	String name = "123Sanjivani";
	
	char c1[] = name.toCharArray();
	System.out.println(Arrays.toString(c1)); 
	
	for(int i = 0; i<name.length()-1; i++)
	{
		boolean b1 = Character.isAlphabetic(c1[i]);
		//System.out.println(b1);
		
		if(b1 == true)
		{
			count++;
		}
		
	}
	System.out.println(count);
}
}
