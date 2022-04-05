package Level1.Basics_of_Programming.Function_and_Arrays;
import java.util.*;
public class decimal_to_any_base {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		int changed_number = toanybase(n,b);
		System.out.println(changed_number);
		sc.close();
	}
	public static int toanybase(int num, int base) {
		
		int result = 0;
		int mul = 1;
		while(num>0)
		{
			int remainder = num%base;
			num = num/base;
			result = result + remainder*mul;
			mul*=10;
		}
		return result;

	}
}
