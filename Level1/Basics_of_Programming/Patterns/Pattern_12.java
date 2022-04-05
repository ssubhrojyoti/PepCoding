package Level1.Basics_of_Programming.Patterns;

import java.util.Scanner;

public class Pattern_12 {

	public static void main(String[] args) {
		
		
		
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int a = 0;
		 int b = 1;
		 for(int row = 0;row<n;row++) {
			 for(int col = 0;col<=row;col++) {
				 
				 System.out.print(a +"\t");
				 int c = a+b;
				 a = b;
				 b = c;
			 }
			 System.out.println();
		 }
		  sc.close();
	 

	}

}
