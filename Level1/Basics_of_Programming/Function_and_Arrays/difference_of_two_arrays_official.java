package Level1.Basics_of_Programming.Function_and_Arrays;

import java.util.Scanner;

public class difference_of_two_arrays_official {

	public static void main(String[] args) {
		
		 Scanner scn = new Scanner(System.in);
		    int n1 = scn.nextInt();
		    int[] a1 = new int[n1];

		    for (int i = 0; i < n1; i++) {
		      a1[i] = scn.nextInt();
		    }
		
		    int n2 = scn.nextInt();
		    int[] a2 = new int[n2];

		    for (int i = 0; i <n2; i++) {
		      a2[i] = scn.nextInt();
		    }
		    int [] diff = new int[n2];
		
		    int  i = n1 - 1;
		    int j = n2 - 1;
		    int k = diff.length - 1;
		    
		    
		    int c = 0;

		    while(k>=0) {
		    	int d = 0;
		    	int a1v = i>=0?a1[i]:0;
		    	
		    	if(a2[j]+c>=a1v) {
		    		d = a2[j] + c - a1v;
		    		c = 0;
		    	}
		    	else {
		    		d = a2[j] + c + 10 - a1v;
		    		c = -1;
		    	}
		    	diff[k] = d;
		    	
		    	i--;
		    	j--;
		    	k--;
		    	
		    }
		    
		    int idx = 0;
		    while(diff[idx]==0) {
		    	idx++;
		    }
		    
		    for (int d = idx; d < diff.length; d++) {
				System.out.println(diff[d]);
			}
   
		scn.close();
	}

}
