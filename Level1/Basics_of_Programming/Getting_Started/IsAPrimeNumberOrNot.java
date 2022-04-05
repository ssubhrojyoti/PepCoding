package Level1.Basics_of_Programming.Getting_Started;
import java.util.*;
public class IsAPrimeNumberOrNot {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
  // FIRST METHOD
//		int t = sc.nextInt();
//		
//		for(int i = 0;i<t;i++) {
//			int n = sc.nextInt();
//			boolean flag = true;
//			for(int div=2;div*div<=n;div++) {
//				if(n%div==0) {
//					flag = false;
//					break;
//				}		
//			}

		
		
//			if(flag) {
//				System.out.println("Prime");
//			}
//			else
//			{
//				System.out.println("Not Prime");
//			}
//			
//		}
//		
//		
//		
//		
//	sc.close();

		/*Second Method------MORE OPTIMIZED-- using less variables*/
		
		int t = sc.nextInt();
		
	for(int i = 0;i<t;i++) {
		int n = sc.nextInt();
		if (n == 0 || n == 1)
	    {
			System.out.println("not prime");
			break;
	    }
		int div =2;
		while(div*div<=n) {
			if(n%div==0) {
				break;
			}
		div++;	
		}
		
		if(div*div>n) {
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
			
		}
		
		sc.close();
		
	}

}
