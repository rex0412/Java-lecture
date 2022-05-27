package data;

public class Student1 {
	
	public String name;
	public int age;

	public Student1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student1 [name = " + name + ", age = " + age + "]";
	}

}
