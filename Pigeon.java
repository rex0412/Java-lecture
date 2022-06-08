package practice;

public class Pigeon extends Animal implements Flyable {

	public Pigeon(int x, int y, int age) {
		super(x, y, age);
	}

	@Override
	public void fly(int y) {
		this.y += y;

	}

	@Override
	public void flyMove(int x, int y) {
		
		this.y += y;
		this.x += x;

	}

}
