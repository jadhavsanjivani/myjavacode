package concept_inheritance;

class First_level
{
	static void inherit_method1()
	{
		System.out.println("Inherit Method 1");
	}
	
	void inherit_method2()
	{
		System.out.println("Inherit Method 2");
	}
}

public class Singlre_Level_Inheritance extends First_level
{
static void meth1()
{
	System.out.println("Own Mwthod 1");
}
void meth2()
{
	System.out.println("Own Method 2");

}
public static void main(String[] args) {
	inherit_method1();
	meth1();
	Singlre_Level_Inheritance sl = new Singlre_Level_Inheritance();
	sl.inherit_method2();
	sl.meth2();
	
	
}
}
