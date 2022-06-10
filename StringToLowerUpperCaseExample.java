import java.util.Scanner;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		
//		String str1 = "java Programming";
//		String str2 = "Java Programming";
//		
//		System.out.println(str1.equals(str2));
//		
//		String lowerStr1 = str1.toLowerCase();
//		String lowerStr2 = str2.toLowerCase();
//		System.out.println(lowerStr1.equals(lowerStr2));
//		
//		System.out.println(str1.equalsIgnoreCase(str2));
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		
		String result = ""; 
		
		int tmp;
        
		for(int i = 0; i < input.length(); i++) {
			
			tmp = (int)input.charAt(i);
			
			if((65 <= tmp) && (tmp <=90)) {
				
				result += (char)(tmp + 32);
				
			} else if((97 <= tmp) && (tmp <= 122)) {
				
				result += (char)(tmp - 32);
				
			} else {
				
				result += (char)tmp;
				
			}
			
		}
		
		System.out.println(result);
		 
    }

}

