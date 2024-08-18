package stringClass;

import java.util.HashMap;
import java.util.Map;

public class Map_Interface 
{

	public static void main(String[] args)
	{
		Map <Integer, String> m1 = new HashMap<Integer, String>();
		m1.put(12234, "abc@gmail");
		m1.put(1, "def@gmail");
		m1.put(1, "ghi@gmail");
		m1.put(1, "jkl@gmail");
		m1.put(107865, "mno@gmail");
		m1.put(0674232, "pqr@gmail");
		System.out.println(m1);
		Map <Integer, String> m2 = new HashMap<Integer, String>();
		
		m2.put(12234, "abc@gmail");
		m2.put(1212424, "def@gmail");
		m2.put(341234, "ghi@gmail");
		m2.put(126435, "jkl@gmail");
		m2.put(107865, "mno@gmail");
		m2.put(0674232, "pqr@gmail");
		m2.clear();
		System.out.println(m2);
		m1.putIfAbsent(123456, "abc@gmail");
		System.out.println(m1);
		m1.putIfAbsent(12234, "xyz@gmail");
		System.out.println(m1);
		m1.remove(12234, "abc@gmail");
		System.out.println(m1);
		m1.remove(1);
		System.out.println(m1);
		
		
	}

}
