package Level1.Basics_of_Programming.Patterns;

import java.util.Scanner;

public class Pattern_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        	
        for (int row = 1; row <=n ; row++) {
        	
        	for  (int cols = 1 ; cols <=n; cols++) {
				if(row==cols || row+cols == n+1) {
					System.out.print("*\t");
				}
				else
				{
					System.out.print("\t");	
				}
        		
        		
        	}
			
        	
			System.out.println();
		}
        
        
        
        
        sc.close();
	}

}
