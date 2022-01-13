package edu.java.loop11;

public class LoopMain11 {

	public static void main(String[] args) {
		// while문 연습
		// 1. 구구단 9단 출력 (9x1..., 9x12)
		int dan = 9;
		int n = 1;
		while(n<=12) {
			System.out.println(dan + " x " + n + " = " +(dan*n));
			n++;
		}

		// 2. 구구단 1단~12단 출력
		dan  = 1; // 단 초기화 
		while (dan <= 12) {
			System.out.println(dan + "단");
			
			n = 1; // 곱하는 숫자 초기화 ****
			while (n <= 12) {
				System.out.println(dan + " x " + n + " = " + (dan*n));
				n++;
			} // end while(n)
			
			System.out.println("---------------");
			dan++;
		} // end while(dan)
		
		
		
		// 3. 구구단 1단~12단 출력(1x1, 2x2까지 ...)
		System.out.println();
		dan = 1;
		while(dan <= 12) {
			System.out.println(dan + "단");
			
			n = 1;
			while(n <= 12) {
				System.out.println(dan + " x " + n + " = " + (dan * n));
				// n++;
				if (dan == n) { // (dan < n)도 가능
					break;  // 안쪽 while 반복문을 멈춤.
				}
				n++;
			}
			
			System.out.println("-----------------");
			dan++;
		}
		
		System.out.println();
		dan = 1;
		while(dan <= 12) {
			System.out.println(dan + "단");
			
			n = 1;
			while(dan>=n) {
				System.out.println(dan + " x " + n + " = " + (dan * n));
				n++;
				
			}
			
			System.out.println("-----------------");
			dan++;
		}
		

	} //end main

}
