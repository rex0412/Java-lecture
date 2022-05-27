package day04;

public class CallByTest {

	public static void main(String[] args) {
		
		CallByTest test = new CallByTest();

		int value = 10;
		
		int[] arr = {10, 20, 30, 40};
		
		System.out.println(test.addOne(value));
		System.out.println(value);
		
		
		test.addOne(value);
		test.addOne(arr);

	}
	
	public int addOne(int value) {
		value++;
		return value;
	}
	
	public void addOne(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i]++;
			
		}
	}

}
