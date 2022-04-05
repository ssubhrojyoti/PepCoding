package Level1.Basics_of_Programming.Function_and_Arrays;
import java.util.*;
public class span_of_an_array_using_sort {

	public static void main(String[] args) {
	// Span is defined as difference of maximum value and minimum value.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i]=sc.nextInt();
		}
		int size = array.length;
	    
	  
	    for (int i = 0; i < size - 1; i++)
	    
	    {
	      for (int j = 0; j < size - i - 1; j++)

	      {
	        if (array[j] > array[j + 1]) {

	          int temp = array[j];
	          array[j] = array[j + 1];
	          array[j + 1] = temp;
	        }
	
	      }
	  }
	
	    System.out.println(array[n-1]-array[0]);
	
	
	    sc.close();
	}
	
	
	
}
	
	
	

