package submit;

public class Test1 {

	public static void main(String[] args) {
		
		int[][] arr = new int[4][4];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length + 1; j++) {
				
				arr[i][j - 1] = 4 * i + j;
				
			}
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				
				System.out.print(arr[i][j]);
				System.out.print("  ");
				
			}
			
			System.out.println();
			
		}
		
		System.out.println("--------------------");
		
		int[][] rotatedArr = new int[4][4];
		
		for (int a = 0; a < rotatedArr.length; a++) {
			
			for (int b = 1; b < rotatedArr[a].length+1; b++) {
				rotatedArr[a][b - 1] = 4 * a + b;
				System.out.print(rotatedArr[a][b - 1]);
				System.out.print("  ");
				
			}
			System.out.println("");
			
		}
		
	}
}
