package Firstjavaprogram;

public class ShortCutOperatonsAndCasting {

	public static void main(String[] args) {
		
		int x = 10;        //intializing
		
		System.out.println(x * 5);
		x = 5;             // assignment
		System.out.println(x + 1); // addition,but not assignment
		System.out.println(x);
		
		System.out.println("*************************");
		
		int w = 5;
		int e = 10;
		w = e;
		e = w;
//		both e and w are 10
		System.out.println(10 + e);
		
		System.out.println("*************************");
		
		int x1 = 5;
		double y = 2.0;
		int z = 3;
		double j = x1 / y + z;  // j is 5.5
		x1 = (int) j + z;       // x1 is 8.5 but since casted to int it will .5 (now its 8)
		y = z * x1;      // y is 24
		System.out.println("The end value of x: " + x1);
		System.out.println("The end value of y: " + y);
		System.out.println("The end value of z: " + z);
		System.out.println("The end value of j: " + j);
		
		System.out.println();
		
	}

}
