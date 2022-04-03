package InterviewQ;
import java.util.Stack;
public class ReverseIntExample {

	public static void main(String[] args) {
		// how do you reverse an int without using String
				System.out.println(revInt(12345));
				System.out.println(revInt2(12345));
				System.out.println(revInt3(12345));
			}
			public static int revInt(int x) {
				int rev = 0; // 5
//				System.out.println("/" + x / 10); // everything beside the last digit
//				System.out.println("%" + x % 10); // it gives the last digit
				// x = 12345
				for (; x != 0; x = x / 10) {
					int temp = x % 10; // the last digit
					rev = rev * 10 + temp; // rev = 5 ==== temp = 5
				}
				return rev;
			}
			public static int revInt3(int num) {
				int rev = 0, temp = 0;
				while (num > 0) {
					temp = num % 10;
					rev = rev * 10 + temp;
					num /= 10;
				}
				return rev;
			}
			public static int revInt2(int num) {
				int temp = 0;
				Stack<Integer> tempStack = new Stack<>();
				while (num != 0) {
					tempStack.add(num % 10);
					num /= 10;
					temp = temp * 10 + tempStack.pop();
				}
				return temp;
			}
		}