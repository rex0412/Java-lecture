package day08;

public class Pet extends Animal {
	
	Pet(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	void cutie() {
		System.out.println("���濡 �ֱ�");
	}

	@Override
	void say() {
		System.out.println("���");
		
	}

}
