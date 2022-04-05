package Level1.Basics_of_Programming.Function_and_Arrays;
import java.util.*;
public class Digit_Frequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int count = 0;
		while(n!=0) {
			int temp = n%10;
			if(temp==k) {
				count++;
				}
			n=n/10;
			
		}
		System.out.print(count);
		sc.close();
	}

}
