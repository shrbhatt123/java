import java.util.Scanner;
 
class Division {
	
public static void main(String[] args) {
 
	  int number, divisor, result;
	 
	  Scanner input = new Scanner(System.in);
	  
	  // get input
	  System.out.println("Input number");
	  number = input.nextInt();
	  System.out.println("Input divisor");
	  divisor = input.nextInt();
	 
	  result = number / divisor;
	 
	  System.out.println("Result = " + result);
}

}