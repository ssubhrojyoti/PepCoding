package Level1.Recursion_and_Backtracking.Recursion_in_arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class all_indices_official {

	   public static void main(String[] args) throws Exception {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int n = Integer.parseInt(br.readLine());
	        int[] arr = new int[n];

	        for (int i = 0; i < n; i++) {
	            arr[i] = Integer.parseInt(br.readLine());
	        }
	        int x = Integer.parseInt(br.readLine());
	        int[] iarr = allIndices(arr, x, 0, 0);

	        if(iarr.length == 0){
	            System.out.println("NO OUTPUT");
	            return;
	        }
	        
	        for(int i = 0; i < iarr.length; i++){
	            System.out.println(iarr[i]);
	        }
	    }

	    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
	        if(idx == arr.length){
	            return new int[fsf];
	        }
	        
	        int[] iarr;

	        if(arr[idx] == x){
	            iarr = allIndices(arr, x, idx + 1, fsf + 1);
	            iarr[fsf] = idx;
	        } else {
	            iarr = allIndices(arr, x, idx + 1, fsf);
	        }
	        
	        return iarr;
	    }

	}