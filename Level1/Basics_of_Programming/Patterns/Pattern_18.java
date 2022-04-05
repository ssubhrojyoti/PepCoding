package Level1.Basics_of_Programming.Patterns;
import java.util.Scanner;
public class Pattern_18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int nsp = 0;   //initial Values
		 int nst = n ;    //initial Values
		 for(int row = 0;row<n;row++) {
			 for(int spaces = 0;spaces< nsp ;spaces++) {
				 System.out.print("\t");
		 
			 }
			 for(int cols = 0;cols< nst ;cols++) {
				 if( row > 0 && row < n/2 && cols >0 && cols < nst-1) {
					 System.out.print("\t");
				 }
				 else {
					 System.out.print("*" +"\t");
				 }
				 
			 }
			 
		 if(row<n/2) {
			 nsp++;
			 nst-=2;
		 }
		 else {
			 nsp--;
			 nst+=2;
		 }
		
		 
		 sc.close();
		 System.out.println();
		
	}

	}

}
