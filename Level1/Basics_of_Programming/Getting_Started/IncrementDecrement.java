package Level1.Basics_of_Programming.Getting_Started;

public class IncrementDecrement {

	public static void main(String[] args) {
		
//--------------General Example----------------//	 
		        int var1 = 5, var2 = 5;

		        // 5 is displayed
		        // Then, var1 is increased to 6.
		        System.out.println(var1++);
		        System.out.println("Var 1 After Postfix "+var1);

		        // var2 is increased to 6
		        // Then, var2 is displayed
		        System.out.println(++var2);
		
		
		
		
// --------------------LOOP EXAMPLE-----------------------//		
				int i = 13;
				for( ;i <= 15; ){
				System.out.println("1st Value  "+i);
				System.out.println("During Increment " +i++);
				System.out.println("After Increment "+i);
				
				}
				System.out.println("Last Value of I "+i );
		        
		        
		        
		    }
		}
		
		
	
