package concept_inheritance;

public class Hybrid_Puppy extends Hybrid_Dog
{
	public static void main(String[] args)
	{
		System.out.println("Parameters of puppy:");
		legs();
		run();
		nose();
		Hybrid_Puppy hp = new Hybrid_Puppy();
		hp.ears();
		hp.life();
	}

}
