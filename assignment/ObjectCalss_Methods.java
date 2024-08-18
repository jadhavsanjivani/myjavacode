package practice;

import java.util.Collections;
import java.util.Date;

public class ObjectCalss_Methods
{

	public static void main(String[] args) 
	{
		Date d = new Date();
		System.out.println(d.getTime());
		Date d1 = new Date(d.getTime());
		System.out.println("Present Date" + d1);
		Date d2 = new Date(d1.getTime()+(1000*60*60*24*24));
		System.out.println("Future Date: "+ d2);
		Date d3 = new Date(d1.getTime()-(1000*60*60*24*24));
		System.out.println("Past Date: "+ d3);
		
		
		String date = d1.toString();
		String day = date.substring(8, 10);
		System.out.println(day);
		String month = date.substring(4, 7);
		System.out.println(month);
		String year = date.substring(24);
		System.out.println(year);
		
		
		Collections.sort(null);
		System.out.println("Complete Date:"+" "+day+" "+month+" "+year);
		

	}

}
