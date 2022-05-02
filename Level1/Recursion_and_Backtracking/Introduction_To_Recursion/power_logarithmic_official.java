package Level1.Recursion_and_Backtracking.Introduction_To_Recursion;

import java.util.Scanner;

public class power_logarithmic_official {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	int x = sc.nextInt();
    	int n = sc.nextInt();
    	int ans = power(x,n);
    	System.out.println(ans);
    	sc.close();

	}
    public static int power(int x, int n){
        
    	if(n==0) {
    		return 1;
    	}
    	
    	int xnb2 = power(x,n/2);
    	
    	int xn = xnb2 * xnb2;
    	
    	if(n%2!=0) {
    		xn = xn*x;
    	}
    	
    	return xn;
    }
}
