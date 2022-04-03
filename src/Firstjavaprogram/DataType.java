package Firstjavaprogram;

public class DataType  {

	public static void main(String[] args) {
   
		/*
		 * Data Types in Java // We have two data types in Java // 1 - Primitive Data
		 * Types // boolean, byte, char, short, int, long, float, double // --- //
		 * Numeric Types: byte, short, int, double, float: they always store numbers
		 * (whole/decimal points) // char: we can store single letter or number; //
		 * boolean Type: allays store true or false // --- // 2 - Non-Primitive Data
		 * Types/reference type // String, Array etc... // --- // String Type: stores
		 * combination of chars as a single text // --- //
		 */
//		
//		//byte: 1 byte of data = -128 to 127
//		byte nbrByte = 127;
//		//short: 2 bytes of data = -32,768 to 32,767
		short nbrShort = 32767;
//		//int: 4 bytes of data = -2,147,483,648 to 2,147,483,647
		int nbrInt = 2147483647;
//		
//		//I want to store phone numbers
//		//country code, area code and phone number
		int countryCode = 1;
		int areaCode = 571;
		int cellPhoneNumber = 5789;
		System.out.println(countryCode + "-" + areaCode + "-" + cellPhoneNumber);
//		
//		//long: 8 bytes of data = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		long nbrLong = 9223372036854775807L;
//		
//		//The value of all 500 fortune companies in the US
		long _500FortuneComapniesValue = 100000000000000L;
//		
//		//double: 8 bytes of data = Stores fractional numbers. Sufficient for 
//		storing 15 decimal digits
		double nbrDouble = 5.5d;

//		//float: 4 bytes of data = Stores fractional numbers. Sufficient for 
//		storing 6 to 7 decimal digits
		float nbrFloat = 3.9f;

//		//char: 2 bytes of data = 'a', 'A', '6' or ascci value
		char chrLetter = 'A';
//		
//		//Ahmad is working in a company and his annual salary is $95000
//		//I want pay his salary on bi-weekly bases
//		//how much is bi-weekly paycheck?
//		//a year is 52 weeks, bi-weekly mean every two weeks that is 26(bi week means two times a week)  

		double anuualSalaryDouble = 95000.00;
		double biWeeklyPaycheckDouble = anuualSalaryDouble / 26;
		System.out.println(biWeeklyPaycheckDouble);
//		result is 3653.846153846154

		float anuualSalaryFloat = 95000.00f;
		float biWeeklyPaycheckFloat = anuualSalaryFloat / 26;
		System.out.println(biWeeklyPaycheckFloat);
//		//result is 3653.8462
//		
//		//John's salary is $96000.52 a year
//		//calculate his weekly salary

		double annualSalarydouble = 96000.52;
		double weeklySalarydouble = (annualSalarydouble / 52);
		System.out.println(weeklySalarydouble);
//		//the result is 1846.16385

		// boolean: 1 byte of data = it can always equal to true or false
		boolean blnBoolean = true;
		System.out.println(blnBoolean);
		
		// String is a reference type: String is a class in Java
		// When we create a String, the String value is a String Object stored in String
		// Pool in the Heap
		//
		String strSubject = "Java";
		strSubject = "Selenium";
		System.out.println(strSubject);
		
		
		

	}

	
		
	

}
