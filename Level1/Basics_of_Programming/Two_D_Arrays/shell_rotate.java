package Level1.Basics_of_Programming.Two_D_Arrays;

import java.util.Scanner;

public class shell_rotate {

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

	    int s = scn.nextInt(); //shell
	    int r = scn.nextInt(); //no. of times to rotate
	    
	    shellrotate(a,s,r);
	    
	    for (int i = 0; i < n; i++) {                     
		      for (int j = 0; j < m; j++) {
		        System.out.print(a[i][j]+" ") ;
		      }
		      System.out.println();
		    }
	  }
	
	public static void shellrotate(int a[][],int s,int r) {
		int oned[] =  ShellToOned(a,s);
		rotate(oned,r);
		Onedtoshell(s,a,oned);
		}
	
	public static void rotate(int[] a, int k) {
		 k = k%a.length;
		  if(k<0) {
			  k = k+ a.length;
		  }
		  
		  reverse(a,0,a.length-k-1); //1st part
		  reverse(a,a.length-k,a.length-1); //2nd part
		  reverse(a,0,a.length-1); // FULL ARRAY
		
		
	}
	
public static void reverse(int[] a,int i, int j) {
		
		while(i<j) {
			int temp = a[i];
			a[i]=a[j];
			a[j]= temp;
			
			i++;
			j--;
		}
	}


	public static int[] ShellToOned(int[][] a,int s){
		int minrow = s-1;
		int mincol = s-1;
		int maxcol = a[0].length - s  	 ;
		int maxrow = a.length - s	 ;
		int size = 2*(maxrow-minrow) + 2*(maxcol - mincol ) ;
		int oned[] = new int[size];
		
		int idx = 0; //index for One-D array
		
		
		// Left Wall

	    for (int i = minrow,j= mincol; i <=maxrow  ; i++  ) {
		 oned[idx] = a[i][j];
			idx++;
		}
	
	    //Bottom Wall
	    for (int i = maxrow,j=mincol+1 ; j <= maxcol ; j++) {
	    	oned[idx] = a[i][j];
	    	idx++;
		}
	    //Right Wall			
	    for (int i = maxrow - 1,j=maxcol; i >= minrow; i--) {
	    	oned[idx] = a[i][j];
	    	idx++;
		}
	    // Top Wall
	    for (int i = minrow,j=maxcol-1; j > mincol ; j--) {
	    	oned[idx] = a[i][j];
	    	idx++;
		
	    
		}
		return oned;
	}
	
	
	
	public static void Onedtoshell(int s,int[][]a,int oned[]){
		int minrow = s-1;
		int mincol = s-1;
		int maxcol = a[0].length - s 	 ;
		int maxrow = a.length - s	 ;
		//int size = 2*(maxrow-minrow+1) + 2*(maxcol - mincol +1)  ;
		
		
		int idx = 0; //index for One-D array
		

		// Left Wall

	    for (int i = minrow,j= mincol; i <=maxrow  ; i++  ) {
		  a[i][j]=oned[idx] ;
			idx++;
		}
	
	    //Bottom Wall
	    for (int i = maxrow,j=mincol+1 ; j <= maxcol ; j++) {
	    	 a[i][j]=oned[idx] ;
	    	idx++;
		}
	    //Right Wall			
	    for (int i = maxrow - 1,j=maxcol; i >= minrow; i--) {
	    	 a[i][j]=oned[idx] ;
	    	idx++;
		}
	    // Top Wall
	    for (int i = minrow,j=maxcol-1; j > mincol ; j--) {
	    	 a[i][j]=oned[idx] ;
	    	idx++;
		}
	    
		
		
	}
	
	
}
