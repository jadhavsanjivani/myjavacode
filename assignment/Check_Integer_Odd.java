package assignment;

import java.util.ArrayList;

public class Check_Integer_Odd
{

	public static void main(String[] args) 
	{
		int [] a = {0,1,2,3,4,5,6,7,8,9};
		
		for(int i = 0; i<a.length;i++)
		{
			if(a[i]%2 != 0)
			{
				System.out.println(a[i]);
			}
		}

	}

}
