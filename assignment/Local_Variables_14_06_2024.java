package basicJava;

public class Local_Variables_14_06_2024 
{
  static void add(int a,int b)
  {
	  double d = 12.32;
	  char c = 'S';
	  // in above example int, float, double and char all are the local variables
	  System.out.println("add methods local variable    "+a+b+d+c);
	
}
  public static void main(String[] args) {
	int a = 10;
	System.out.println("main methods local variables   "+ a);
	add(23, 54);
	
}
}
