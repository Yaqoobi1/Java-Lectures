package Firstjavaprogram;

public class SelectExample1 {

	public static void main(String[] args) {
		// double item1
		// double item2
		// double item3
		// double taxRate
		// all of the variables that we need for this?
		double item1 = 100.0;
		double item2 = 99.0;
		double item3 = 54.0;
		double sum = item1 + item2 + item3;
		double taxRate = 2.5 / 100;
		double taxAmount = sum * taxRate;
		double shipment = sum * 10 / 100;
		double discount = sum * 3.8 / 100;

		if (sum > 500) {
			shipment = 0;
		} else if (sum > 300) {
			shipment = sum * 5 / 100;
		} else if (sum < 100) {
			shipment = sum * 15 / 100;
		}
		double grandTotal = sum + taxAmount + shipment - discount;

		// Shipment
		// if total > 500 = shipment free
		// if total > 300 and less than 500 = shipment is 5% of the total
		// if total < 100 = shipment 10% of total

		System.out.println("****Store Receipt***");
		System.out.println();
		System.out.println("Items:");
		System.out.println("Item......... $" + item1);
		System.out.println("Item......... $" + item2);
		System.out.println("Item......... $" + item3);
		System.out.println();
		System.out.println("Total\t\t...$" + sum);
		System.out.println("Tax(%2.5)\t...$" + taxAmount);
		System.out.println("Shipment\t...$" + shipment);
		System.out.println("Discount\t...$" + discount);
		System.out.println(".....................................");
		System.out.println("Grand Total\t...$" + grandTotal);

		// Store Receipt
		//
		// Items:
		// Item 1 ..... $amount
		// Item 2 ..... $amount
		// Item 3 ..... $amount
		//
		// Total ...... $the sum
		// TaxRate (%2.5)... $tax amount
		// Shipment ..... $ is 10% total
		// discount ..... 3.8%
		// Grand total ..... $ the sum after tax and shipment
		
		int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
		num1 = 1; // if 2 is more than 1
		num2 = 2;

		num3 = 3; // if 4 is more than 3
		num4 = 4;

		num5 = 5; // if 6 is more than 5
		num6 = 6;

		num7 = 7;
		num8 = 8;

		num9 = 9;
		num10 = 10;

		if (num2 > num1) {

			if (num4 > num3) {

				if (num6 > num5) {

					System.out.println("true!!!");
				}
			}
			}
	}

}
