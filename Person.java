package submit;

public class Person {
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		System.out.println("Person 생성자 호출됨");
		this.name = name;
		this.age = age;
	}
	
	void printInfo() {
		System.out.println(this.name + ", " + this.age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
