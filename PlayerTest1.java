package submit;

import data.Player1;

public class PlayerTest1 {

	public static void main(String[] args) {
		
//		Player1[] party = new Player1[3];
//		party[0] = new Player1("Player1");
//		party[1] = new Player1("Player2");
//		party[2] = new Player1("Player3");
		
		Player1 y = new Player1("y");
		Player1 j = new Player1("j");
		
		
		y.attack(j);
		y.defense();
		
		System.out.println(j.hp);
	}
}
