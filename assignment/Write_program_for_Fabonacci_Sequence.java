package assignment;

import java.util.ArrayList;

public class Write_program_for_Fabonacci_Sequence 
{

	public static void main(String[] args) 
	{
		int a = 0;
		int b = 1;
		int c = 1;
		//System.out.println(a);
		
		for (int i =1; i<=20; i++ )
		{
			System.out.println(a);
			a=b;
			b=c;
			c = a+b;
		
			
		}
		

	}

}
