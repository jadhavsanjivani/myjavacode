package practice;

import java.util.Scanner;

public class SwichCase
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int value = s.nextInt();
		
		switch(value)
		{
		case 1:
			System.out.println("Launch the Chrome");
			break;
		case 2:
			System.out.println("Launch the Fire Fox");
			break;
		case 3:
			System.out.println("Launch the Edge");
			break;
			default:
				System.out.println("Sorry your selection is wrong");
		
		}
		

	}

}
