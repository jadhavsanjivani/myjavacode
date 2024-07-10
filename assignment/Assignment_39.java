package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_39 
{
public static void main(String[] args) {
	double d[] = new double[3];
	Scanner sc = new Scanner(System.in);
	
	d[0] = sc.nextDouble();
	d[1] = sc.nextDouble();
	d[2] = sc.nextDouble();
	
	System.out.println(Arrays.toString(d));
	
	boolean[] b = new boolean[2];
	b[0] = sc.nextBoolean();
	b[1] = sc.nextBoolean();
	
	System.out.println(Arrays.toString(b));
	
}
}
