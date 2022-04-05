package Level1.Basics_of_Programming.Two_D_Arrays;

import java.util.Scanner;

public class rotate_by_90_degrees {

	public static void main(String[] args) {
		
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();

	    int[][] a = new int[n][n];
	    for (int i = 0; i < n; i++) {                      
	      for (int j = 0; j < n; j++) {
	        a[i][j] = scn.nextInt();
	      }
	    }
	    
	    // Transpose the matrix 
	
	    for (int i = 0; i < a.length; i++) {                      
		      for (int j = i; j < a[0].length; j++) {
		    	  int temp = a[i][j];
		    	  a[i][j] = a[j][i];
		    	  a[j][i] = temp;
		    	  
		      }
		    }
	    
	    
	    // Reverse the columns
	    
	    for (int i = 0; i < a.length; i++) {                      
		      int li = 0;
		      int ri = a[0].length - 1;
		      
		      while(li<ri) {
		    	  int temp = a[i][li];
		    	  a[i][li] = a[i][ri];
		    	  a[i][ri] = temp;
		    	  
		    	  li++;
		    	  ri--;
		      }
		    	  
		    	  
		    	  
		      }
	
	    for (int i = 0; i < n; i++) {                      
		      for (int j = 0; j < n; j++) {
		        System.out.print(a[i][j]+" ");
		      }
		      System.out.println();
		    }  
	    
	    
scn.close();	
	}

}
