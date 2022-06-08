package practice;

public abstract class Human extends Creature implements Talkable {

	Human(int x, int y, int age) {
		super(x, y, age);

	}

	@Override
	public void talk() {
		
		System.out.println("I can talk!");

	}

	@Override
	void attack() {

		System.out.println("Attack with tool!");

	}

}
