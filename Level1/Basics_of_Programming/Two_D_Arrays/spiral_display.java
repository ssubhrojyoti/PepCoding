package Level1.Basics_of_Programming.Two_D_Arrays;

import java.util.Scanner;

public class spiral_display {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
	    int m = scn.nextInt();
	    int[][] a = new int[n][m];
	    for (int i = 0; i < n; i++) {                    
	      for (int j = 0; j < m; j++) {
	        a[i][j] = scn.nextInt();
	      }
	    }
	    
	    int minrow = 0;
	    int mincol = 0;
	    int maxcol= a[0].length - 1;
	    int maxrow = a.length - 1;
	    int count = 0;
	    int te = n*m;
	    //Left wall
	    while(count<te) {
	    for (int i = minrow,j= mincol; i <=maxrow && count<te ; i++  ) {
			System.out.println(a[i][j]);
			
			count++;
		}
	    mincol++;
	    //Bottom Wall
	    for (int i = maxrow,j=mincol ; j <= maxcol && count<te; j++) {
			System.out.println(a[i][j]);
			count++;
		}
	    maxrow--;
	    // Right Wall
	    for (int i = maxrow,j=maxcol; i >= minrow && count<te; i--) {
			System.out.println(a[i][j]);
			count++;
		}
	    maxcol--;
	    //Top Wall
	    for (int i = minrow,j=maxcol; j >= mincol && count<te; j--) {
			System.out.println(a[i][j]);
			count++;
		}
	    
	    minrow++;
	    }
	    scn.close();
	}

}
