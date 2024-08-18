package concept_inheritance;
class Class1
{
	void login()
	{
		System.out.println("Login with email id");
	}
}

public class Overriding_Class2 extends Class1
{
void login()
{
	
	System.out.println("Login with mobile number");
	super.login();
}
public static void main(String[] args) {
	
Overriding_Class2 c2 = new Overriding_Class2();

   c2.login();
  /* Class1 c1 = new Class1();
   c1.login();*/ // Instead of doing this we can use super key word in the login method
  
}
}
