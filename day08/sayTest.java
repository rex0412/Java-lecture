package day08;

public class sayTest {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.say();
		
		Animal c = new Cat();
		c.say();
		((Cat)c).nightSee();
		
		Animal d = new Dog();
		d.say();
		
		Dog cutedong = new Dog();
		((Dog)cutedong).say();
		
		Animal c1 = new Cat("ªÔªˆ¿Ã");
		Animal d1 = new Dog("¥©∑∑¿Ã");
		
		c1.attack(d1);

	}

}