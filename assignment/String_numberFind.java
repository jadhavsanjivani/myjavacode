package assignment;
public class String_numberFind 
{
	static int number;

	public static void main(String[] args)
	{
		String s = "sand3e2p12";
		char [] c = s.toCharArray();
		for (int i = 0; i<s.length();i++)
		{
			boolean b1 = Character.isDigit(c[i]);
			if(b1==true)
			{
				number++;
			}
			
		}
		System.out.println(number);
		

	}

}
