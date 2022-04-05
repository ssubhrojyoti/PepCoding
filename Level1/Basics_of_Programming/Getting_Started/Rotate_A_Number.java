package Level1.Basics_of_Programming.Getting_Started;
import java.util.*;
public class Rotate_A_Number {

	public static void main(String[] args) {
	
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int k = sc.nextInt();
		 int temp = n;
		 int nod = 0;
		 while(temp>0) {
			 temp = temp/10;
			 nod ++;
		 }
		 int div = 1;
		 int mul = 1;
		 k = k%nod;  // For K Values exceeding no. of digits 
		 if(k<0) {
			 k = k + nod;    // For negative k Values
		 }
				
		 for(int i = 1;i<=nod;i++ )
		 {
			 if(i<=k) {
				 div = div *10;
			 	}
			 else {
				 mul = mul*10;
			 }
		}
		 int q = n/div;
		 int r = n%div;
		 int rot = q +(mul*r);
		 
		 System.out.println(rot);
		 
		 sc.close();
	}

}
