package submit;

import data.Student1;

public class StudentTest1 {

	public static void main(String[] args) {
		
		Student1[] arr = new Student1[4];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Student1("student"+(i+1), i+ 17);
			System.out.println(arr[i]);
		}

		System.out.println("----------------------");
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i].age = arr[i].age+1;
			
			System.out.println(arr[i]);
			
		}
	}
}
