package Firstjavaprogram;

public class Palindrome1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "racecar";
		String rev = "";
		for(int i = word.length()- 1; i >= 0; i--) {
			rev = rev + word.charAt(i);
			
		}
		
		System.out.println("The word: "+ word);
		System.out.println("The reversed of the word: " + rev);
	//	System.out.println(word.equals(rev)? "Palindrome":"Not Palidrome");//we can show the Palindrome word by either ways
		
	    if (word.equals(rev)) {
	    	System.out.println("the word is Palidrome");
	    }else {
	    	System.out.println("The word is Not Palidrome");
	    }
		
	    //Initializing two variables forward and backward
	    String word2 =  "123454321";
	    	
	    		
	    for(int forward = 0,backward = word2.length()-1;forward < word2.length();forward++,backward--) {
	    	if (forward == backward || forward > backward) {
	    		System.out.println("The word is Palindrome");
	    		break;
	    	}
	    	if (word2.charAt(forward)!= word2.charAt(backward)) {
	    		System.out.println("The word is Not Plindrome");
	    		break;   
	    		}
	    }
	    
	    	
	   
	    
	}
	
}	




	
