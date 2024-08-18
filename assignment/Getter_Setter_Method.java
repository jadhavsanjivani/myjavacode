package practice;
class SuperClass
{
	private int age = 16;
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
}
public class Getter_Setter_Method 
{

	public static void main(String[] args) 
	{
		// int age2 = 10;
		SuperClass sc = new SuperClass();
		sc.setAge(60);
		System.out.println(sc.getAge());

	}

}
