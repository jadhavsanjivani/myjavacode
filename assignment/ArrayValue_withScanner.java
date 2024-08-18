package practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayValue_withScanner
{

	public static void main(String[] args) 
	
	{
		Scanner s = new Scanner(System.in);
		int [] a1 = new int [2];
		int [] a2 = new int[2];
		int j = 1;
		
		
		for(int i = 0; i<a1.length; i++)
		{
			a1[i] = s.nextInt();
			a2[j] = a1[i];
       	 j--;
             
            
		}
		System.out.println("First Array"+Arrays.toString(a1));
		 System.out.println("Secong Array"+Arrays.toString(a2));    
	}

}
