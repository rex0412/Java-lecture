package practice;

public class Kevin extends Human implements Programmer, Swimable {

	Kevin(int x, int y, int age) {
		super(x, y, age);
		
	}

	@Override
	public void swimDown(int y) {
		
		if ((this.y-y) < -20) {
			System.out.println("���� 20���� ���ϴ� ������!");
			this.y = -20;
		} else {
			this.y = this.y - y;
		}
		
		this.y = this.y - y;
		
	}

	@Override
	public void coding() {
		
		System.out.println("I'm good at Java!");
		
	}

}
