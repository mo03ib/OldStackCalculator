/**
 * A simple reverse Polish calculator.
 * 
 * Modified to use Stack Version 1 from Lecture 7.
 * 
 * @author Jim Grundy, Ian Barnes and Richard Walker
 * @version $Revision: 2005.4 $, $Date: 2005/03/13 23:33:32 $
 * 
 * Modified by Ian Barnes, 2015-10-13
 */

import java.util.Scanner;
import java.io.IOException;

public class Calculator {
    
    /** Run the calculator */
    public static void main(String[] args) throws IOException {
	Stack stack = new Stack();
	Scanner in = new Scanner(System.in);

        System.out.println("Enter a number or an arithmetic operation, or");
        System.out.println("t to print the top of the stack, or q to quit.");
        System.out.println();
        
	System.out.print("> ");
        String line = in.nextLine().trim();
	while (line != null && !line.equals("q")) {
	    if (line.equals("t")) {
		// Print the number on top of the stack.
               
		// ADD YOUR CODE HERE

	    } else if (line.equals("+")) {
		// Add the top two elements.
		if (!stack.isEmpty()) {
		    int x = ((Integer) stack.top()).intValue();
		    stack.pop();
		    if (!stack.isEmpty()) {
			int y = ((Integer) stack.top()).intValue();
			stack.pop();
			stack.push(new Integer(x + y));
		    } else {
			System.out.println("ERROR: Insufficient arguments");
			stack.push(new Integer(x));
		    }
		} else {
		    System.out.println("ERROR: Insufficient arguments");
		}
	    } else if (line.equals("*")) {
		// Multiply the top two elements.
          
		// ADD YOUR CODE HERE
		
	    } else { // It's a number to push?
		try {
		    stack.push(Integer.parseInt(line));
		}
		catch (NumberFormatException e) {
		    // It's not a number or a known command
		    System.out.println("Error: Unknown Request: " + line);
		}
	    }
            System.out.print("> ");
	    line = in.nextLine().trim();
	}
    }
}
