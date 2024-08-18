package stringClass;

import java.util.Scanner;

public class Exam_Array_Question 
{

	public static void main(String[] args) 
	{
		int[] a = new int [4];
		Scanner sc = new Scanner(System.in);
		a[0] = sc.nextInt();
		a[1] = sc.nextInt();
		a[2] = a[0];
		a[3] = a[1];
		
		int area = a[0]*a[1];
		System.out.println(area);
		
		
	

	}

}
