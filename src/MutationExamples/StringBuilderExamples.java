package MutationExamples;

import java.util.Scanner;

public class StringBuilderExamples {

	public static void main(String[] args) {
		// String, StringBuilder and StringBuffer are all considered to be sub classes of CharSequence
		// these classes are used to work with text in java
		// string is immutable - which basically means that if you change the value of a string
		// it is going to create a new variable in the memory and refer to that
		// the old variable will be eventually garbage collected

		// StringBuilder and StringBuffer are both mutable - which means that if you change the value of the
		// object, the modification will happen in the same location in the memory and no new reference
		// will be created.
		// the main difference between StringBuilder and StringBuffer is that StringBuffer
		// is thread safe and StringBuilder is not thread safe

		// thread safe -

		String str = "test";  // 001
		str = str + "end";  // 002

		str = str.toUpperCase(); // 004
		System.out.println(str.toUpperCase());
		
        StringBuffer sb1 = new StringBuffer("Tariq");
        sb1.append("jaan");
        
        sb1 .reverse();
		StringBuilder sb = new StringBuilder("test"); // 003
		sb.append("end"); // 003

		sb.reverse();



		String str2 = String.valueOf(sb);
		System.out.println(str2);
		
		double num1;
		double num2;
		char operator;
		double answer = 0.0;
		
		Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your first number");
        num1 = myScanner.nextDouble();
        
        
        System.out.println("Enter you operator");
        operator = myScanner.next().charAt((int) answer);
        
        
        System.out.println("Enter your second number");
        num2 = myScanner.nextDouble();
        
        
        
        if(operator == '+') {
        	answer = num1 + num2;
        }else if (operator == '-') {
        	answer = num1 - num2;
        	
        }else if (operator == '*') {
        	answer = num1 * num2;
        	
        }else if ( operator == '/'){
        	answer = num1 / num2;
        }
         System.out.println(num1 + " " + operator +" "  + num2 + " = " + answer);
		


		}


		}

