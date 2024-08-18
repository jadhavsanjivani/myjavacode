package stringClass;

import java.util.HashMap;

public class Count_char_InString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		HashMap<Character, Integer> hm=new HashMap<>();					
		for(int i=0;i<str.length();i++)					
		{					
		char ch=str.charAt(i);	
		//System.out.println(hm.containsKey(ch));
		
		if(hm.containsKey(ch))	
		{	
			int no = hm.get(ch)+1;
			hm.put(ch, no);
			
		//System.out.println(hm.put(ch, no);					
		}					
		else					
		{					
		hm.put(ch, 1);					
		}					
		}					
		System.out.println(hm);			

	}

}
