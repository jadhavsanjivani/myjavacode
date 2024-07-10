package assignment;

public class Assignment4_17_06_2024 {
	//Write a program to calculate the area of a circle in different methods and then call then in a main method
	
	final static double pi = 3.14;
	static int r = 10;
	static void area()
	{
		System.out.println(pi*r*r);
	}
	static void circumference()
	{
		System.out.println(2*pi*r);
	}
public static void main(String[] args) {
	area();
	circumference();
	
}
}
