package basicJava;

public class Operator_IfElseIf_11_06_2024 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		if(a>b) { // false
			System.out.println(" a is greater than b");
		}
		
		else if(c<b) { // false
			System.out.println(" c is less than b");
		}
		else if(a<=c) { // true
			System.out.println(" a is less than or equal to c");
		}
		else if(b>=c) { // false
			System.out.println(" b is less than or equal to c");
		}
		else if(a!=b) { // true
			System.out.println(" a is not equal to b");
		}
		else {
			System.out.println(" All conditions are false");

			
		}
	}

}
