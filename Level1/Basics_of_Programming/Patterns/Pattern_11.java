package Level1.Basics_of_Programming.Patterns;
import java.util.*;
public class Pattern_11 {

	public static void main(String[] args) {
     	 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int count = 1;
		 for(int row = 1;row<=n;row++) {
			 for(int col = 1;col<=row;col++) {
				 System.out.print(count++ +"\t");
			 }
			 System.out.println();
		 }
		  sc.close();

	}

}
