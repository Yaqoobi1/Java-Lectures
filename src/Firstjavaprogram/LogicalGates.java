package Firstjavaprogram;

public class LogicalGates {

	public static void main(String[] args) {
		int age = 25;
		double creditScore = 651;
		boolean inDebt = false;
		 if(age > 21) {
			 System.out.println("can apply for loan");
		 }
		// and && - both conditions must be true for the result to be true
		if (age > 21 && creditScore > 650) {
			System.out.println("AND -- can apply for loan");
			}
		else {
			System.out.println("Can not apply");
		}
		// or || - only one side must be true for the result to be true
		if (age > 21 || creditScore > 650) {
			System.out.println("OR -- can apply for loan");
		}
		// not ! - is going to reverse the logic
		// != not equal to
		// if age is more than 21 and score is more 650 and they are not inDebt
		if (age > 21 && creditScore > 650 && inDebt != true) {
			System.out.println("NOT -- can apply for loan");
		}

//		System.out.println(!(true || false));

		// true or anything is true
		// false and anything is false

		// xor - if both sides are the same = false -- if both sides are different =
		// true
		// true ^ false = true
		// false ^ true = true
		// false ^ false = false
		// true ^ true = false
/*
		System.out.println("XOR: " + (true ^ false));
		System.out.println("XOR: " + (false ^ true));
		System.out.println("XOR: " + (false ^ false));
		System.out.println("XOR: " + (true ^ true));
	*/
		
		
		int nbr1, nbr2, nbr3, nbr4, nbr5, nbr6, nbr7, nbr8, nbr9, nbr10;
		 nbr1 = 1;
		 nbr2 = 2;
		 
		 nbr3 = 3;
		 nbr4 = 4;
		 
		 nbr5 = 5;
		 nbr6 = 6;
		 
		 nbr7 = 7;
		 nbr8 = 8;
		 
		 nbr9  = 9;
		 nbr10 = 10;
		
		   if (nbr2 > nbr1) {
			 if (nbr4 > nbr3) {
				 if(nbr6 > nbr5) {
					 System.out.println("True!!");
				 }
			 }
		 }

	}

}
