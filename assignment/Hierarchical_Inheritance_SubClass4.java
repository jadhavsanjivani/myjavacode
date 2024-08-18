package concept_inheritance;

public class Hierarchical_Inheritance_SubClass4  extends Hierarchical_Inheritance_SuperClass
{
	static void meth3()
	{
		System.out.println("Meth3");
	}
	void meth4()
	{
		System.out.println("meth4");
	}

	public static void main(String[] args) {
		
		meth3();
		add();
		Hierarchical_Inheritance_SubClass4 sc4 = new Hierarchical_Inheritance_SubClass4();
		sc4.meth4();
		sc4.sub();
	}

}
