package Level1.Basics_of_Programming.Patterns;

import java.util.Scanner;

public class Pattern_17 {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int sp = n/2;   //initial Values
		 int st = 1 ;    //initial Values
		 for(int row = 1;row<=n;row++) {
			 for(int spaces = 1;spaces<= sp ;spaces++) {
				 if(row ==((n/2)+1)) {
					 System.out.print("*\t");
				 }
				 else {
					 System.out.print("\t");
				 }
		 
			 }
			 for(int cols = 1;cols<= st ;cols++) {
				 System.out.print("*\t");
				 
			 }
			 
		 if(row<=n/2) {
			 st++;
		 }
		 else {
			 st--;
		 }
		
		 
		 sc.close();
		 System.out.println();
	}

}
}