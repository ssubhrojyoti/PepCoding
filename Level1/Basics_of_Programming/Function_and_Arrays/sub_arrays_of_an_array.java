package Level1.Basics_of_Programming.Function_and_Arrays;

import java.util.Iterator;
import java.util.Scanner;

public class sub_arrays_of_an_array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
	    int[] a = new int[n];
	    for(int i = 0; i < n; i++){
	       a[i] = sc.nextInt();
	    }
	
	   for (int i = 0; i < a.length; i++) {
		for (int j = i; j < a.length; j++) {
			for (int k = i; k <= j; k++) {
				System.out.print(a[k]+"\t");
			}
			System.out.println();
			
		}
	}
	    
	    
	  sc.close();
	}
}
