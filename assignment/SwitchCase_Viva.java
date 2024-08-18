package assignment;

import java.util.Scanner;

public class SwitchCase_Viva
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int value = s.nextInt();
		int a = 10;
		int b = 20;
		switch(value)
		{
		case 1:
			int add = a+b;
			System.out.println(add);
		//	break;
			
		case 2:
			
			int sub = b-a;
			System.out.println(sub);
		//	break;
			
		case 3:
			int mul = a*b;
			System.out.println(mul);
		//	break;
			
		case 4:
			double div = a/b;
			System.out.println(div);
		//	break;
			
			default:
				System.out.println("Please use default value");
			
		}
		
		

	}

}
