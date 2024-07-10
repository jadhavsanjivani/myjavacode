package assignment;
class Assignment_31_1
{
	public void sum()
	{
		System.out.println(" Override parent sum");
	}
	protected void sub(int a)
	{
		
		System.out.println(" Override parent sub");	
	}
	
}

public class Assignment_31 extends Assignment_31_1
{
public void sum()
{
	super.sum();
	System.out.println(" Override child sum");
}
protected void sub(int a)
{
	super.sub(5);
	System.out.println(" Override child sub");	
}
public static void main(String[] args) {
	Assignment_31 at = new Assignment_31();
	at.sum();
	at.sub(10);
	
}
}
