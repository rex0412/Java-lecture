import java.util.Scanner;

public class MathRandomExample {

	public static void main(String[] args) {
		
//		int num = (int) (Math.random()*6) + 1;
//		System.out.println("ÁÖ»çÀ§ ´«: " + num);
		
		/* int lotto[] = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			int num = (int) (Math.random()*49) + 1;
			lotto[i] = num;
			System.out.print(lotto[i]+" ");
		} */
		
		Scanner scanner = new Scanner(System.in);
		int num = (int) (Math.random()*50) + 1;
		
		while (num > 0) {
			int nu = scanner.nextInt();
			
			if (num == nu) {
				System.out.println("Correct");
				break;
				
			} else if(num > nu) {
				System.out.println("Up");
				
			} else if(num < nu){
				System.out.println("Down");
			}
			
		}

	}

}
