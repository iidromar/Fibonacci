import java.util.Scanner;

public class Fibonacci {

	// Fibonacci Recursive Method 
	  public static int printFibonacciResult(int ReqNumber)
	    {
		  // Base Case
	        if (ReqNumber <= 1) {
	            return ReqNumber;
	        }
	      // Distribute (ReqNumber-1) and (ReqNumber-2) as structured
	        return printFibonacciResult(ReqNumber - 1) + printFibonacciResult(ReqNumber - 2);
	    }
	  
	public static void main(String[] args) {
		try {
			Scanner userScanner = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Enter nth term to produce the Fibonacci series:"); //Seeking Integer Input
			// Catching non-integer inputs and re asking 
		    while (!userScanner.hasNextInt()) {
			    System.out.println("Please Enter valid number:");
				userScanner.next();
			}
			int userInput = userScanner.nextInt();
			// calling logic Fibonacci method
	        System.out.println("The "+userInput+"th term in Fibonacci is : " + printFibonacciResult(userInput));
	
		}catch(Exception e) {
		      System.out.println("Something went wrong, Please try again later.");
		}

	}

}
