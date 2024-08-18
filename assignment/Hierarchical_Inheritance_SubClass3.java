package concept_inheritance;

public class Hierarchical_Inheritance_SubClass3 extends Hierarchical_Inheritance_SuperClass
{
	static void meth1()
	{
		System.out.println("Meth1");
	}
	void meth2()
	{
		System.out.println("meth2");
	}

	public static void main(String[] args) {
		
		meth1();
		add();
		Hierarchical_Inheritance_SubClass3 sc3 = new Hierarchical_Inheritance_SubClass3();
		sc3.meth2();
		sc3.sub();
	}

}
