package Level1.Basics_of_Programming.Function_and_Arrays;

import java.util.Scanner;

public class find_element_in_an_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] array = new int[n];
		
		
		for (int i = 0; i < array.length; i++) {
			array[i]=sc.nextInt();
		}
		int d = sc.nextInt();
		int index = -1;
		for (int i = 0; i < array.length; i++) {
			if(array[i]==d) {
				index = i;
				break;
			}
			}
		
			System.out.println(index);
		
		
		sc.close();
		}
		
	
	}


