package Level1.Recursion_and_Backtracking.Introduction_To_Recursion;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = fact(n);
    	System.out.println(ans);
    	sc.close();
	}
	   public static int fact(int n){
		   
		   if (n==1) {
			return 1;
		}
		   
		   int fnm1 = fact(n-1);
		   int fn = n * fnm1;
		   return fn;
 
	    }

}
