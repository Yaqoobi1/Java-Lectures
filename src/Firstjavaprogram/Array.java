package Firstjavaprogram;

public class Array {

	public static void main(String[] args) {
	                      // arrays:
	//1
		// Arrays are used to store multiple values in a single variable, instead of
		// declaring separate variables for each value.
		// To declare an array, define the variable type with square brackets:

		// Declaration:
		int[] data1;
		//Allocation:
		data1 = new int[5];
		
		//Declaration and Allocation together.
		// Before equation operator is declaration and
		// after equation is allocation memory for fixed number of integer:
		
		int[] data = new int[8];

		// Initialization:
		data[0] = 5;
		data[1] = 12;
		data[2] = 23;
		data[3] = 562;
		data[4] = 12;
		data[5] = 34;
		data[6] = 34;
		data[7] = 12;
		
		// i 0 - 7 < 8
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + "  ");
		}
		// We can initialization by two ways
		int data2[] = { 5, 12, 23, 562, 12, 34, 34, 12 };
   

		System.out.println("\n********");
		
	//2
			int total = 0;
		    for (int i = 0; i < data2.length; i++) {
			total = total + data2[i];
			}
		    System.out.println("total is " + total);
		    
		System.out.println("\n**********");
	
	//3	 
        //int [] t = new int[5];
	    double [] t = { 2, 4, 9, 15, 30 };
		System.out.println(t[1] + t[3] / t[4]);
		System.out.println(" \n****************");
		
	//4 print length of an Array	
		System.out.println(data2.length);

		
	   System.out.println("\n*************");
	   
	     //5  create a two dimension array with name nums with data type 
	             //of int with size
				// of 10 x 10
				// then create a two dimension loop that goes through the array and assign a
				// value to each index
				// the values should be 1 - 100 on first row
				// 201 - 300 on the second row
				// etc...
				// nums[i][j] = 1; // when its done, create another nested loop to go through and print it 
			   int[][] nums = new int[10][10]; // creating an array on in 10x10
				int number = 1; // creating an int starting from 1
				for (int i = 0; i < nums.length; i++) { // looping through all of the rows
				for (int j = 0; j < nums[i].length; j++) { // looping through all of the cells in each row 
					nums[i][j] = number++; // assigning the number to that cell and then increasing the number by 1 
					}
				}

				for (int i = 0; i < nums.length; i++) { // looping through each row
				for (int j = 0; j < nums[i].length; j++) { // looping through all of the cells of each row
				System.out.print(nums[i][j] + "\t"); // printing the value of that cell on the same line and adding space after each
				}
				System.out.println(); // going to the next line after each row is done
				}
				
		//6
				System.out.println("\n***************");
				
				String b[] = { "SD", "AK", "CA" }; 
				String twoDimension[][] = { { "SD", "AK" }, { "AL", "MS", "EC" }, { "DE", "OK", "IL" } }; 
				for (int row = 0; row < twoDimension.length; row++) {
				for (int col = 0; col < twoDimension[row].length; col++) {
				System.out.print(twoDimension[row][col] + " ");
				}
				System.out.println();
				} 
		//7
				System.out.println("\n*************");
				
				int[][] a = new int[3][3];
				// 1,2,3
				// 4,5,6
				// 7,8,9 
				a[0][0] = 1;
				a[0][1] = 2;
				a[0][2] = 3; 
				
				a[1][0] = 4;
				a[1][1] = 5;
				a[1][2] = 6; 
				
				a[2][0] = 7;
				a[2][1] = 8;
				a[2][2] = 9; 
				
			
				for (int i = 0; i < a.length; i++) { // looping through each row
					for (int j = 0; j < a[i].length; j++) { // looping through all of the cells of each row
					System.out.print(a[i][j] + "\t"); // printing the value of that cell on the same line and adding space after each
					}
					System.out.println(); // going to the next line after each row is done
					}
				
					
				
	}
}
