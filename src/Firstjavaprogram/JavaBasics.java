package Firstjavaprogram;

public class JavaBasics {

	public static void main(String[] args) {

		addition(250, 350);
		subtraction(500, 200);
		divivsion(1000,500);
		multiplication(100,200);
	
	}

	/*
	 * boolean b = 57 < 17 || !(true) && 'c' != 'd' || (true ^ false);
	 * 
	 * System.out.println(b);
	 * 
	 * // increment - is increasing the value of the variable and assigning in back
	 * to // the variable
	 * 
	 * int x = 10; System.out.println(++x);
	 * 
	 * System.out.println(x);
	 * 
	 * System.out.println(x + 1);
	 * 
	 * System.out.println(x);
	 * 
	 * double credit = 600;
	 * 
	 * if (credit > 650) { System.out.println("can apply for loan"); } else if
	 * (credit > 600) { System.out.println("wait for a week"); } else {
	 * System.out.println("can not apply for loan"); }
	 * 
	 * int grade = 100; if (grade >= 90) { System.out.println("A"); } else if (grade
	 * > 80) { System.out.println("B"); } else if (grade > 70) {
	 * System.out.println("C"); } else { System.out.println("F"); }
	 * 
	 * 
	 * int score = 749; if (score >= 850) { System.out.println("Passed by" + " " +
	 * score); } else if (score >= 750) { System.out.println("Second chance" + " " +
	 * score); } else { System.out.println("failed "); } Boolean isPeaceGood = true;
	 * if (isPeaceGood) { System.out.println("Yes Peace is Good"); } else {
	 * System.out.println("No Peace is not Good"); } if (!isPeaceGood) {
	 * System.out.println("Yes Peace is Good"); } else {
	 * System.out.println("No Peace is not Good"); }
	 * 
	 * System.out.println(); int counter; int counter1;
	 * 
	 * for (counter = 10; counter <= 20; counter++)
	 * System.out.println("The counter is at: " + counter); System.out.println();
	 * 
	 * for (counter1 = 1000; counter1 >= 500; counter1 = counter1 - 100)
	 * System.out.println("The counter1 is at: " + counter1); System.out.println();
	 * int countdown;
	 * 
	 * for (countdown = 10; countdown >= 0; countdown = countdown - 1)
	 * System.out.println(countdown + "\n"); System.out.println("Blastoff!");
	 * 
	 * System.out.println();
	 * 
	 * int age = 25;
	 * 
	 * if (age >= 30) { System.out.println("Oh No I am older than 30");
	 * System.out.println("I may be a little older");
	 * System.out.println("but definitely I will be wiser"); }
	 * 
	 * if (age < 30) { System.out.println("Roses are red");
	 * System.out.println("Volites are blue");
	 * System.out.println("I like to king fu!"); System.out.println();
	 * 
	 * int inches, counter2 = 0; double feet;
	 * 
	 * for (inches = 1; inches <= 20; inches++) { feet = inches / 12.0;
	 * System.out.println(inches + "inches equal to " + feet + " feet");
	 * 
	 * counter2++; if (counter2 == 4) { System.out.println(); counter2 = 0;
	 * 
	 * int inches1, counter3 = 0; double feet1; for (inches1 = 1; inches1 <= 30;
	 * inches1++) { feet1 = inches1 / 12.0; if (inches1 == 1)
	 * System.out.println(inches1 + " inch equal to " + feet1 + " feet"); if
	 * (inches1 != 1) System.out.println(inches1 + " inches equal to " + feet1 +
	 * " feet"); counter3++; if (counter3 == 5) { System.out.println(); counter3 =
	 * 0; System.out.println();
	 * 
	 * Boolean doYouLoveToReadStoryBooks = true;
	 * 
	 * if(doYouLoveToReadStoryBooks){ System.out.println("Yes I Do");
	 * 
	 * }else { System.out.println(" No I do not"); } if(!doYouLoveToReadStoryBooks){
	 * System.out.println("Yes I Do"); System.out.println("No I dont");
	 * System.out.println();
	 * 
	 * String storeShop = "Dollar Tree"; System.out.println("Available Items:");
	 * switch (storeShop) { case "New Grand": System.out.println("Chess");
	 * System.out.println("Cola"); System.out.println("Bread"); break; case "Giant":
	 * System.out.println("Salt"); System.out.println("Paper");
	 * System.out.println("water"); break; case "Dollar Tree":
	 * System.out.println("Notebook"); System.out.println("Pen");
	 * System.out.println("Flowers"); break; case "Hobby lobby":
	 * System.out.println("Pots"); System.out.println("Mirror");
	 * System.out.println("Brush"); break;
	 * 
	 * default: System.out.println("No store matched"); } System.out.println();
	 * 
	 * System.out.println("Available Items"); if (storeShop.equals("Dollar Tree")){
	 * System.out.println("Cheese"); System.out.println("Cola");
	 * System.out.println("Bread"); }else if (storeShop.equals("Dollar Tree")){
	 * System.out.println("Notebook"); System.out.println("Pen");
	 * System.out.println("Flowers"); }else if(storeShop.equals("Giant")) {
	 * System.out.println("Salt"); System.out.println("Pepper");
	 * System.out.println("Water"); }else if(storeShop.equals("Hobby lobby")){
	 * System.out.println("Pots"); System.out.println("Mirror");
	 * System.out.println("Brush"); System.out.println();
	 */

	public static void addition(int num1, int num2) {
		int total = num1 + num2;
		System.out.println("The addition (250+350 = " + "" + total + ")");
	}

	public static void subtraction(int num3, int num4) {
		int total = num3 - num4;
		System.out.println("The subtracation (500-200 = " + total + ")");
	}
	public static void divivsion(int num5, int num6) {
		int total = num5/num6;
		System.out.println("The division (1000/500 = " + total + ")");
	}
	public static void multiplication(int num7, int num8) {
		int total = num7*num8;
		System.out.println("The multiplication (100*200 = " + total + ")");
	
	

	/*
	 * 
	 * int num = 10; long lnum = num; System.out.println(lnum);
	 * 
	 * double d = 4.255; int i = (int) d; System.out.println(i);
	 * 
	 * int x = 100; double y = 20.3; // y = x; // x = y; x = (int) 20.3; //
	  System.out.println(x);
*/
		
		int count = 1;
		System.out.println(++count);
			
		System.out.println(count++);
		
		
		System.out.println(count);
		
		int num=10;
		while (num>0 && num < 16) {
			System.out.println(num++);
			
			
	}
	}
}

	
	
	
	
	
	
	
	