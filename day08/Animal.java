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
		System.out.println("뭔가를 말함");
	}
	void breathe() {
		System.out.println("후하후하");
	}
	void attack(Animal a) {
		System.out.println(this.name + " -> " + a.name + "을/를 공격");
	}
}
