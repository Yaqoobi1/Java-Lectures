
package Firstjavaprogram;


public class PracticeOne {

	public static void main( String args[]) {
		printNums(1,5);
	
	}
	
		public static void printNums(int start , int end) {
			
		for(int i = start; i <= end; i++ ) {
			for (int j = start; j <= end; j++) {
				for(int n = start; n <= end; n++) {
					System.out.println(i + ","+ j+ ", " + n);
				}
			}
		}
	}
	
}