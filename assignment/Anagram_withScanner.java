package basicJava;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Anagram_withScanner
{
	static String name1;
    static String name2;

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		//System.out.println("Please enter 1st String: ");
		try
		{
			//Scanner s = new Scanner(System.in);
			System.out.println("Please enter 1st String: ");
		 name1 = s.next();
		 if (!name1.matches("[a-zA-Z]+")) {
             throw new InputMismatchException("Invalid input. Please enter a valid string.");
		
		}
		}
		catch(InputMismatchException a)
		{
			System.out.println("Please enter String ");	
			return;
		}
		System.out.println("1st string is: "+name1);
		//System.out.println("Please enter 2nd String: ");
		try
		{

			//Scanner s = new Scanner(System.in);
			System.out.println("Please enter 2st String: ");
	 name2 = s.next();
	 if (!name1.matches("[a-zA-Z]+")) {
        throw new InputMismatchException("Invalid input. Please enter a valid string.");
	
		 
				
		}
		}
		catch(InputMismatchException a)
		{
			System.out.println("Please enter String ");	
			return;
		}
		System.out.println("1st string is: "+name2);
		//s.close();
		
		char [] c1 = name1.toCharArray();
		char [] c2 = name2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2))
		{
			System.out.println("Strings are anagram");
		}
		else
		{
			System.out.println("Strings are not anagram");
		}
		
		

	}

}
