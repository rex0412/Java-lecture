import java.util.Arrays;

public class DebugTest {
	static int[] arr = new int[10];

	public static void main(String[] args) {
		
		int dan = 5;
		
		for (int i = 0; i < 10; i++) {
			arr[i] = multi(i, dan);
		}
		
		System.out.println(Arrays.toString(arr));

	}
	
	static int multi(int num1, int num2) {
		return num1 * num2;
	}

}
