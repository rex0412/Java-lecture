package submit;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		Player m1 = new Magician("magician");
		Player w1 = new Warrior("warrior");
		Player t1 = new Thief("thief");
		
		Monster slime = new Monster("slime");
		
		Scanner in = new Scanner(System.in);
		
		while (slime.hp >= 0) {
			String userInput1 = in.nextLine();
			
			if (userInput1.equals("magician")) {
				
				m1.attack(slime);
				
			} else if (userInput1.equals("warrior")) {
				
			} else if (userInput1.equals("thief" )) {
				
			} else {
				System.out.println("잘못된 입력값입니다!");
			}
			
			System.out.println("몬스터의 현재 체력 : " + slime.hp);
			
		}
		
		System.out.println("전투가 모두 끝났습니다!");

	}

}
