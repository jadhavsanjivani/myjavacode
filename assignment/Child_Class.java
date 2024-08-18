package concept_inheritance;

public class Child_Class extends Parent_Class
{
	static void laptop()
	{
		System.out.println("Have laptop");
	}
void bike()
{
	System.out.println("Have Bike");
}
public static void main(String[] args) 
{
	home();
	laptop();
	mansion();
	Child_Class cc = new Child_Class();
	cc.car();
	cc.bike();
	cc.big_Car();
	
}
}
