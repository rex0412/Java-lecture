package day08;

public class Animal {
	
	String name;
	
	Animal(String name) {
		this.name = name;
	}
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	void say() {
		System.out.println("������ ����");
	}
	void breathe() {
		System.out.println("��������");
	}
	void attack(Animal a) {
		System.out.println(this.name + " -> " + a.name + "��/�� ����");
	}
}
