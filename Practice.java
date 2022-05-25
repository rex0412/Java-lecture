package day03;

public class Practice {

	public static void main(String[] args) {
		
		int[] arr = new int[4];
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = i;
			
		}
		
		for (int value : arr) {
			
			System.out.print(value);
			System.out.print("  ");
			
		}

	}

}
