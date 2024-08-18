package kt.queations;
public class Find_Average_ofArrays 

{
	public static void main(String[] args) 
	{
		int [] a = {1,2,3,4,5};
		int adds = 0;
		
		for(int i = 0; i <a.length; i++)
		{
			adds = adds+a[i];
		}
		int avarage = (adds/(a.length-1));
		System.out.println("Avarage: "+avarage);
		

	}

}
