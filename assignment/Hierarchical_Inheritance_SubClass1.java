package concept_inheritance;

public class Hierarchical_Inheritance_SubClass1 extends Hierarchical_Inheritance_SuperClass 
{
static void mul()
{
	System.out.println("Multiplying");
}
void div()
{
	System.out.println("Dividing");
}

public static void main(String[] args) {
	
	add();
	mul();
	Hierarchical_Inheritance_SubClass1 sc1 = new Hierarchical_Inheritance_SubClass1();
	sc1.div();
	sc1.sub();
	
}
}
