package Level1.Basics_of_Programming.Function_and_Arrays;
import java.util.*;
public class any_base_subtraction {

	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
	      int b = scn.nextInt();
	      int n1 = scn.nextInt();
	      int n2 = scn.nextInt();
	  
	      int d = getDifference(b, n1, n2);
	      System.out.println(d);
	      scn.close();
	}
	public static int getDifference(int b, int n1, int n2){
		int result = 0;
    	int carry = 0;
    	int p = 1;
	      while(n2>0) {
	    	int d1 = n1%10;
	    	int d2 = n2%10;
	    	 n1 = n1/10;
	    	 n2 = n2/10;
	    	 
	    	 int d = 0;
	    	  
	    	  d2 = d2 + carry;  
	    	  
	    	  if(d2>=d1) {
	    		  carry = 0;
	    		 d = d2 - d1; 
	    	  }
	    	  else {
	    		  carry = -1;
	    		  d = d2 + b - d1;
	    	  }
	    	 result += d*p;
	    	 p *= 10;
	      }
		return result;
		
	   }
}
