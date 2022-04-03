package Assignment1;



public class Question3 {
	
	
	public static void main(String[] args) {
		
	
	
		
		String[] colors = { "blue", "red", "brown", "white", "yellow" };
		int[] nums = { 15, 18, 26, 24, 25, 8, 5, 411, 26, 2, 1 };
		for (String string : colors) {
			System.out.print(string + ", ");
			
		}
		System.out.println("  ");
		System.out.println();
		
		
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
			
		}
		
		System.out.println();
			for (int j = 0; j < nums.length; j++) {
				System.out.print(nums[j]+ "  ");	
			}
			
	}	
	
}
