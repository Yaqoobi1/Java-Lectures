package Firstjavaprogram;

public class ForEach {

	public static void main(String[] args) {
	//1 For loop
		 int[] d = { 546, 45, 441, 21, 5, 4, 51, 857, 8, 4, 5, 48, 4, 5, 45, 45, 85 };
		
		 System.out.println("for loop ");
		 for (int i = 0; i < d.length; i++) {
		 System.out.print(d[i] + " ");
		 }
		 System.out.println();
		 /*
		 // pointer vs index number d[i]
		 // pointer -- will point at the index value - so i in the foreach loop is the
		 // value of that index
		 // index number d[i] -- will be used to refer to that index, so d[i] will point
		 // to the value of that index
		 */
	//2 For Each
		 System.out.println("for each");
		 for (int i : d) {
		 System.out.print(i + " ");
		 }// for(datatype(int) pointer: nameOfArray) {
		 // the only difference is that you pointer in here is not the index 
		// number, it is the value in that index
		/*
    //3While loop

		 int x = 0;

		 System.out.println("while loop ");
		 while(x > 0) {
		 System.out.println(x++);
		 }
		 //While loop
		 // 1. we check the condition
		 // - if true - we run the body
		 // - if not - nothing
		  * 
		  */
/*
 * 
   //4 do while loop
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
*/
   //5 
	}

}
