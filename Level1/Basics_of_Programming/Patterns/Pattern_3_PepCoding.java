package Level1.Basics_of_Programming.Patterns;
import java.util.*;

public class Pattern_3_PepCoding {

	public static void main(String[] args) {
		
			  	Scanner sc = new Scanner(System.in);
							 int n = sc.nextInt();
							 
							 for(int row = 1;row<=n;row++) {
								 int no_of_spaces= n-row;
								 for(int spaces = 1;spaces<=no_of_spaces;spaces++) {
									 System.out.print("\t");
			                     }
								 for(int col = 1;col<=row;col++) {
									 System.out.print("*\t");
								 }
			                     
								 System.out.println();
							 }
							  sc.close();
				  

			}

		
	// TODO Auto-generated method stub

	}


