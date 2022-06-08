package practice;

public class Life {

	public static void main(String[] args) {
		
		Kevin Kevin1st = new Kevin(0,0,30);
		Kevin1st.attack();
		Kevin1st.coding();
		Kevin1st.swimDown(25);
		
		Kevin1st.printInfo();
		
		System.out.println("-------------------");
		
		Turtle t1 = new Turtle(30, -100, 100);
		t1.attack();
		t1.swimDown(20);
		
		t1.printInfo();
		
		System.out.println("-------------------");
		
		Pigeon p1 = new Pigeon(30, 0 ,1);
		p1.attack();
		p1.fly(20);
		p1.flyMove(20, -10);
		
		p1.printInfo();
		
		System.out.println("----------------");

	}

}
