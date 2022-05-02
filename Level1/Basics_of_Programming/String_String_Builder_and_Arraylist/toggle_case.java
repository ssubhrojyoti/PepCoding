package Level1.Basics_of_Programming.String_String_Builder_and_Arraylist;

import java.util.Scanner;

public class toggle_case {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
		scn.close();
	}

	
	public static String toggleCase(String s) {
		
		StringBuilder sb = new StringBuilder(s);
		for(int i = 0; i<sb.length();i++)
		{
			char ch = sb.charAt(i);
			if(ch>='a' && ch<='z') {
				char UpperCase =(char)('A' + ch - 'a'); 
				sb.setCharAt(i, UpperCase );
			}
			else if(ch>='A' && ch<='Z') {
				char LowerCase =(char)('a' + ch - 'A'); 
				sb.setCharAt(i, LowerCase );
			}	
		}
		return sb.toString();

	}
	
	
}
