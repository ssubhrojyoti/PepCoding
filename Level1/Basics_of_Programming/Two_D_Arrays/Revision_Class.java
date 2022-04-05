package Level1.Basics_of_Programming.Two_D_Arrays;

import java.util.Scanner;

public class Revision_Class {

	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int r1 = scn.nextInt();
	    int c1 = scn.nextInt();
	    int[][] a = new int[r1][c1];
	    for (int i = 0; i < r1; i++) {                      
	      for (int j = 0; j < c1; j++) {
	        a[i][j] = scn.nextInt();
	      }
	    }
	    
	    int r2 = scn.nextInt();
	    int c2 = scn.nextInt();
	    int[][] b = new int[r2][c2];
	    for (int i = 0; i < r2; i++) {                      
	      for (int j = 0; j < c2; j++) {
	        b[i][j] = scn.nextInt();
	      }
	    }
	    scn.close();
	    if(c1!=r2) {
	    	System.out.println("Invalid input");
	    	return;
	    }
	    int mul[][] = new int[r1][c2];
	    for (int i = 0; i < r1; i++) {                      
		      for (int j = 0; j < c2; j++) {
		    	  for (int k = 0; k < c1; k++) {
				mul[i][j] +=  a[i][k] * b[k][j] ;	
				}
		    	  
		      }
	    }
	    //Printing
	    for (int i = 0; i < mul.length; i++) {                      
		      for (int j = 0; j <mul[0].length; j++) {
		       System.out.print(mul[i][j]+" ") ;
		      }
		      System.out.println();
		    }
	    
	    
	}

}
