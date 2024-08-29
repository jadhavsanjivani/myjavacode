package assignment;

import java.util.ArrayList;

public class PrimeNumbers {

	public static void main(String[] args) {
		// int number = 4;
		ArrayList a = new ArrayList();
		ArrayList a2 = new ArrayList();

		

		for (int i = 1; i < 100; i++) {
			int count = 0;
			for (int j = 1; j < i; j++) {

				if (i% j == 0) {
					count++;
				}
			}
			if (count == 1) {
				a.add(i);
				
				//System.out.println(i + " " + " Is prime number");
			} 
			else 
			{
				a2.add(i);
				//System.out.println(i + " " + "is not prime number");
			}
		}
		System.out.println("Prime Numbers " +a);
		System.out.println("Not Prime Numbers" +a2);

	}

}
