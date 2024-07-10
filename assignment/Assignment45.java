package assignment;
public class Assignment45 {

	static int count_alpha = 0;
	static int count_numeric = 0;
	static int count_space = 0;

	public static void main(String[] args) 
	{
	String email = "   sanjivanijadhav228@gmail.com   ";
	char c1[] = email.toCharArray();
	
	for(int i=0; i < email.length()-1; i++)
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

	System.out.println("Count of Alpha: "+count_alpha);
	System.out.println("Count of numeric: "+count_numeric);
	System.out.println("Count of space: "+count_space);
	int count_spacialchar = (email.length()-(count_alpha+count_numeric+count_space))-1;
	System.out.println("Count of Spacial Characters:"+count_spacialchar);
	}

}
