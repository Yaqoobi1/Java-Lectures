package Firstjavaprogram;

public class LabSession {

	public static void main(String[] args) {
		/*
	// 1
		System.out.println("\n*********************************");
		
		int[][][] data = new int[2][15][3];
		int number = 1;
		for (int table = 0; table < data.length; table++) { // this loop is going through the 3rd dimension / 2 two
															// tables
			for (int row = 0; row < data[table].length; row++) { // this is going through each row of the tables
				for (int cell = 0; cell < data[table][cell].length; cell++) { // going through the cells of each row
					data[table][row][cell] = number++; // we assign the number to that index and then increase it by one
				}
			}
		}
		for (int[][] table : data) { // this goes through the 3rd dim and returns a 2dim on each iteration
			for (int[] row : table) { // this goes through 2dim and returns 1dim on each iteration
				for (int cell : row) { // this goes through 1dim and returns int on each iteration
					System.out.print(cell + "\t");// printing the cell value and one space in the same line
				}
				System.out.println(); // going to the next line
			}
			System.out.println("------------------"); // this adds a separator between tables
			*/
		/*
     // 2	
		int[] data = { 54, 415, 5, 454, 1, 5, 1, 21, 5, 1, 21, 5, 14, 1, 1, 5, 4, 5, 4, 8 };
		// we want to loop through this array and find the largest number in this is
		// array
		int largest = data[0];
		int smallest = data[0];
		int sum = 0;
		int avg = 0;
		// find the smallest number in this array
		// find the sum of all of the numbers in the array
		// find the average of the numbers in the array
		

		for (int i = 0; i < data.length; i++) {
			if (data[i] > largest) {
				largest = data[i];
			} else if (data[i] < smallest) {
				smallest = data[i];
			}
		
			sum += data[i];
			
		}
	
		// print all of the numbers
		for (int i : data) {
			System.out.print(i + ", ");
			
		}
	
		System.out.println();
		System.out.println(" ******************");
		
		System.out.println("Largest Value: " + largest);
		System.out.println("Smallest Value: " + smallest);
		System.out.println("Sum Value: " + sum);
		System.out.println("Count of Values: " + data.length);
		System.out.println("Average Value: " + ((double)sum/data.length)); // sum / count
/*
      // 3
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
	// 4	
			} String[] d = new String[5];
			d[0] = "testing";
			d[1] = "if";
			d[2] = "I";
			d[3] = "undrestand";
			d[4] = "this"; for (String x : d) {
			System.out.print(x + " ");
			} System.out.println(); 
		//5
			for (int i = 0; i < d.length; i++) {
			System.out.print(d[i] + " ");
			} // do the same thing in a while loop
			System.out.println();
		//6
			int num = 0;
			while (num < d.length) {
			System.out.print(d[num++] + " ");
			} System.out.println("\n*********************************");
			
	//7 for loop
		 int[] d = { 546, 45, 441, 21, 5, 4, 51, 857, 8, 4, 5, 48, 4, 5, 45, 45, 85 };
		 
		 System.out.println("for loop ");
		 for (int i = 0; i < d.length; i++) {
		 System.out.print(d[i] + " ");
		 }
		 System.out.println();
		 // pointer vs index number d[i]
		 // pointer -- will point at the index value - so i in the foreach loop is the
		 // value of that index
		 // index number d[i] -- will be used to refer to that index, so d[i] will point
		 // to the value of that index
	//8 for each
		 System.out.println("for each");
		 for (int i : d) {
		 System.out.print(i + " ");
		 }// for(datatype(int) pointer: nameOfArray) {
		 // // the only difference is that you pointer in here is not the index number, it is the value in that index
		   */ 
		  
	//9 
		int x = 0;

		System.out.println("while loop ");
		while(x > 0) {
		System.out.println(x++);
		}
		
		//While loop
		// 1. we check the condition
		// - if true - we run the body
		// - if not - nothing

  //11
		System.out.println("do while loop ");
		do {
		System.out.println(x++);
		if(x > 100)
			break;
		} while (x > 0);

		// do {
		// 
		// } while (conditions);
		// do while
		// 1. run the body of the loop
		// 2. check the condition
		// - if true - we run the body
		// - if not - nothing

		// this means that we guarantee at least one execution of the body of the loop

			}	
			
		

}
