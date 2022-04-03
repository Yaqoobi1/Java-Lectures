package CalcExample;

public class CalcuRunner {

	public static void main(String[] args) {
		
		
		CalculatorTem obj = new CalculatorTem();
		obj.getSum(15.8, 59.48);
		obj.getDiv(15.5, 87.53);
		obj.getDiv(15, 0);
		obj.getDiv(0, 1);
		double result = obj.getMult(10, 50);
		System.out.println(result);
		obj.getsubtraction(45, 8.95);
		obj.getTaxAmount(589.97, 5.8);
	


	}

}
