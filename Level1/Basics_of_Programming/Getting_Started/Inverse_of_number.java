package Level1.Basics_of_Programming.Getting_Started;
import java.util.*;
public class Inverse_of_number {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int op = 1;
		 int inv = 0;
		 
		 while(n>0){
		     
		     int od = n%10;
		     int ip = od;
		     int id = op;
		     
		     inv = inv + id*(int)Math.pow(10,ip - 1);
		     
		     
		     n = n/10;
		     op++;
		     
		     
		     
		 }
		 System.out.println(inv);
		
		
		sc.close();
	}

}
