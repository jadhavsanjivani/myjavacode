package stringClass;

import java.util.Arrays;

public class ArrayPract 
{

	public static void main(String[] args)
	{
		int [] i1 = new int [3];
		i1[0] = 23;
		i1[1]= 39;
		i1[2] = 31;
		Arrays.sort(i1);
		
		System.out.println(Arrays.toString(i1));
		
		String [] s = {"Ram", "Sita"};
		String s1 = "wow";
		String s2 = s1;
		
		
		//System.out.println(Arrays.sort(i));
		
		char[] c1 = s1.toCharArray();
		//System.out.println(Arrays.toString(c1));
		//Arrays.sort(c1);
		//System.out.println(Arrays.toString(c1));
		
		for (int i =0; i<= s1.length()-1; i++)
		{
			//char[] c1= s1.toCharArray();
			
			s2 = s2+c1;
		}
		
		
		
	

	}

}
