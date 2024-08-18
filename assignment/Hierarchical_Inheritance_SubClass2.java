package concept_inheritance;

public class Hierarchical_Inheritance_SubClass2 extends Hierarchical_Inheritance_SuperClass 
{
static void mod()
{
	System.out.println("Mod");
}
void percent()
{
	System.out.println("Percentage");
}

public static void main(String[] args) {
	
	mod();
	add();
	Hierarchical_Inheritance_SubClass2 sc2 = new Hierarchical_Inheritance_SubClass2();
	sc2.percent();
	sc2.sub();
}
}
