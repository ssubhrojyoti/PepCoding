package Level1.Basics_of_Programming.Two_D_Arrays;


import java.util.Scanner;

public class matrix_multiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  int n1 = sc.nextInt();
		  int m1 = sc.nextInt();
		  
		  int one[][] = new int[n1][m1];
 
		    for(int i = 0; i < n1; i++){
		    	for(int j = 0; j < m1; j++) {
		    		one[i][j]= sc.nextInt();
		    	}
		    }
		    
		    
		    
		    int n2 = sc.nextInt();
			  int m2 = sc.nextInt();
			  
			  int two[][] = new int[n2][m2];
	 
			    for(int i = 0; i < n2; i++){
			    	for(int j = 0; j < m2; j++) {
			    		two[i][j]= sc.nextInt();
			    	}
			    }
			    
			    int mul[][] = new int[n1][m2]; 
			    if(m1!=n2) {

		    	System.out.println("Invalid input");
		    	return;
		    	}
			  

		    for(int i = 0; i < mul.length ; i++){
		    	for(int j = 0; j < mul[i].length; j++) {
		    		for (int k = 0; k <m1 ; k++) {
						mul[i][j] += one[i][k] * two[k][j];
					}
		    	}
		    }
		    
		    for(int i = 0; i < mul.length; i++){
		    	for(int j = 0; j < mul[i].length; j++) {
		    		System.out.print(mul[i][j]+"\t");;
		    	}
		    	System.out.println();
		    }
		    
		    
sc.close();
	}

}
