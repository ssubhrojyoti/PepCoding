package Level1.Recursion_and_Backtracking.Recursion_in_arrays;

import java.util.Scanner;

public class display_array_in_reverse {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int [] a = new int [n];
	        for (int i = 0; i < a.length; i++) {
				a[i]= sc.nextInt();
			}
	     
	    	displayArr(a,0);
	    }
	 public static void displayArr(int[] arr, int idx){
	        
	    	if(idx==arr.length) {
	    		return;
	    	}
	    	
	    	displayArr(arr,idx+1);
	    	System.out.println(arr[idx]);
	    	
	    	
	    	
	    }

	}