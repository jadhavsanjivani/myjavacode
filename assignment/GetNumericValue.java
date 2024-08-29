package assignment;

public class GetNumericValue {

	public static void main(String[] args) 
	{
		String s = "sanjivani12345";
		 
		for(int i = 0; i<s.length();i++)
		{
			char[] c = s.toCharArray();
			
			if(c[i]== 1)
			{
				System.out.println(c[i]);
			}
			
		}

	}

}
