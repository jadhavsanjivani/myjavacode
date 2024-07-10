package assignment;

import java.util.Scanner;

public class Assignment6_19_06_2024 {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("First Name: ");
		String name = s1.next();
		
		System.out.print("Last Name: ");
		String last_name = s1.next();
		
		System.out.print("Enter Email: ");
		String email = s1.next();
		
		System.out.print("Enter Password: ");
		String pass = s1.next();
		
		System.out.print("Enter Gender: ");
		String gender = s1.next();
		
		System.out.print("Enter Present Address: ");
		String address = s1.next();

		System.out.print("Enter pincode: ");
		int pincode = s1.nextInt();	
		s1.close();
	}
}
