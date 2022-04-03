package Firstjavaprogram;

public class ForLoop {

	public static void main(String[] args) {
	/*
		
		for (int i = 0; i <= 20; i+=5) {
			System.out.print(i + "  ");
			}

		    System.out.println();
		
		for (int i = 20; i >= 0; i--) {
			System.out.print(i + " ");
			}
		
		
		
		for (int i = 0; i <= 100; i+=5) {
			if (i % 2 == 0) {
				System.out.println(i + " is even");
			}else {
				System.out.println(i + " is odd");
			}
		*/	
		//Challenge Questions
		// i want you to loop from 1 - 100
		// if the number is divisible by 3, print TEK
		// if the number is divisible by 5, print School
		// if the number is divisible by 3 and 5, print TEKSchool
		// if not divisible by 3 or 5, then print the number
	
		for (int q = 1; q <= 100; q++) {
			if (q % 3 == 0 && q % 5 ==0) {
				System.out.println ("Tek School");	  
			}else if(q % 5 == 0) {
				System.out.println("School");		
			}else if(q % 3 == 0) {
			    System.out.println("Tek ");
			}else{ 
				System.out.println(q );
			}
		
	
		
		
		}
		

	}

}
