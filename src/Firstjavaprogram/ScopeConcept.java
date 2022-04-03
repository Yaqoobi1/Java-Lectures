package Firstjavaprogram;

public class ScopeConcept {

	public static void main(String[] args) {
		                        // Scope Concept
		 /*(In Java, variables are only accessible inside the region they are created. 
		 This is called scope.
	    Scope refers to the lifetime and accessibility of
		a variable. How large the scope is depends on where a variable is declared. 
		For example, if a variable is declared at the top of a class then it will 
		accessible to all of the class methods. If it’s declared in a method then
		it can only be used in that method.*/
		
		int t = 100;  // these variables can be accessible from all class. 
		int k = 200;  
		
		 // Code here CANNOT use x

	    { // This is a block

	      // Code here CANNOT use x

	      int x = 100;

	      // Code here CAN use x
	      System.out.println(x); //1st result 100.

	   } // The block ends here

	  // Code here CANNOT use x
	    
	   
		if (true){    // int h created in a separate block to show that can not be  
		int h = 300;   // accessed form out of this block.
		}
//	System.out.println(t + k + h);// "h" is in the separate block,so it can not get printed

		
	int x = 10;
	int y = 15;
	
	if (true) {
		int z = 17;
		
		System.out.println(x + y + z); // 2nd result 42
	}
	
//	System.out.println(x + y + z);// "Z" is in the separate block,so it can not get printed

	System.out.println(t + k); // 3rd result 300 the variables are on the top.
}

}
