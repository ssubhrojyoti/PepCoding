package Level1.Basics_of_Programming.Patterns;

import java.util.Scanner;

public class Pattern_4 {

	public static void main(String[] args) {
	
			
		  	Scanner sc = new Scanner(System.in);
						 int n = sc.nextInt();
						 
						 for(int row = 1;row<=n;row++) {
							 int no_of_spaces= row - 1 ;
							 for(int spaces = 1;spaces<=no_of_spaces;spaces++) {
								 System.out.print("\t");
		                     }
							 for(int col = n;col>=row ;col--) {
								 System.out.print("*\t");
							 }
		                     
							 System.out.println();
						 }
						  sc.close();
			  

		}

	
// TODO Auto-generated method stub

}