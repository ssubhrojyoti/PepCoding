package Level1.Basics_of_Programming.Two_D_Arrays;

import java.util.Scanner;

public class saddle_price {

	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();

	    int[][] a = new int[n][n];
	    for (int i = 0; i < n; i++) {                      
	      for (int j = 0; j < n; j++) {
	        a[i][j] = scn.nextInt();
	      }
	    }

	    
	    for (int i = 0; i < a.length; i++) {
	    	int svj = 0;
	    	for (int j = 1; j < a.length; j++) {
				if(a[i][svj] > a[i][j]) {
					svj = j;   //column no. with lowest element value for that row found
				}
			}
			
	    	boolean flag = true;
	    	
	    	for (int k = 0; k < a.length; k++) {
	    		if(a[i][svj] < a[k][svj] )
	    		{
	    			flag = false;
	    		}
			}
	    	
	    	if(flag==true) {
	    		System.out.println(a[i][svj]);
	    		return;
	    	}
	    	
		}
	    
	    
	    System.out.println("Invalid input");
	    
	    
	    
	    
	    scn.close();
	}

}
