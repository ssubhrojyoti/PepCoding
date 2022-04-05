package Level1.Basics_of_Programming.Getting_Started;
import java.util.*;
public class Print_Prime_Betweeen_Ranges_Subhro {



	
	    public static void main(String[] args) {
	    	
	  // FIRST METHOD  	
//	       Scanner sc = new Scanner(System.in);
//	       int low = sc.nextInt();
//	       int high = sc.nextInt();
//
//	        for(int i = low;i<=high;i++){
//	        	int count = 0;
//	          for(int div = 2; div*div<=i; div++) {
//
//	              if(i%div==0){
//	            	  count++;
//	                  break;
//	              }
//	            
//	          }
//	          if(count==0) {
//	        	  System.out.println(i);
//	          }
//	          else {
//	        	  continue;
//	          }
//	    	}
	
	  /* 2nd Method - More Optimized - Check print_Prime_btwn_ranges_Sayantan.javafile for the best solution*/  
	    
	    Scanner sc = new Scanner(System.in);
       int low = sc.nextInt();
	   int high = sc.nextInt();
	
	      for(int i = low;i<=high;i++){
	    	  int div = 2;
	    	  while(div*div<=i) {
	    		  if(i%div==0) {
	    			  break;
	    		  }
	    		  
	    		div++;  
	    	  }
	    	  if(div*div>i) {
	    		  System.out.println(i);
	    		 
	      }
	    	  
	      }
	    
	    sc.close();
	    }
	
	
	
}