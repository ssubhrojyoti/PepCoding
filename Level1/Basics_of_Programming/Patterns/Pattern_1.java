package Level1.Basics_of_Programming.Patterns;
import java.util.*;

public class Pattern_1 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 
		 for(int row = 1;row<=n;row++) {
			 for(int col = 1;col<=row;col++) {
				 System.out.print("*\t");
			 }
			 System.out.println();
		 }
		 

		 
		 
		 
		 
		 sc.close();
	}

}
