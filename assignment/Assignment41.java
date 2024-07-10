package assignment;
public class Assignment41
{
public static void main(String[] args) {
	
	String name = "mom";
	String name1 = "";
	
	
	for(int i = name.length()-1; i>=0; i--)
	{
		char c1 = name.charAt(i);
		//System.out.println(c1);
		name1 = name1+c1;
	}
	System.out.println(name1);
		if(name.equals(name1))
		{
			System.out.println("Given word is palindrom");
		}
		else
		{
			System.out.println("Given word is not palindrom");
		}
}
}
