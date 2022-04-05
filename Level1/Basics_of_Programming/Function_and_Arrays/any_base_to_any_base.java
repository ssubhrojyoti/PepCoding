package Level1.Basics_of_Programming.Function_and_Arrays;

import java.util.Scanner;

public class any_base_to_any_base {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b1 = sc.nextInt();   // Base 1 
		int b2 = sc.nextInt();	// Base 2
		int changed_number_to_decimal = todecimal(n,b1);
		int result = decimaltoanybase(changed_number_to_decimal,b2);
		System.out.println(result);
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
	
public static int decimaltoanybase(int num, int base) {
		
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