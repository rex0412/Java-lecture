package practice;

public abstract class Creature {
	// x, y : 현재 위치 좌표
	// age : 나이
	int x;
	int y;
	int age;
	
	Creature(int x, int y, int age) {
		this.x = x;
		this.y = y;
		this.age = age;
	}

	abstract void attack();
	void printInfo() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Creature [x=" + x + ", y=" + y + ", age=" + age + "]";
	}
	
	
}
