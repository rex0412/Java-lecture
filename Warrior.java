package job;

public class Warrior {
	
	//필드 or 멤버변수
	int hp;
	int mp;
	
	//디폴트 생성자 (작성하지 않은 경우, 자동 생성됨)
	public Warrior(){
		
		System.out.println("전사 객체가 생성!");
		
	}
	
	//내가 새롭게 작성한 생성자
	public Warrior(int hp, int mp) {
		
		this.hp = hp;
		this.mp = mp;
		
	}
	
	//동작들
	//메소드 (method) = 함수
	
	public void attack() {
		System.out.println("공격했습니다!");
	}
	
	
}
