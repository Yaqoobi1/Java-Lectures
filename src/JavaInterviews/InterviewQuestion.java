package JavaInterviews;

public class InterviewQuestion {

	public static void main(String[] args) {
		String email = "sooom";
		System.out.println(processEmail(email));
	}
	public static String processEmail(String str) {
		String temp = "";
		for (int i = 1; i < str.length() - 1; i++) {
			temp += "*";
		}
		return str.charAt(0) + temp + str.charAt(str.length() - 1);
	}
}
