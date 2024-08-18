package stringClass;

import java.util.Arrays;

public class Exam_String_question 
{
	static int count;
	public static void main(String[] args) 
	{
		String name = "world is full of beautiful people";
		char[] c1 = name.toCharArray();
		
		for (int i = 0; i>= name.length()-1;i++ )
	
				{
					boolean b1 = Character.isAlphabetic(c1[i]);
					if(b1 == true)
					{
						count++;
					}
					
				}

		System.out.println(count);
		System.out.println(Arrays.toString(c1));
	}

}
