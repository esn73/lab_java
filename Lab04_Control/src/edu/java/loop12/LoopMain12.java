package edu.java.loop12;

public class LoopMain12 {

	public static void main(String[] args) {
		// for구문, while 구문을 모두 사용 이중 for문
		/* 1. 아래와 같이 출력되도록 코드 작성
		 	*
		 	**
		 	***
		 	...
		 */

		for(int n=1; n<=5; n++ ) {
			// 한 줄에 "*"들을 출력
			for(int x=1; x<=n; x++){
				System.out.print("*");
			}
			System.out.println(); //줄바꿈
		}
		
		
		System.out.println(); 
		int x=1;
		while(x<=5) {
			// 한 줄에 "*"를 출력
			int y=1;
			while(y <= x) {
				System.out.print("#");
				y++;
			}
			System.out.println();//줄바꿈
			x++;
		}
		
		/* 2. 아래와 같이 출력되도록 코드 작성
			(출력 결과)
			1꼬마 2꼬마 3꼬마 인디언
			4꼬마 5꼬마 6꼬마 인디언
			7꼬마 8꼬마 9꼬마 인디언
			10꼬마 인디언 소년~
			//TODO 3꼬마, 6꼬마, 9꼬마 다음에 줄바꿈
	
		 */
		
		System.out.println();
		
		int i=1;
		int n=1;
		for (n = 1; n<=10; n++) {
			System.out.print(n+"꼬마 ");
			if(n%3==0) { // n이 3의 배수이면
				System.out.println("인디언");
			}
//			if(n==10) {
//				System.out.println("인디언 소년~");
//			}
			
		}System.out.println("인디언 소년~");
		
		
		System.out.println();
		n=1;
		while(n <=10) {
			System.out.print(n + " little ");
			if (n%3 == 0) {
				System.out.println("indian");
			}
			n++;
			}
			System.out.println("indian boys~");
	
		
		
		/* 3. 369 게임 출력
		 (출력 결과)
		 1 2  * 4 5 * 7 8 * 10 
		 11 12 * 14 15 * 17 18 * 20
		 21 22 * 24 25 * 27 28 * *
		 * * * * * * * * * 40
		 ...
		 * * * * * * * * * 100
		 */
		System.out.println();
		
		for(i=1; i<=100; i++) {
			// 숫자 대신 "*"을 출력하는 곳:
			// (1) 1의 자릿수가(10으로 나눈 나머지) 3/6/9 인 경우
			// (2) 10의 자릿수가(10으로 나눈 몫) 3/6/9 인 경우
			int n1= i % 10; // 10으로 나눈 나머지 -> 1의 자릿수 저장
			int n10= i / 10; // 10으로 나눈 몫 -> 10의 자릿수 저장
			boolean b1 = (n1 == 3) || (n1 == 6) || (n1 == 9);
			boolean b10 = (n10 == 3) || (n10 == 6) || (n10 == 9);
			

			if(b1 && b10) {
			System.out.print("# ");
			}else if(b1 || b10)  {
				System.out.print("* ");
			}else {
				System.out.print(i + " ");				
			}
			
			if(i%10 == 0) {
			System.out.println();
			}
			
		}
		
		/*
		System.out.println();
		System.out.printf("%3d", 1); 
		System.out.println();
		System.out.printf("%3d", 10);
		System.out.println();
		System.out.printf("%3d", 100);
		*/
		
		n=1;
		while(n <=100) {
			int n1 = n % 10; // 1의 자릿수
			int n10 = n / 10; // 10의 자릿수
			boolean b1 = (n1 == 3) || (n1 == 6) || (n1 == 9);
			boolean b10 = (n10 == 3) || (n10 == 6) || (n10 == 9);
			
			if(b1 && b10) {
				System.out.printf("%4s", "**"); // 4칸을 마련해서 문자열(%s)를 출력
			} else if (b1 || b10) {
				System.out.printf("%4s","*");
			} else {
			System.out.printf("%4d", n); // 4칸을 마련해서 정수(%d)를 출력 (%f실수 %s string)
			}
			if (n % 10 == 0) {
				System.out.println();
			}
				
			n++;
			
		}
		
		
		
	}// end main

}
