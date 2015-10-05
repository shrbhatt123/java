import java.util.Scanner;
 
class Division2 {
	
public static void main(String[] args) {
 
	  int number, divisor, result;
	 
	  Scanner input = new Scanner(System.in);
	  
	  // get input
	  System.out.println("Input number");
	  number = input.nextInt();
	  System.out.println("Input divisor");
	  divisor = input.nextInt();
	 
	try {
		result = number / divisor;
		System.out.println("Result = " + result);
	
	} catch (ArithmeticException ex) {
		
		System.out.println("Exception Message" + ex.getMessage());
		
	} finally {
		
		System.out.println("Thank you.  Please come again.");
	}
	  
}

}