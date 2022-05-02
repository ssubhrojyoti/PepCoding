package Level1.Basics_of_Programming.String_String_Builder_and_Arraylist;

import java.util.Scanner;

public class Introduction_To_Strings_Practice {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// Case 1
				
//				String s1 = scn.next();
//				String s2 = scn.next();
//				System.out.println(s1);
//				System.out.println(s2);

//				// Case 2
//				

//				String s1 = scn.next();
//				String s2 = scn.next();
//				System.out.println(s1);
//				System.out.println(s2);
//
//
				// // Case 3

//				String s1 = scn.nextLine();
//				String s2 = scn.next();
//				System.out.println(s1);
//				System.out.println(s2);
//
//				// Case 4:

//				String s1 = scn.nextLine();
//				String s2 = scn.nextLine();
//				System.out.println(s1);
//				System.out.println(s2);
				
		// Inbuilt Function
		String s1 = scn.nextLine();
//		int i = s1.length();
//		char ch = s1.charAt(3);
//		System.out.println("Length - "+ i);
//		System.out.println(ch);
		
		// Substrings
//		for (int j = 0; j < s1.length(); j++) {
//			for (int k = j+1; k <= s1.length(); k++) {
//				System.out.println(s1.substring(j,k));
//			}
//			
//		}
//				
		//Concatenate
		 
//		s1+="kdsad";
//		System.out.println(s1); 
		
		
		// Split Function
		
		String parts [] = s1.split("a");
		for (int i = 0; i < parts.length; i++) {
			System.out.println(parts[i]);
		}
	}

}
