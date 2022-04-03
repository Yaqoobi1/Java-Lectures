
package Firstjavaprogram;

public class Palindrome {

	
	public static void main(String[] args) {
   
		
    // Palindrome:
		// you will be given a string,
		// find if it is Palindrome?
		// dad mom
		// 123454321
		// madam
		String word = "123454321";
		// if the reverse of the word is same as the word itself, it is palimdrome
		String rev = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			rev = rev + word.charAt(i);
		}
		
		
		System.out.println("word: " + word);
		System.out.println("reverse: " + rev);
		System.out.println(word.equals(rev) ? "Palimdrome" : "Not Palindrome");// line No 1

		/*
		 * This same as line No 1,you can show the result bye either ways if
		 * (word.equals(rev)) { System.out.println("the word is palindrome"); } else {
		 * System.out.println("the word is not palindrome");
		 */
		//

		// book
		// abccba
		// 012345

		String word2 = "racecar";
		// in this loop we are initializing 2 variables forward and backward
		// forward will start from beginning and goes to the end
		// backward will start from last index and goes to the first

		// condition of the loop will run for the length of the word, but we will stop
		// in the middle by using keyword break
		for (int forward = 0, backward = word2.length() - 1; forward < word2.length(); forward++, backward--) {
			// if the length is odd, the middle will be the same value
			// if the length is even, we pass the middle of the word when forward is bigger
			// than the backward
			// when we reach or pass the middle and everything is the same so far, we can
			// stop comparing, its palindrome and we can get out
			if (forward == backward || forward > backward) {
				System.out.println("Palindrome");
				break; // used to stop the loop
			}
			// if we have not passed the middle of the word yet and we find a char that does
			// not match, then the word is not palindrome
			// so we can stop checking and get out
			if (word2.charAt(forward) != word2.charAt(backward)) {
				System.out.println("not palindrome");
				break; // used to stop the loop
			}

		}

	}
	
	

}
