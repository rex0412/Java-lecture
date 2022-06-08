package practice;

public abstract class Creature {
	// x, y : ���� ��ġ ��ǥ
	// age : ����
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
