package submit;

public class Matrix {

	public static void main(String[] args) {

		int[][] arr = new int[5][];
		
		for (int i = 0; i < 5; i++) {
			arr[i] = new int[5-i];
			
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (i+1)*(j+1);
				System.out.print(arr[i][j]); 
			}
			
			System.out.println("");
		}
		
	}

}
