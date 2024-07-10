package assignment;

public class Assignment3_12_06_2024 {
	// Write a program with parameterized static method using char and boolean as parameter
	
	static void alpha(char c1, char c2)
	{
		System.out.println("Print"+" "+c1+" "+c2);
		
	}
	
	static void name(String s1, String s2) 
	{
		System.out.println(s1+" "+s2);
	}
	static void method(boolean s1, boolean s2) {
		System.out.println(s1+" "+s2);
	}
	public static void main(String[] args) {
		alpha('A', 'a');
		name("Sanjivani", "Jadhav");
		method(false, true);
		
		
	}

}
