package Firstjavaprogram;

public class ConditionalOperater {

	public static void main(String[] args) {
		                      //  Condition Operators
		                 //method (condition ? True : false)
		int num1 = 10;
		int num2 = 15;
//		without brackets
		
		String x = num1 > num2 ? "num1 is more than num2" : "num1 is less num2"; //(1)
		System.out.println(x);
		
    	int y = num1 > num2 ? num1-- : num1++; //(2)
    	System.out.println(y);
     	System.out.println(num1);
		
		double grade = 59;            //(3)
		String s = "The student is ";
		s += (grade >= 60 )? "passing." : "failing.";
		System.out.println(s);
		
		int t = 1;             //(4)
		t += 10;  // 11
		t = t + 10;
		System.out.println(t);
		
		
//		With brackets
		
		int a = 15;
		int b = 10;
		
		int max = ((a < b )? a : b); //(1) integer
    	System.out.println(max);
	    
    	String max1 = ((a > b )? "A is grater than B":"B is less than A"); //(2)
    	System.out.println(max1);
    	
    	String name = "";
    	System.out.println(name.isEmpty()? "The name is not valid" : name); //(3)
	    
    	String name1 = "Mohammad Tariq Yaqoobi";
    	System.out.println(name1.isEmpty()? "The name is not valid" : name1 ); //(4)
	    
	    String name2 = " Mohammad Tariq Yaqoobi";
	    System.out.println(!name2.isEmpty()? name2 :"The name is not valid" ); //(5)
	}



	

}
