package stringClass;
public class Palindrom_String 
{

	public static void main(String[] args) 
	{
		String s1 = "madam";
		String s2 = "";
		
		for (int i = s1.length()-1; i>=0; i--)
		{
			char c1 = s1.charAt(i);
			System.out.println(c1);
			s2 = s2+c1;
			
		}
		System.out.println(s2);
		if(s1.equals(s2))
		{
			System.out.println("Given String is palindrom");
		}
		
		else
		{
			System.out.println("Given string is not palindrom");
		}

	}

}
