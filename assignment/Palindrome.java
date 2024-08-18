package kt.queations;
public class Palindrome 
{

	public static void main(String[] args) 
	{
		String s = "madam";
		String s1 = "";
		
		for(int i = s.length()-1; i>=0; i--)
		{
			char c = s.charAt(i);
			
			s1 = s1+c;
			
		}
		System.out.println(s1);
		if (s.equals(s1))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not palindrom");
		}
		
		
		

	}

}
