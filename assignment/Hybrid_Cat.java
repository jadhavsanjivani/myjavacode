package concept_inheritance;

public class Hybrid_Cat extends Hybrid_Animal
{
	static void run()
	{
		System.out.println("Cat run slowly");
	}
	
	void life() 
	{
		System.out.println("Cat live between 12 to 25 yrs");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Parameters of cat animal:");
		
		legs();
		run();
		nose();
		Hybrid_Cat hc = new Hybrid_Cat();
		hc.ears();
		hc.life();
		
	}
		
}


