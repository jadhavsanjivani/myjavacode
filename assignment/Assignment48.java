package assignment;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Assignment48 
{
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	
	long mobile_number;
	try
	{
		System.out.print("Enter mobile number: ");
		mobile_number = sc.nextLong();
		System.out.println("Mobile Number: "+ mobile_number);	
	}
	
	catch (InputMismatchException e)
	{
	System.out.println("Try entering numeric value");	
	   try 
	   {
		System.out.print("Enter mobile number: ");
		Scanner sc1 = new Scanner(System.in);
		long mobile_number1  = sc1.nextLong();
		System.out.println("Mobile Number: "+ mobile_number1);
	   }
	   catch(InputMismatchException d)
	   {
		   System.out.println("Invalid mobile number");
	   }
	}
	
	finally
	{
		System.out.println("Try after some time");
	}
}
}
