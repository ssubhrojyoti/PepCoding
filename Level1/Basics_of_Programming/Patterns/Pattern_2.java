package Level1.Basics_of_Programming.Patterns;

import java.util.Scanner;

public class Pattern_2 {

	public static void main(String[] args) {
		
		
		
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 
		 for(int row = 0;row<n;row++) {
			 for(int col = n;col>row;col--) {
				 System.out.print("*\t");
			 }
			 System.out.println();
		 }
		  sc.close();
		  
		  
		  
		  
	}

}
