package assignment;
abstract class Assignment34_1
{
	abstract void sub();
	abstract void sum();
}

public class Assignment_34 extends Assignment34_1
{
void sub()
{
	System.out.println("Abstract overriden method sub");
}
void sum()
{
	System.out.println("Abstract overriden method sum");
}
static void mul()
{
	System.out.println("Concrete method mul");
}
static void mod()
{
	System.out.println("Concrete method mod");
}
public static void main(String[] args) {
	Assignment_34 ag = new Assignment_34();
	ag.sub();
	ag.sum();
	mul();
	mod();
}
}
