package assignment;

import java.util.Arrays;

public class Assignment46 
{
 public static void main(String[] args) {
	
	 String fname = "Sanjivani";
	 String lname = "Jadhav";
	 
	 System.out.println(fname.concat(" "+lname));
	 
	 String name = "My Name Is Sanji";
	 String [] a1 = name.split(" ", 2);
	 System.out.println(Arrays.toString(a1));
}
}
