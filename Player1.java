package data;

public class Player1 {
	
	public String name;
	public int hp;
	public int mp;
	
	public Player1(String name) {
		this.name = name;
		this.hp = 100;
		this.mp = 100;
	}
	
	public Player1(int hp, int mp) {
		this.hp = hp;
		this.mp = mp;
	}

	public void attack(Player1 p) {
		p.hp -= 10;
	}
	
	public void defense() {
		this.mp -= 10;
	}

}
