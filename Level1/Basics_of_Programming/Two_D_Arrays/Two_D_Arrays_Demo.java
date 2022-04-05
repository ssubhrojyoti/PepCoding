package Level1.Basics_of_Programming.Two_D_Arrays;
import java.util.*;
public class Two_D_Arrays_Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  int n = sc.nextInt();
		  int m = sc.nextInt();
		  
		  int arr[][] = new int[n][m];
 
		    for(int i = 0; i < n; i++){
		    	for(int j = 0; j < m; j++) {
		    		arr[i][j]= sc.nextInt();
		    	}
		    }
		    
		    for(int i = 0; i < arr.length; i++){
		    	for(int j = 0; j < arr[i].length; j++) {
		    		System.out.print(arr[i][j]+"\t");;
		    	}
		    	System.out.println();
		    }
sc.close();
	}

}
