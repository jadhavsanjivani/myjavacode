package assignment;

public class Assignment_37 
{
public static void main(String[] args) {
	String name = "Sanjivani Jadhav";
	System.out.println(name.isEmpty());
	System.out.println(name.lastIndexOf('a'));
	System.out.println(name.replace('S', 'V'));
	System.out.println(name.replaceAll("Jadhav", "Rathod"));
	System.out.println(name.matches("(.*)v"));
	System.out.println(name.matches("S(.*)"));
	System.out.println(name.matches("(.*)i(.*)"));
	System.out.println(name.length());
	System.out.println(name.matches("................"));
	
}
}
