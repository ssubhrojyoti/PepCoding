package Level1.Recursion_and_Backtracking.Introduction_To_Recursion;

import java.util.Scanner;

public class print_increasing_decreasing {

    public static void main(String[] args) throws Exception {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	pdi(n);
    	
    	sc.close();
    }

    public static void pdi(int n){
        
    	if(n==0) {
    		return;
    	}
    	
    	
    	System.out.println(n);
    	pdi(n-1);
    	System.out.println(n);
    	
    	
    }

}