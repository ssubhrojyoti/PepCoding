package Level1.Basics_of_Programming.Patterns;
import java.util.Scanner;

public class Pattern_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        	
        for (int row = 1; row <=n ; row++) {
        	
        	for  (int spaces = 1 ; spaces < row; spaces++) {
				System.out.print("\t");
			}
        	
				System.out.print("*\t");
			
        	
			System.out.println();
		}
        
        
        
        
        sc.close();
	}

}
