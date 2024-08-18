package assignment;

import java.util.Arrays;

public class Assignment43 
{
public static void main(String[] args) {

    int[] a = new int[3];
    int[] b = new int[3];
        a[0] = 43;
       a[1] = 23;
        a[2] = 47;
        System.out.println(Arrays.toString(a));
        int j = 0;
        
      
        for(int i = a.length-1; i>=0; i--)
        {
        	
	         b[j] = a[i];
	         j++;
	        // System.out.println(b[i]);
	         //System.out.println(Arrays.toString(b));
	        
        }
        System.out.println(Arrays.toString(b));

}
}
