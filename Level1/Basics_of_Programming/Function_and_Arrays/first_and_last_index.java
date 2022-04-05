package Level1.Basics_of_Programming.Function_and_Arrays;

import java.util.Scanner;

public class first_and_last_index {
	
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    int target = scn.nextInt();
    
    int low = 0;
    int high = arr.length - 1;
    int first_index = 0;
    int last_index = 0;
   
    while(low<=high) {
    	 int mid= (low+high)/2;
    	if(target>arr[mid]) {
    		low = mid +1 ;
    		
    	}
    	else if(target<arr[mid])
    	{
    		high = mid -1;
    	
    	}
    	else {
    	last_index = mid;
    		low = mid+1;
    	}
    }
    
    
    low = 0;
    high = arr.length - 1;
    
    while(low<=high) {
   	 int mid= (low+high)/2;
   	if(target>arr[mid]) {
   		low = mid +1 ;
   		
   	}
   	else if(target<arr[mid])
   	{
   		high = mid -1;
   	
   	}
   	else {
   		first_index = mid;
   		high = mid-1;
   	}
   }
    
   if(arr[first_index]!= target && arr[last_index]!=target ) 
   {
	   first_index = -1;
	   last_index = -1;
   }
    System.out.println(first_index);
    System.out.println(last_index);
    
    scn.close();   
}

}