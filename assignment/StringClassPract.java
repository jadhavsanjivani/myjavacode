package stringClass;

import java.util.Arrays;

public class StringClassPract
{

	public static void main(String[] args)
	{
		String s = "Rameshwaram       is city";
		String s1 = "SiTa 123";
		String s2 = "";
		
		
		System.out.println(s.indexOf('R'));
		System.out.println(s.lastIndexOf('m'));
		System.out.println(s.substring(2));
		System.out.println(s.substring(2, 9));
		System.out.println(s.matches("R(.*)"));
		System.out.println(s.matches("(.*)am"));
		System.out.println(s.matches("(.*)war(.*)"));
		System.out.println(s1.matches("...."));
		System.out.println(s.contains("war"));
		System.out.println(s.replace('m', 'x'));
		System.out.println(s.replace("war","raw"));
		System.out.println(s.replaceAll("Ram", "Raddha"));
		System.out.println(s2.isEmpty());
		System.out.println(s1.replaceAll("[a-z]", "a"));
		System.out.println(s1.replaceAll("[A-Z]", "w"));
		System.out.println(s.replaceFirst("Ram", "z"));
		System.out.println(s2.isBlank());
		String[] s4 = s.split("e", 3);
		String[] s5 = s.split("a");
		System.out.println(Arrays.toString(s5));
		System.out.println(Arrays.toString(s4));
		System.out.println();
		
		
		
		
		

	}

	
	}


