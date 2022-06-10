
public class StringSubstringExample {

	public static void main(String[] args) {
		
//		String ssn = "880815-1234567";
//		
//		String firstNum = ssn.substring(0, 6);
//		System.out.println(firstNum);
//		
//		String secondNum = ssn.substring(7);
//		System.out.println(secondNum);
		
		char[] ssn2 = {'8', '8', '0', '8', '1', '5', '-', '1', '2', '3', '4', '5', '6', '7'};
		
		int position = 0;
		
		for (int i = 0; i < ssn2.length; i++) {
			position++;
			if (ssn2[i] == '-') {
				break;
				
			}
			
		}
		
		for (int i = 0; i < position-1; i++) {
			System.out.print(ssn2[i]);
			
		}
		
		System.out.println("");
			for (int i = position; i < ssn2.length; i++) {
				
				System.out.print(ssn2[i]);
				
			}
			
	}

}
