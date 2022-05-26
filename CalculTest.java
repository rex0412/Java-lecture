package submit;

import data.Calculator;

public class CalculTest {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		cal.plus(5, 3);
		cal.minus(0, 0);
		cal.multiply(0, 0);
		cal.divide(1, 1);
		
		System.out.println(cal.plus(5, 3));
		
	}

}
