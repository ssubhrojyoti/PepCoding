package Level1.Basics_of_Programming.Function_and_Arrays;

import java.util.Scanner;

public class bar_chart {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		
		    for (int i = 0; i < n; i++) {
			      arr[i] = sc.nextInt();
			    }

		  int max = Integer.MIN_VALUE;
		  for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		  
		  for (int floor = max; floor >=1; floor--) {
			  for (int buildings_sizes = 0; buildings_sizes < arr.length; buildings_sizes++) {
				if(arr[buildings_sizes]>=floor) {
					System.out.print("*\t");
				}
				else {
					System.out.print("\t");
				}
			  }
		System.out.println();
		}
		    
		    
		    
		sc.close();
		
	}

}
