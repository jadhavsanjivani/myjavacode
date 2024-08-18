package stringClass;
public class StringMethods 
{
public static void main(String[] args) 
{
	String name = "Ram";
	String name2 = "RAM";
	int count = name.length();
	System.out.println(count);
	String lowercase = name.toLowerCase();
	System.out.println(lowercase);
	System.out.println(name.toUpperCase());
	System.out.println(name.indexOf('m'));
	System.out.println(name.charAt(2));
	
	String name1 = "Shilpi Ashwini";
	System.out.println(name1.trim());
	System.out.println(name.equals(name1));
	System.out.println(name.equalsIgnoreCase(name2));
	System.out.println(name1.contains(" "));
	System.out.println(name1.substring(5));
	System.out.println(name1.substring(0, 11));
	
	
	
}
}
