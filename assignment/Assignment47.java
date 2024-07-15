package assignment;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment47
{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] a = new int [3];
	try
	{
	a[0] = sc.nextInt();
	a[1] = sc.nextInt();
	a[2] = sc.nextInt();
	System.out.println(Arrays.toString(a));
	}
	catch(InputMismatchException b)
	{
	System.out.println("I handled InputMismatchException");	
	
	}
	
}
}
