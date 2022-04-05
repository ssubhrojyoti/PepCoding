package Level1.Basics_of_Programming.Getting_Started;

import java.util.Scanner;

public class reverse_a_number {

	public static void main(String[] args) {
		
		
	Scanner sc = new Scanner(System.in);
		
		
		
		int n = sc.nextInt();
		while(n>0) {
			int rem = n%10;
			n = n/10;
			System.out.println(rem);
			
		}		
    sc.close();

	}

}
