package in.learning.java.lec13LambdaExpression;

import java.util.Arrays;
import java.util.List;



public class lambda {


	 //Functional interface with a single method
	    @FunctionalInterface
	    interface MathOperation {
	        int operate(int a, int b);
	    }

	    public static void main(String[] args) {
	        // Lambda expression for addition
	        MathOperation addition = (a, b) -> a + b;

	        // Using the lambda to add two numbers
	        int result = addition.operate(10, 5);

	        System.out.println("Result: " + result);  // Output: Result: 15
	    }
}
