package kt.queations;

import java.util.Arrays;

public class Find_Odd_Even 
{
	//static int even;
	//static int odd;

	public static void main(String[] args) 
	{
		int [] a = {1,2,3,4,5,6,7,8,9,10};
	//	int [] even = new int [5];
	//	int [] odd = new int [5];	
		System.out.println("Even Numbers: ");
		for (int i = 0; i<a.length; i++)
		{
			if(a[i]%2 == 0)
			{
				System.out.println(a[i]);
			}	
		}
		System.out.println("Odd Numbers: ");
		for (int i = 0; i<a.length;i++)
		{
			if(a[i]%2 != 0)
			{
				System.out.println(a[i]);
			}
		}
	//	System.out.println("Even: "+ Arrays.toString(even));
		//System.out.println("Odd numbers: "+ Arrays.toString(odd));

	}

}
