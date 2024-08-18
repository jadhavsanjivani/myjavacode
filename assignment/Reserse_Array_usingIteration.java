package stringClass;

import java.util.Arrays;

public class Reserse_Array_usingIteration 
{
	public static void main(String[] args) 
	{
	String [] s1 = {"Ram", "Sita", "Lakshaman"};
	//String s3 = " ";
	String [] s2 = new String [3];
	int j = 0;
	System.out.println(s1.length);
	
	for (int i = s1.length-1; i >=0; i-- )
	{
		s2[j] = s1[i];
		j++;
	}
	System.out.println(Arrays.deepToString(s2));

	}

}
