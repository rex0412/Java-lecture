package day11;

public interface Remocon {
	// 필드 -> 인터페이스는 상수만 올 수 있다!
	static final int minVal = 1;
	int maxVol = 99;
	
	// 생성자 X -> 상수값과 메소드만 갖기 때문에 필요 없으며, 선언하지도 못함
	
	// 메소드 -> 구현부를 정의하지 않은, 추상 메소드만 가능
	void volUp();
	void volDown();
}

