package practice;

public abstract class Animal extends Creature {

	Animal(int x, int y, int age) {
		super(x, y, age);
	}

	@Override
	void attack() {
		
		System.out.println("Dash!");

	}

}
