package Level1.Basics_of_Programming.Patterns;
import java.util.Scanner;
public class Pattern_13 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		
		 for(int row = 0;row<n;row++) {
			 int rowCcol = 1;
			 for(int col = 0;col<=row;col++) {
				 System.out.print(rowCcol + "\t");
				 int  rowCcolplus_1 =  (rowCcol * (row-col))/(col+1);
					rowCcol =  rowCcolplus_1;
				 
			 } 
			 System.out.println();
			 }
			 
sc.close();
	}

}
