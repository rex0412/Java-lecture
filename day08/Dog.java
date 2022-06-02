package day08;

public class Dog extends Animal {
	
	

	Dog(String name) {
		super(name);
	}

	public Dog() {
		
	}

	@Override
	void say() {
		System.out.println("Woof");
	}
}
