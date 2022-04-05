package Level1.Basics_of_Programming.Patterns;
import java.util.Scanner;

public class Pattern_10 {

 public static void main(String[] args) {
		        Scanner scn = new Scanner(System.in);
		        int n = scn.nextInt();

		        int os = n / 2 ;  // Outer Space
		        int is = -1;   // Inner Space
		        for (int i = 1; i <= n; i++) {
		            for (int j = 1; j <= os; j++) {
		                System.out.print("\t");
		            }
		            	
		            System.out.print("*\t");
		            
		            
		            for (int k = 1; k <= is; k++) {
		                System.out.print("\t");
		            }
		            
		            if(i > 1 && i <n) {      // Special case for 1st and last row 
		            					   
		            	System.out.print("*\t");
		            	
		            }

		          

		            if (i <= n / 2) {
		                os --;
		                is+=2;
		            } else {
		                os++;
		                is-=2;
		            }

		            System.out.println();
		        }
scn.close();
		    }
		}




