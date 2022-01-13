package edu.java.loop09;

public class LoopMain09 {

	public static void main(String[] args) {
		// while 반복문
		//1부터 5까지 1씩 증가시키면서 출력
		int n = 1; //초기화 문장
		while (n <= 5) { // n이 5보다 작거나 같은 동안에 - 반복 조건 // int 쓰면 X 밖에 있는 int값가져오기
			System.out.println(n); //출력
			n++; // 변수 값 변경
		}//end while
			System.out.println("n = " + n);
			
			System.out.println("-----");
			// while 구문을 사용해서 5부터 1까지 내림차순 출력
		n=5; // 초기화 문장
		while(n > 0) { //(n >=5) //반복 조건 검사
			System.out.println(n);
			n--; // 변수 값 변경
		}
			System.out.println("-----");
			//10 이하의 양의 정수들 중에서 옆으로 홀수만 출력(1 3 5 7 9) -> 2씩 증가
		n=1;
		while(n<=10) {
			if(n%2==1) // n을 2로 나눈 나머지가 1홀수
			System.out.print(n + " ");
			n++;
		}
		System.out.println();
		n=1;
		while(n<10) {
			System.out.print(n + " ");
			n += 2;
		}
		
		n=0;
		while(n<5) {
			System.out.println((2 * n + 1)+ " ");
			n++;
		}

		System.out.println("-----");
		//알파벳 소문자 a부터 z까지 한 줄에 출력
		
		char ch = 'a'; // char: 문자열을 저장하는 타입. 정수 타입의 특별한 경우.(사칙연산과 크기 비교 가능).

		while(ch <='z') {
		System.out.print( ch + " ");
		ch++;
		}
	} //end main

}
