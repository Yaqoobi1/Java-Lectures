package Firstjavaprogram;

public class WhileLoop {

	public static void main(String[] args) {

		/*
		 * System.out.println("******************Q1*****************"); // 1 2 3 4 5 6 7
		 * 8 9 10
		 * 
		 * int q1 = 1; while (q1 < 10) { System.out.println(q1++); }
		 * 
		 * 
		 * System.out.println("*****************Q2*******************"); // 1 3 5 7 9
		 * 
		 * int q2 = 1; while (q2 <= 10) { System.out.println(q2); q2 += 2; }
		 * 
		 * 
		 * System.out.println("*****************Q3********************"); // 1 2 3 4 5
		 * 
		 * int q3 = 1; while (q3 <= 5) { System.out.print(q3++ + "   "); }
		 * 
		 * System.out.println(); System.out.println();
		 * 
		 * 
		 * System.out.println("*****************Q4*********************"); // 5 4 3 2 1
		 * 
		 * int q4 = 5; while (q4 > 0) { System.out.print(q4-- + "   "); }
		 * 
		 * System.out.println();
		 
		double balance = 100;

		double payment1 = 9;

		int numOfPayment = 1;

		while (balance > 0) {

			if (balance - payment1 > 0) {
				// after deducting the payment from the balance - balance is still more than
				// zero
				balance = balance - payment1;
			} else {
				// after deducting the payment from the balance - the balance is negative
				// change the payment amount
				payment1 = balance;
				balance = balance - payment1;
			}

			numOfPayment++;

			System.out.println(numOfPayment + " " + balance);
			*/
		
			char c = 'a';
			while (c <= 'z') {
				System.out.print(c);
			
				if (c != 'z') {
					System.out.print(", ");
				}
				c++;
			}
/*
			System.out.println();
			int b = 5;
			int y = 10 - 6;
			System.out.println(y);
			double balance = 5500; // beginning balance
			double payment1 = 300; // the amount i pay every cycle
			int numberOfPayments = 0; // this is to keep track of the number of payments
			while (balance > 0) { // I want loop for as long as my balance is more than zero
				numberOfPayments++; // every time that i pay, i increase the number of payments
				
				if (payment1 > balance) { // if the payment I am going make (300) is more than the balance I have
					payment1 = balance; // lets change the payment i have to pay to the current balance
				}
				
				System.out.println(numberOfPayments + "= balance " + balance + " - " + payment1 + " = " + (balance - payment1)
						+ " is the balance after payment"); // print the whole thing
				balance = balance - payment1; // update the balance and deduct the payment that was made
			}
			System.out.println(numberOfPayments); // print the number of payments made at the end
			*/
	}
			
		

}
