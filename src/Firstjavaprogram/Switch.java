package Firstjavaprogram;

public class Switch {

	public static void main(String[] args) {
		        // Target
				// Costco
				// Whole food
				// Best buy
				String storeToShop = "Costco";
				
				//If statement Starts
				
				System.out.println("list from if statement:");
				if (storeToShop.equals("Target")) {
					System.out.println("shoes");
					System.out.println("t-shirt");
		
				} else if (storeToShop.equals("Costco")) {
					System.out.println("water");
					System.out.println("cake");
					System.out.println("paper towel");
				} else if (storeToShop.equals("Whole food")) {
					System.out.println("fruits");
					System.out.println("cheese");
				} else if (storeToShop.equals("Best buy")) {
					System.out.println("laptop");
					System.out.println("iphone");
				} else {
					System.out.println("nothing to buy from this store has been listed. get out.");
					System.out.println();
				}
				// Switch Starts
				
				System.out.println("list from switch:");
				switch (storeToShop) {
				case "Target":
					System.out.println("shoes");
					System.out.println("t-shirt");
					break;
				case "Costco":
					System.out.println("water");
					System.out.println("cake");
					System.out.println("paper towl");
					break;
				case "Whole food":
					System.out.println("fruits");
					System.out.println("cheese");
					break;
				case "Best buy":
					System.out.println("laptop");
					System.out.println("iphone");
					break;
				default:
					System.out.println("no store matched");
					System.out.println();
					
			
			
//					Switch (expression) {
//						Case   caseValue1:
//						              Statement;
//						Break ;
//						Case   caseValue2:
//						             Statement;
//						Break ;
//						Default:
//						      Statement;
//						Break ;
//						}
//						Switch statement expression cannot be Boolean
//						Case values must be matching with the switch statement’s expression
//						Case value must be unique
//						Default: gets executed if none of case are matching
//						Break statement : used for  exiting the switch statement  block , if we do not use the break the next case will be executed
//						Switch does not accept : long , double , float and Boolean

				
	}
	
	}
}
