package kt.queations;
class parent
{
	private int a = 50;
	
	public int getA()
        {
		return a;
		
		}
	public void setA(int a)
	{
		this.a=a;
	}
}
public class Encapsulation_getter_setter 
{
	public static void main(String[] args) 
	{
	parent p = new parent();
	p.setA(50);
	
	System.out.println(p.getA());

	}

}
