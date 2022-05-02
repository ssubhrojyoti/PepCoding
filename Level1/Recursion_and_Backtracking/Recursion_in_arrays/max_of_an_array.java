package Level1.Recursion_and_Backtracking.Recursion_in_arrays;

import java.util.Scanner;

public class max_of_an_array {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] a = new int [n];
    for (int i = 0; i < a.length; i++) {
		a[i]= sc.nextInt();
	}
   int value  =  maxOfArray(a,0);
   System.out.println(value);
	}
    public static int maxOfArray(int[] arr, int idx){
        
    	if(idx == arr.length) {
    		return Integer.MIN_VALUE;
    	}
    	
    	int highest = maxOfArray(arr, idx+1);
    	
    	if(highest<arr[idx]) {
    	
    		highest = arr[idx];
    	}
    	
    	
    	return highest;
    }
}
