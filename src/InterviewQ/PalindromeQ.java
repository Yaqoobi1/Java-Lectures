package InterviewQ;

public class PalindromeQ {

	public static void main(String[] args) {
		String str = "Jack";
		System.out.println(isPalindrome(str));
	}
	public static boolean isPalindrome(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		System.out.println(str + " ==== " + rev);
		return str.equals(rev);
	}
}

