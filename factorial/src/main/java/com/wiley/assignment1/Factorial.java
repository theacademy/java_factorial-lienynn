package com.wiley.assignment1;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;


public class Factorial {
	
	 private Scanner scanner;
	 private PrintStream printStream;
	 private int num;
	 

	 public Factorial(InputStream inputStream, PrintStream printStream) {
	      this.scanner = new Scanner(inputStream);
	      this.printStream = printStream;
	 }
	 
	 public int isInputNumberValid()  {
		 
		/*
		- Update this method to accept a number from the user and store the value in an instance variable `num`. 
			- Use an instance variable `scanner` to accept the input from the user.
		
		- If the input value is valid, return the number input by the user (NOT the factorial of the number).
		
		- In case of invalid input:
			- Print the following message to the console: "Invalid entry. Please enter an integer between 1 and 10, inclusive."
			    - Use `this.printStream.print()` and NOT `System.out.println()` to print to the console.
			- Return -1
			
		- All code should be inside the placeholders below.
		*/

		//YOUR CODE STARTS HERE
		 // Read the input from the user
		 String input = scanner.nextLine();


		 //tries to parse the input as an integer using Integer.parseInt(input)
		 // if the input is a valid integer between 1 and 10 (both inclusive), it assigns the value to the num variable and returns the number
		 // if the input is not a valid number or is outside the range, it prints an error message using the printStream variable and returns -1
		 try {
			 // parses the input as an integer
			 int number = Integer.parseInt(input);

			 // checks if the number is within the valid range
			 if (number >= 1 && number <= 10) {
				 this.num = number;
				 return number;
			 } else {
				 this.printStream.print("Please Enter valid Input as number between 1 and 10 only, both inclusive");
			 }
		 } catch (NumberFormatException e) {
			 this.printStream.print("Please Enter valid Input as number between 1 and 10 only, both inclusive");
		 }

		 return -1;

		//YOUR CODE ENDS HERE

	 }

	 private void calculateFactorial(int num) {
		
		  /*
		  Use this method to calculate the factorial of the number input by the user.
		  
		  - All code should be inside the placeholders below.
		*/
		 //initializes a variable result to 1 and then uses a for loop to iterate from 1 to the given number (num).
		 // in each iteration, it multiplies result by the current value of i.
		 
		int result = 1;
		//YOUR CODE STARTS HERE
		 for (int i = 1; i <= num; i++) {
			 result *= i;
		 }
		//YOUR CODE ENDS HERE
		this.printStream.print("The Factorial is: " + result);		
		
	 }
	 
	 public void calculateFactorial() {
		 /*
		 Do not change this method.
		 */
		 int input = this.isInputNumberValid();
		 if(input != -1)
		 {
			 calculateFactorial(input);
		 }
	 }
	 public static void main(String[] args) { 
		/*
		 Do not change this method.
		 */
		Factorial fact = new Factorial(System.in,System.out);
		System.out.println("Enter an integer between 1 and 10, inclusive");
		fact.calculateFactorial();	
	 }

	
}
