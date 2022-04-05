package Level1.Basics_of_Programming.Getting_Started;
import java.util.*;

public class Print_Fibonacci_Numbers_Till_N {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n =Integer.parseInt(sc.nextLine());
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		
		for(int i = 2;i<n;i++) {    // Loop Starting from 2 because first two number have already been printed
			int c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
		
sc.close();

	}

}
