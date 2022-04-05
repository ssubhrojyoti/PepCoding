package Level1.Basics_of_Programming.Function_and_Arrays;
import java.util.*;


public class any_base_addition {
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int b = sc.nextInt();
	      int n1 = sc.nextInt();
	      int n2 = sc.nextInt();
	  
	      int d = getSum(b, n1, n2);
	      System.out.println(d);
	      sc.close();
	   }
	  
	   public static int getSum(int b, int n1, int n2){
	        int result = 0;
	        int carry = 0;
	        int mul = 1;
	         while(n1>0||n2>0||carry>0) {
	        	 int d1 = n1%10;
	        	 int d2 = n2%10;
	        	 n1 = n1/10;
	        	 n2 = n2/10;
	        	 
	        	 int d = d1 + d2 + carry;
	        	 
	        	 carry = d/b;
	        	 d = d % b;
	        	 
	        	 result += d*mul;
	        	 mul*=10;
	        	 
	        	 
	         }
		   
		   
		   return result;
	   }
	   
	   
	
	  }