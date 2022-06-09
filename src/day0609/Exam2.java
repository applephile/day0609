package day0609;

import java.util.Random;

class Game {
	private int sides;
	private static Random rand = new Random();
	public Game(int sides) {
		this.sides = sides;
	}
	public int roll() {
//		return (int)(Math.random() * 6 + 1); 
		return rand.nextInt(sides) + 1;
	}
}

public class Exam2 {

	public static void main(String[] args) {
		
		//두 개의 주사위를 던져 그 합을 출력 프로그램 작성
		//두 주사위 100번 던졌을 때 주사위 합 구하기
		
		//클래스
		//랜덤 수 두 개
		//합에 해당하는 숫자의 배열값을 1씩 증가
		
		Game gameA = new Game(6);
		Game gameB = new Game(6);
		
		int[] counts = new int[13];
		
		for(int i=0; i<100; i++) {
			int a = gameA.roll();
			int b = gameB.roll();
			int sum = a + b;
			counts[sum]++;
		}
		
		for(int i=2; i<counts.length; i++) {
			System.out.printf("%2d : ", i);
			
			for(int j = 0; j<counts[i]; j++) {
				System.out.print("#");
			}
			System.out.println();
		}

	}

}
