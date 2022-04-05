package Level1.Basics_of_Programming.Getting_Started;
import java.util.*;
public class print_Prime_btwn_ranges_Sayantan {
	 public static int isprime(int n){
	     for(int div = 2; div*div <= n ; div++)
	   {
	   if(n%div==0){
	       return 0;
	       
	   }
	   
	   }
	   return 1;
	 }
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
		    int low = sc.nextInt();
		    int high = sc.nextInt();
		    for(int i = low; i<= high;i++ )
		{
		    int result = print_Prime_btwn_ranges_Sayantan.isprime(i);
		    
		    if(result == 1){
		        System.out.println(i);
		    }
		}  
		    sc.close();
		}

   }
 

