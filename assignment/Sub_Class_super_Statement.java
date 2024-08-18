package concept_inheritance;
class Super_Class1
{
	Super_Class1()
	{
		System.out.println("Non-Parameterize Constructor1");
	}
	Super_Class1(int a)
	{
		System.out.println("Parameterize Constructor");
	}
}
public class Sub_Class_super_Statement extends Super_Class1
{
	Sub_Class_super_Statement()
	{
		super();
		System.out.println("Non-Parameterize Constructor2");
    }
	
	Sub_Class_super_Statement(double b)
	{
		super(100);
		System.out.println("Parameterize Constructor2");
     }

	public static void main(String[] args) 
	{
	    new Sub_Class_super_Statement();
		new Sub_Class_super_Statement(100.98); 
	}
}
