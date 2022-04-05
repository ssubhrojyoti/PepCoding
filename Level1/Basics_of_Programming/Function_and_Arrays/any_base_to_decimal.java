package Level1.Basics_of_Programming.Function_and_Arrays;

import java.util.Scanner;

public class any_base_to_decimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		int changed_number = todecimal(n,b);
		System.out.println(changed_number);
		sc.close();
	}
	public static int todecimal(int num, int base) {
		
		int result = 0;
		int mul = 1;
		while(num>0)
		{
			int remainder = num%10;
			num = num/10;
			result = result + remainder*mul;
			mul*=base;
		}
		return result;

	}
}
