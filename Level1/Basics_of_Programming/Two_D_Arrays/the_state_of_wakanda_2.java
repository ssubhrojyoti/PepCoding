package Level1.Basics_of_Programming.Two_D_Arrays;

import java.util.Scanner;

public class the_state_of_wakanda_2 {

	public static void main(String[] args) {
		
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	
	    int[][] a = new int[n][n];
	    for (int i = 0; i < n; i++) {                      
	      for (int j = 0; j < n; j++) {
	        a[i][j] = scn.nextInt();
	      }
	    }
	    
	    for (int gap = 0; gap < a.length; gap++) {
	    	for (int i = 0,j=gap; j<a.length; i++,j++) {
				System.out.println(a[i][j]);
			}
			
		}

	    scn.close();
	}

}
