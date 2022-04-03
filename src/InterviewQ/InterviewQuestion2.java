package InterviewQ;

public class InterviewQuestion2 {

	public static void main(String[] args) {
		// Question 1

				for (int q = 1; q <= 100; q++) {
					if (q % 3 == 0 && q % 5 == 0) {
						System.out.println("Tek School");
					} else if (q % 5 == 0) {
						System.out.println("School");
					} else if (q % 3 == 0) {
						System.out.println("Tek ");
					} else {
						System.out.println(q);
					}
				}

				// Question 2
				String word2 = "123321";
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


