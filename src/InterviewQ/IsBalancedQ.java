package InterviewQ;
import java.util.Stack;
public class IsBalancedQ {

	public static void main(String[] args) {
		String sample = "{<[]>}()()(())"; System.out.println(isBalanced(sample));
	} public static boolean isBalanced(String str) {
	Stack<Character> charStack = new Stack<>(); // creating a stack // going through all of the chars of the string
	for (char c : str.toCharArray()) { if (c == '(' || c == '<' || c == '[' || c == '{') { // the
	charStack.add(c);
	} else {
	// the char of this iteration is not an opening
	if (c == ')') { // checking to see if the char is a closing
	if (charStack.size() == 0 || charStack.pop() != '(') {
	return false;
	}
	}
	if (c == '>') { // checking to see if the char is a closing
	if (charStack.size() == 0 || charStack.pop() != '<') {
	return false;
	}
	}
	if (c == '}') { // checking to see if the char is a closing
	if (charStack.size() == 0 || charStack.pop() != '{') {
	return false;
	}
	}
	if (c == ']') { // checking to see if the char is a closing
	if (charStack.size() == 0 || charStack.pop() != '[') {
	return false;
	}
	}
	}
	} return charStack.size() == 0;
	}
	}
