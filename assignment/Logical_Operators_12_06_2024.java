package basicJava;

public class Logical_Operators_12_06_2024 {
public static void main(String[] args) {
	int age = 18;
	char gender = 'M';
	int age1 = 17;
	
	if(age>=18 && gender == 'M') { // AND logic
		System.out.println("Full Ticket");
		
	}
	else {
		System.out.println("Half Ticket1");
	}
	
	if (age1<=18 || gender == 'F') { // OR logic
		System.out.println("Free Ticket");
	}
	else {
		System.out.println("Half Ticket2");
	}
	
	if(!(age>=18 && gender =='M' )) { //NOT logic
		System.out.println("NOT logic");
	}
}
}
