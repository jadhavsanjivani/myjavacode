package assignment;

public class Assignment5_18_06_2024 {
	//Write a program to find the area of circle using a for loop where radius is coming from math.random and pi is coming from math .pi. the loop has to execute 10 times
	
	public static void main(String[] args) {
		
		for(int i = 1; i <=10 ; i++ )
		{
			double r = Math.random();
			double area = Math.PI*r*r;
			System.out.println(area);
		}
	}

}
