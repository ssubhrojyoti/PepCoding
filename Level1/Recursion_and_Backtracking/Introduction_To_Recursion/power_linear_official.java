package Level1.Recursion_and_Backtracking.Introduction_To_Recursion;

import java.util.Scanner;

public class power_linear_official {
    public static void main(String[] args) throws Exception {
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
    	
    	int powerm1 = power(x,n-1);
    	int ans = x * powerm1;
    	
    	return ans;
    	
    	
    }

}