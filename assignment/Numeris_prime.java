package assignment;
public class Numeris_prime 
{

	public static void main(String[] args)
	{
		int number =9;
		int count = 0;
		for(int i = 1; i<number; i++)
		{
			if(7%i ==0)
			{
				count++;
			}
			
			
		}
		if(count ==1)
		{
			System.out.println("It is a prime Number");
		}
		else
		{
			System.out.println("It is not prime Number");
		}

	}

}
