package Level1.Basics_of_Programming.Patterns;


import java.util.Scanner;

public class Pattern_14 {

	public static void main(String[] args) {
            	 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		
for (int i = 1; i <=10; i++) {
      System.out.println(n + " * " + i +" = " + n*i);
}


sc.close();
      }
}
