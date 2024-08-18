package stringClass;

import java.util.Arrays;

public class Copy_oneArray_toAnother_usingIteration 
{
	public static void main(String[] args)
	{
		int[] a1 = new int [2];
		a1[0] = 20;
		a1[1] = 13;
		
		int[] a2 = new int [2];
		
		for (int i = 0 ; i<=1 ; i++)
		{
			a2[i] = a1 [i];
			
		}
		System.out.println(Arrays.toString(a2));

	}

}
