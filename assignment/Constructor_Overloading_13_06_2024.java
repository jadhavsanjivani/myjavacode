package basicJava;

public class Constructor_Overloading_13_06_2024 {
	
	public Constructor_Overloading_13_06_2024(){
		System.out.println("Public Constructor");
		
	}
private Constructor_Overloading_13_06_2024(int a){
	System.out.println("Private Constructor");
		
	}
protected Constructor_Overloading_13_06_2024(double b){
	System.out.println("Protected Constructor");
	
}
 Constructor_Overloading_13_06_2024(char c){
	 System.out.println("Default Constructor");
	
}
 public static void main(String[] args) {
	new  Constructor_Overloading_13_06_2024();
	new Constructor_Overloading_13_06_2024 (10);
	new Constructor_Overloading_13_06_2024 (12.32);
	new Constructor_Overloading_13_06_2024 ('S');
		
}
	

}
