package Level1.Basics_of_Programming.String_String_Builder_and_Arraylist;

import java.util.Scanner;

public class print_all_palindromic_substrings {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		substrng(s);
		
		sc.close();
	}

	
	public static void substrng(String s) {
		for (int i = 0; i < s.length() ; i++) {
			for (int j = i+1; j <=s.length(); j++) {
				String ss = s.substring(i,j);
				if(isPalindrome(ss)==true) {
					System.out.println(ss);
				}
			}
			
		}
	}
	
	public static boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while(i<=j)
		{
			char ch1  = s.charAt(i);
			char ch2  = s.charAt(j);
			if(ch1==ch2) {
				i++;
				j--;
			}
			else {
				return false;
			}
		}
		return true;
	}
}
