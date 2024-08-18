package practice;
public class Find_Alphabates
{
	static int alphabate;
	static int numeric;
	static int space;

	public static void main(String[] args)
	{
		String s = "sanjivani228+ @gmal.com";
		char [] c1 = s.toCharArray();
		
		for(int i =0; i<s.length();i++)
		{
			boolean b1 = Character.isAlphabetic(c1[i]);
			boolean b2 = Character.isDigit(c1[i]);
			boolean b3 = Character.isWhitespace(c1[i]);
			if(b1== true)
			{
				alphabate++;
			}
			if (b2==true)
			{
				numeric++;
			}
			if (b3== true)
			{
				space++;
			}
		}
		System.out.println("Number of character: "+ alphabate);
		System.out.println("Number of Numeric value: "+ numeric);
		System.out.println("Number of space: "+ space);
		int spacialchar = s.length()-(alphabate + numeric +space);
		System.out.println("Number of spacialchar: "+ spacialchar);
		

	}

}
