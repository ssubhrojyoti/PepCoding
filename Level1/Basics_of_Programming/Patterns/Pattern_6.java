package Level1.Basics_of_Programming.Patterns;
import java.util.Scanner;

public class Pattern_6 {

 public static void main(String[] args) {
		        Scanner scn = new Scanner(System.in);
		        int n = scn.nextInt();

		        int nstars = n / 2 + 1;
		        int nspaces = 1;
		        for (int i = 1; i <= n; i++) {
		            for (int j = 1; j <= nstars; j++) {
		                System.out.print("*\t");
		            }

		            for (int j = 1; j <= nspaces; j++) {
		                System.out.print("\t");
		            }

		            for (int j = 1; j <= nstars; j++) {
		                System.out.print("*\t");
		            }

		            if (i <= n / 2) {
		                nspaces += 2;
		                nstars--;
		            } else {
		                nspaces -= 2;
		                nstars++;
		            }

		            System.out.println();
		        }
scn.close();
		    }
		}



