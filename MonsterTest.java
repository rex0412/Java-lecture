package submit;

import data.Monster;
import data.Player1;

public class MonsterTest {

	public static void main(String[] args) {
		
		Monster slime = new Monster();
		
		Player1[] party = new Player1[3];
		party[0] = new Player1("p1");
		party[1] = new Player1("p2");
		party[2] = new Player1("p3");
		
		slime.attackAll(party);
		
		System.out.println(party[0].hp);
		System.out.println(party[1].hp);
		System.out.println(party[2].hp);
	}

}
