package Level1.Basics_of_Programming.Function_and_Arrays;
import java.util.Scanner;
public class sum_of_two_arrays {

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
	
	    int [] sum = new int[n1>n2?n1:n2];
	    
	   int  i = n1 - 1;
	    int j = n2 - 1;
	    int k = sum.length - 1;
	    
	int d = 0;  // digit 
	int c = 0; // carry
	
	while(k>=0) {
	d = c;
	
	if(i>=0) {
		d+=a1[i];
		i--;
	}
	if(j>=0) {
		d+=a2[j];
		j--;
	}
	
	d = d%10;
	c = d/10;
	
	sum[k] = d;
	k--;
	
	}
	
	if(c!=0) {
		System.out.println(c);
	}

	for(int val:sum) {
		System.out.println(val);
	}
		
	    scn.close();	
	}

}
