package data;

public class Player {
	
	public String name;
	public int hp;
	public int mp;
	
	public Player(String name) {
		this.name = name;
		this.hp = 100;
		this.mp = 100;
	}
	
	public void attack() {
		System.out.println("attack!");
	}
	
	public void defense() {
		System.out.println("defense!");
	}

	@Override
	public String toString() {
		return "Player [name = " + name + ", hp = " + hp + ", mp = " + mp + "]";
	}
	
	

}
