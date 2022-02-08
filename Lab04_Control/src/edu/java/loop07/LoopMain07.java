package edu.java.loop07;

public class LoopMain07 {

	public static void main(String[] args) {
		// 다중 for 문
		// 구구단을 1단부터 9단까지 출력
		for(int i=1; i<10; i++) {
			System.out.println(i+"단");
			for(int j=1; j<10; j++) {
				System.out.println(i+ " x " +j + " = " + (i*j));
			}
			
		}
		
		for (int dan = 1; dan < 10; dan++) {
			System.out.println(dan + "단");
			
			for (int n = 1; n < 10; n++) {
				System.out.println(dan + " x " + n + " = " + (dan * n));
			}  // end for(n)
			
			System.out.println("--------------------");
		}  // end for(dan)
		
		// 주사위 2개를 던졌을 때의 모든 경우의 수를 출력
		// (1, 1) (1, 2) (1, 3) ... (6, 6)
		for(int a=1; a<7; a++) {
			for (int b=1; b<7; b++) {
				System.out.println("("+a+", "+b+")");
			}
		}
		
		
		
	}
}
