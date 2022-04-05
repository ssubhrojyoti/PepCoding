package Level1.Basics_of_Programming.Two_D_Arrays;

import java.util.Scanner;

public class exit_point_of_a_matrix {

	public static void main(String[] args) {
		
		 Scanner scn = new Scanner(System.in);
		    int n1 = scn.nextInt();
		    int m1 = scn.nextInt();
		    int[][] a = new int[n1][m1];
		    for (int i = 0; i < n1; i++) {                      
		      for (int j = 0; j < m1; j++) {
		        a[i][j] = scn.nextInt();
		      }
		    }
		

		 int dir = 0;
		 int i = 0;
		 int j = 0;
		 
		 while(true) {
			 dir = (dir+a[i][j])%4;
			 if(dir==0) { //east
				 j++;
			 }
			 else if(dir==1) {  //south
				 i++;
			 }
			 else if(dir==2) {  //west
				 j--;
			 }
			 else if(dir==3) {  //north
				 i--;
			 }
			 
			 if(i<0) {
				 i++;
				 break;
			 }
			 if(j<0) {
				 j++;
				 break;
			 }
			 if(i==a.length) {
				 i--;
				 break;
			 }
			 if(j==a[0].length) {
				 j--;
				 break;
			 }
	}
		 
		System.out.println(i);
		System.out.println(j);
	}

}
