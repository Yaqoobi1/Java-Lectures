package Firstjavaprogram;

public class Casting {

	public static void main(String[] args) {
		
                             //		Casting Lesson:
		  /*Type casting is when you assign a value of one primitive data type to another type.
          In Java, there are two types of casting:
          
       1- Widening Casting (automatically) - converting a smaller type to a larger type size
          byte -> short -> char -> int -> long -> float -> double

       2- Narrowing Casting (manually) - converting a larger type to a smaller size type
          double -> float -> long -> int -> char -> short -> byte
          */
		
		// Widening Casting:
		
		
		 int myInt = 9;
		    double myDouble = myInt; // Automatic casting: int to double

		    System.out.println(myInt);      // Outputs 9
		    System.out.println(myDouble);   // Outputs 9.0
		
		//Narrowing Casting:
		    
		    double myDouble1 = 9.78d;
		    int myInt1 = (int) myDouble1; // Manual casting: double to int

		    System.out.println(myDouble1);   // Outputs 9.78
		    System.out.println(myInt1);      // Outputs 9
	     
		    double x = 10.9;
		    int y = 5;
		System.out.println(x+y);// The result will 15.9 but after casting will be 15
		                           // it will lose 0.9
		    int bz = (int)(x + y);    // we casted (double x + y) to (int bz) while the result
		                         //is integer 15
		    System.out.println(bz);  
		    
		
		    System.out.println(x/y); // The result will 2.18 but after casting will be 2
		                             // it will lose 0.18
		    int az1 = (int)(x/y);    // we casted (double z) to (int az1) while the result
                                      //is integer 2 
		System.out.println(az1);
		
		
		    double x1 = 10 / 3;
		    double x2 = 10 / 3.0;
		    int x3 = 10 / 3;
		    int x4 = (int) (10 / 3.0);
		
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
	}

}
