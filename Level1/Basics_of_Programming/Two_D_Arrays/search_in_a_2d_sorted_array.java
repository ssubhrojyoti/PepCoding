package Level1.Basics_of_Programming.Two_D_Arrays;

import java.util.Scanner;

public class search_in_a_2d_sorted_array {

	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();

	    int[][] a = new int[n][n];
	    for (int i = 0; i < n; i++) {                      
	      for (int j = 0; j < n; j++) {
	        a[i][j] = scn.nextInt();
	      }
	    }
	    
	    int target = scn.nextInt();
	    int i = 0;
	    int j = a[0].length-1;
	    
	    
	    while(i<a.length && j>=0) {
	    	if(a[i][j] == target) {
	    		System.out.println(i);
	    		System.out.println(j);
	    		return;
	    	}

	    	else if(target>a[i][j]){
	    		i++;
	    	}
	    	else if(target<a[i][j]) {
	    		j--;
	    	}
	    }
	    
	    
	    System.out.println("Not Found");
	   scn.close(); 
	}

}
