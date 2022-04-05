package Level1.Basics_of_Programming.Function_and_Arrays;
import java.io.*;
public class subsets_of_array {

	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    int n = Integer.parseInt(br.readLine());
	    int[] arr = new int[n];
	    for(int i = 0; i < n; i++){
	       arr[i] = Integer.parseInt(br.readLine());
	    }
	    int subsets =(int)Math.pow(2,n);
	    
	   for (int i = 0; i < subsets; i++) {
		   int bn = decimaltobinary(i);
		   int div = (int)Math.pow(10,n-1);
		  for (int j = 0; j < arr.length; j++) {
			  int q = bn/div;
			  if(q==0) {
				  System.out.print("-\t");
			  }
			  else {
				  System.out.print(arr[j]+"\t");
			  }
			  bn = bn%div;
			  div = div/10;
		}
		  
		  
		 System.out.println();  
		   
	}
	    
	    
	    
	    
	    
	    
	 }

	
	public static int decimaltobinary(int n) {
		int p = 1; int result = 0;
		while(n!=0) {
			int rem = n%2;
			result = result+rem*p;
			p*=10;
			n = n/2;
		}
		return result;
	}
	

}