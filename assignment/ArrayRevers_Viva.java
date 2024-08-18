package assignment;

import java.util.Arrays;

public class ArrayRevers_Viva 
{

	public static void main(String[] args) 
	{
		int [] a = new int [5];
		int [] b = new int [5];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		int j = 0;
		for (int i = a.length-1; i>=0; i--)
		{
			b[j] = a[i];
			j++;
		}
		
		System.out.println(Arrays.toString(b));
	}

}
