package Level1.Basics_of_Programming.Function_and_Arrays;
import java.util.*;
public class span_of_an_array_pepcoding_method {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] array = new int[n];
		
		
		for (int i = 0; i < array.length; i++) {
			array[i]=sc.nextInt();
		}
		
		
		int max = array[0];
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			
				if(array[i]>max){
					max = array[i];
				}
				
				if(array[i]<min) {
					min = array[i];
				}
			}
			
		System.out.println(max-min);
		
		
sc.close();
	}

}
