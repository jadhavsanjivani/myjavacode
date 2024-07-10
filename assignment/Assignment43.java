package assignment;

import java.util.Arrays;

public class Assignment43 
{
public static void main(String[] args) {

    int[] a = new int[3];
    int[] b = new int[3];
        a[0] = 86;
        a[1] = 23;
        a[2] = 47;
        
        
      

        for(int i = 2; i>=0; i--)
        {
        	
	         b[i] = a[i];
	        
        }
        System.out.println(Arrays.toString(b));
}
}
