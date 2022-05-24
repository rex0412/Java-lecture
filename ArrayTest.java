package day02;

public class ArrayTest {

	public static void main(String[] args) {
		
		int s1 = 100;
		int s2 = 90;
		int s3 = 85;
		int s4 = 70;
		
		//선언과 동시에 초기화
		int[] score = {100, 90, 85, 70};
		
		for(int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		
		//먼저 선언 후 나중에 값 할당
		int[] score2;
		score2 = new int[] {100, 90, 85, 70};
		
		
		//선언과 동시에 빈 배열로 초기화
		int[] idontknow = new int[10];
		
		for(int i = 0; i < idontknow.length; i++) {
			System.out.println(idontknow[i]);
		}	
		
		System.out.println("----------------------");
		
		//2차원 배열
		int[][] scores = new int[2][3];
		
		System.out.println(scores.length);
		
		System.out.println(scores[1].length);
		
		int[][] testScores = new int[2][];
		
		testScores[0] = new int[1];
		testScores[1] = new int[2];
		
		//선언과 동시에 초기화
		int[][] score2x2Arr = {{100, 90, 85, 70}, {80, 70, 60}};

	}

}
