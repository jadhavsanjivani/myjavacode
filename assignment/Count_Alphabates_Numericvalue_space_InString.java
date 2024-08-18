package stringClass;
public class Count_Alphabates_Numericvalue_space_InString 
{
static int count_alpha = 0;
static int count_numeric = 0;
static int count_space = 0;
	public static void main(String[] args) 
	{
		String s1 = "Sanjivani@  123";
		char [] c1 = s1.toCharArray();
		
		for (int i = 0; i<= s1.length()-1; i++)
		{
			boolean b1 = Character.isAlphabetic(c1[i]);
			boolean b2 = Character.isDigit(c1[i]);
			boolean b3 = Character.isWhitespace(c1[i]);
			if(b1 == true)
			{
				count_alpha++;
			}
			if(b2 == true)
			{
				count_numeric++;
			}
			if(b3 == true)
			{
				count_space++;
			}
		}
		System.out.println("apla: "+count_alpha);
		System.out.println("Numeric: "+count_numeric);
		System.out.println("Space: "+ count_space);
		int spechar = (s1.length())-(count_alpha+count_numeric+count_space);

		System.out.println("specialchar: "+ spechar);
		

	}

}
