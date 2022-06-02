package day08;

public class Cat extends Animal {
	
	Cat(String name) {
		super(name);
	}

	public Cat() {
		
	}

	@Override
	void say() {
		System.out.println("Meaw");
	}
	
	void nightSee() {
		System.out.println("See at night well");
	}

}
