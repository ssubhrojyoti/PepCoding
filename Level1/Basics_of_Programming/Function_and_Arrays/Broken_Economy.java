package Level1.Basics_of_Programming.Function_and_Arrays;
import java.util.Scanner;
public class Broken_Economy {

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
	    int floor = 0;
	    int ceil = 0;
	   
	    while(low<=high) {
	    	 int mid= (low+high)/2;
	    	if(target>arr[mid]) {
	    		low = mid +1 ;
	    		floor = arr[mid] ;
	    	}
	    	else if(target<arr[mid])
	    	{
	    		high = mid -1;
	    		ceil = arr[mid];
	    	}
	    	else {
	    		ceil=floor=arr[mid];
                
	    		break;
	    	}
	    }
	    
	    System.out.println(ceil);
	    System.out.println(floor);
	    
	    
	}

}