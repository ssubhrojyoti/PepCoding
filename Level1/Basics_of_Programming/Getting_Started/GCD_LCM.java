package Level1.Basics_of_Programming.Getting_Started;
import java.util.*;
public class GCD_LCM {

	public static void main(String[] args) {
	
		 Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int on1 = n1;        // Original n1 and n2 stored for LCM Purposes
		int on2 = n2;
		
		while(n1 % n2 != 0) {
			int rem = n1 % n2;   
			n1 = n2;   // Dividend Change
			n2 = rem; // Divisor Change		
		}
		int gcd = n2;
		System.out.println(gcd);        // GCD Value of n1 and n2
		 
		int lcm = (on1*on2)/gcd;
		
		System.out.println(lcm); 
		
		
		sc.close();
		
	}

}
