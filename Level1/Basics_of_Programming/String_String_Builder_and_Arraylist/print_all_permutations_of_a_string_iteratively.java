package Level1.Basics_of_Programming.String_String_Builder_and_Arraylist;


import java.util.Scanner;



public class print_all_permutations_of_a_string_iteratively {

	public static int factorial(int n) {
		 int val = 1;
		 for (int i = 1; i <= n; i++) {
			val*=i;
		}
		return val;
	}
	
	public static void solution(String str) {
		
		int n = str.length();
		int fact = factorial(n);
		
		for (int i = 0; i < fact; i++) {
			StringBuilder sb = new StringBuilder(str);
			int temp = i;
			for (int div = n; div >= 1; div--) {
				int q = temp/div;
				int r = temp%div;
				
				System.out.print(sb.charAt(r));
				sb.deleteCharAt(r);
				
				temp = q;
				
			}
			System.out.println();
		}
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}
}
