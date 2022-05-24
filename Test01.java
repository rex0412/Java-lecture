package submit;

public class Test01 {
	
	public static void main(String[] args) {
		
		int[][] arr = new int [3][3];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 1; j < 4; j++) {
				arr[i][j-1] = 3*i+j;
				
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
