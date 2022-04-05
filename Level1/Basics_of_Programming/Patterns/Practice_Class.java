package Level1.Basics_of_Programming.Patterns;
import java.util.Scanner;

import java.util.*;

public class Practice_Class {

	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int total_cols = n;int total_spaces = 0;
       
        for (int rows = 1; rows <=n; rows++) {
        	for (int spaces = 1; spaces <=total_spaces; spaces++) {
        		System.out.print("\t");
        	}
        	
        	 for (int cols = 1; cols <= total_cols; cols++) {
        		 if(rows>1 && rows<(n/2+1) && cols>1&&cols<total_cols ) {
        			 System.out.print("\t");
        			
        		 }
        		 else {
        			 
        			 System.out.print("*" + "\t");
        			
        			 
        		 }
        	 }
        	
        	 if(rows<=n/2) {
        		 total_spaces++;
        		 total_cols-=2;
        		
        	 }
        	 else {
        		 total_spaces--;
        		 total_cols+=2;
        		
        	 }
        	
        	System.out.println();
		}
scn.close();	}}
