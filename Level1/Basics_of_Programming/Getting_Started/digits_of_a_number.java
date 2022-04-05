package Level1.Basics_of_Programming.Getting_Started;
import java.util.*;

public class digits_of_a_number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		// Reverse Order
//		
//		int n = sc.nextInt();
//		while(n!=0) {
//			int rem = n%10;
//			n = n/10;
//			System.out.println(rem);
//			
//		}		
//    sc.close();
//	}
//
//}

		// Forward Order
		int n = sc.nextInt();
		int temp = n;
		int count= 0;
		while(temp!=0) {
		temp= temp/10;
			count++;				
		}		
		
		
	int div = (int)Math.pow(10, count-1);
		while(div!=0) {
			int t = n/div;
			System.out.println(t);
			n = n%div;
			
			div = div/10;
			
		}
	
	
	sc.close();
		
	}
	}
		
		