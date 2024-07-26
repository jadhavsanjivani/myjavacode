package assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Scanner_Forloop
{
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int n = s1.nextInt();
		double d[] = new double[n];
		
		//int d1 = s1.nextInt();
		
		
		for(int i = 0; i<= n; i++);
		{
			Scanner sc = new Scanner(System.in);
			d[n] = sc.nextInt();
		System.out.println(Arrays.toString(d));	
		}
		
		
		
		
		
		
		
		
	/*	d[0] = sc.nextDouble();
		d[1] = sc.nextDouble();
		d[2] = sc.nextDouble();
		
		System.out.println(Arrays.toString(d));
		
		boolean[] b = new boolean[2];
		b[0] = sc.nextBoolean();
		b[1] = sc.nextBoolean();
		
		System.out.println(Arrays.toString(b));*/
		
	}
}
