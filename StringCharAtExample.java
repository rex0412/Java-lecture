
public class StringCharAtExample {

	public static void main(String[] args) {
		
		String ssn = "010624-1230123";
//		char sex = ssn.charAt(7);
		char[] ssn2 = {'0', '1', '0', '6', '2', '4', '-', '1', '2', '3', '0', '1', '2', '3'};
//		switch (sex) {
		switch (ssn2[7]) {
		case '1':
		case '3':
			System.out.println("���� �Դϴ�.");
			break;
		case '2':
		case '4':
			System.out.println("���� �Դϴ�.");
			break;
		}

	}

}
