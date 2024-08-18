package basicJava;

public class Nested_IfElse_Statement {
public static void main(String[] args) {
	
	String person1 = "Male";
	//String person2 = "Female";
	//int age_Kid = 4;
	int age_Male = 20;
	
	if(person1 == "Male") {
		
		if(age_Male > 4) {
			System.out.println("Pay the ticket");
		}
		else {
			System.out.println("Tickets are free for kids");
		}
	}

	else {
		System.out.println("Tickets are free for female");
	}
}
}
