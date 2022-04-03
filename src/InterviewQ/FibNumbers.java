package InterviewQ;
import java.util.ArrayList;
import java.util.List;

public class FibNumbers {

	public static void main(String[] args) {
		// Fibonacci
		// 0, 1, 1, 2, 3, 5, 8, 13, 21
		// write a function that returns fib numbers in a range given
		// example fib less than 21
		// answer: 0, 1, 1, 2, 3, 5, 8, 13, 21
		System.out.println(fibNums(10000));
		} public static List<Integer> fibNums(int max) {
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(0);
		nums.add(1); int currentNum = 0; while (true) {
		// get the previous two indexes in the list of numbers
		// and add them together
		currentNum = nums.get(nums.size() - 1) + nums.get(nums.size() - 2);
		// add the result to the arraylist
		if(currentNum > max ) {
		break;
		}
		nums.add(currentNum);
		} return nums;
		}}

