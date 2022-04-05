package Level1.Basics_of_Programming.Patterns;

import java.util.Scanner;


public class Pattern_15{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int total_no_of_spaces_in_rows = n/2;  //Initial Value
        int total_no_of_cols_in_rows = 1;       // Initial Value
        int val=1;
        
        for (int row = 1; row <= n; row++) {
            
                for (int spaces = 1; spaces <= total_no_of_spaces_in_rows; spaces++) {
                    System.out.print("\t");
                }
                int cval = val;
                    for (int cols = 1; cols <= total_no_of_cols_in_rows; cols++) {
                    	System.out.print(cval + "\t");
                    	if(cols<=total_no_of_cols_in_rows/2){
                    		cval++;
                    	}
                    	else
                    	{
                    		cval--;
                    	}
                    }
            

            if(row<=n/2){
                total_no_of_cols_in_rows+=2;
                total_no_of_spaces_in_rows-- ;
                val++;
            }
            else{
               total_no_of_cols_in_rows-=2;
                total_no_of_spaces_in_rows++ ; 
                val--;
            }

            System.out.println();
            }
        


sc.close();



    }
}