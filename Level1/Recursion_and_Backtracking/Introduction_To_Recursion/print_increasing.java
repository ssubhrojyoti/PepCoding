package Level1.Recursion_and_Backtracking.Introduction_To_Recursion;

import java.util.Scanner;

public class print_increasing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printIncreasing(n);
		sc.close();

	}

		    public static void printIncreasing(int n){
		       
		    	if(n==0) {
		    		return;
		    	}
		    	printIncreasing(n-1);
		    	System.out.println(n);
		    	
		    	
		    }

		}