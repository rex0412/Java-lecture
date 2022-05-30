package data;

public class Monster {
	
	int str;
	int hp;
	int mp;
	String type;
	
	final String[] TYPE = {"WATER", "FIRE", "EARTH", "AIR"};
	
	public Monster() {
		int randomType = (int) (Math.random() * (TYPE.length));
		this.type = this.TYPE[randomType];
		System.out.println(this.type + "의 몬스터가 생성되었습니다.");
		this.str = 10;
		this.hp = 100;
		this.mp = 200;
	}
	
	public void attack(Player1 target) {
		target.hp -= this.str;
		
		System.out.println("attack!");
	}
	
	public void defense() {
		System.out.println("defense!");
	}

	public void attackAll(Player1[] party) {
		for (int i = 0; i < party.length; i++) {
			this.attack(party[i]);
			
		}
		
	}
}
