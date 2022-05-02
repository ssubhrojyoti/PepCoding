package Level1.Recursion_and_Backtracking.Recursion_in_arrays;

import java.util.Scanner;

public class first_index_of_occurrence {

 public static void main(String[] args) throws Exception {
	    	  Scanner sc = new Scanner(System.in);
	          int n = sc.nextInt();
	          int [] a = new int [n];
	          for (int i = 0; i < a.length; i++) {
	  			a[i]= sc.nextInt();
	  		}
	          int d = sc.nextInt();
	          int fi = firstIndex(a,0,d);
	          System.out.println(fi);
	    }

	    public static int firstIndex(int[] arr, int idx, int x){
	    	
	    	if(idx==arr.length) {
	    		return -1;
	    	}
	    	
	    	if(arr[idx]==x) {
	    		return idx;
	    	}
	    	else {
	    		int fiisa = firstIndex(arr, idx+1, x);
	    		return fiisa;
	    	}
	
	    }

	}
