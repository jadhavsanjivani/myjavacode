package assignment;

import java.util.Scanner;

public class Assignment7_20_06_2024 {
	
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("Enter value of radius: ");
		double r = s1.nextDouble();
		System.out.println("Area of Circle: "+Math.PI*r*r);
		System.out.println("Circumfrence of Circle: "+2*Math.PI*r);
		
		System.out.print("Enter value of side: ");
		int s = s1.nextInt();
		System.out.println("Area of square: "+ s*s);
		System.out.println("Circumference of Square: "+ 4*s);
		
		System.out.print("Enter base of triangle: ");
		double b = s1.nextDouble();
		System.out.print("Enter hight of triangle: ");
		double h = s1.nextDouble();
		System.out.println("Area of Triangle: "+((b*h)/2));
		System.out.println("Circumference of Triangle: "+3*b);
		
		System.out.print("Enter lenth of Rectangle: ");
		int l = s1.nextInt();
		System.out.print("Enter  of base of Rectangle: ");
		int b1 = s1.nextInt();
		System.out.println("Area of Rectangle: "+( l*b1));
		System.out.println("Circumference of Rectangle: "+((2*l)+(2*b1)));
		
		System.out.print("Enter hight for Trapezium: ");
		double h1 = s1.nextDouble();
		System.out.print("Enter side a for Trapezium: ");
		double a = s1.nextDouble();
		System.out.print("Enter side c for Trapezium: ");
		double c = s1.nextDouble();
		System.out.print("Enter side d for Trapezium: ");
		double d = s1.nextDouble();
		System.out.print("Enter side e for Trapezium: ");
		double e = s1.nextDouble();
		System.out.println("Area of Trapezium: "+(0.5*h1*(a+c)));
		System.out.println("Circumference of Trapezium: "+(a+c+d+e));
		
		s1.close();
		
		
		
		
	}

}
