package submit;

public class Student extends Person {
	final int studentId = 20308;
	
	public Student(String name, int age) {
		super(name, age);
		System.out.println("Student ������ ȣ���");
	}
	
	@Override
	public
	void printInfo() {
		System.out.println(this.getName() + ", " + this.getAge() + ", " + this.studentId);		
	}

}
