package submit;

import data.Player;

public class PlayerTest {

	public static void main(String[] args) {
		
		Player[] party = new Player[3];
		party[0] = new Player("Player1");
		party[1] = new Player("Player2");
		party[2] = new Player("Player3");
		
		for(int i = 0; i < party.length; i++) {
			party[i] = new Player("player" + (i + 1));
		}
		
		for (int i = 0; i < party.length; i++) {
			System.out.println(party[i].toString());
			
		}
	}

}

