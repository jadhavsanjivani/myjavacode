package stringClass;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.Hashtable;

public class HashMap_Class {

	public static void main(String[] args)
	{
        HashMap hm = new HashMap();
        hm.put("A", 123);
        hm.put("B", 234);
        
       System.out.println(hm.get("A"));
       hm.put("C", 345);
       System.out.println(hm);
       Dictionary m = (Map) new Dictionary ();
        
	}

}
