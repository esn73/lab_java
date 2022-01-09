package edu.java.list04;

public class ListMain04 {

	public static void main(String[] args) {
		//Score 클래스 인스턴스(객체) 생성
		Score score1 = new Score();
		System.out.println(score1);

		Score score2 = new Score(0, 0);
		System.out.println("score2" + score2);
		
		// 두 점수 score1과 score2는 같은 점수인가요?
		System.out.println("== 연산자: " + (score1 == score2));
		// 참조 타입(클래스 타입) 변수들을 == 연산자로 같은지를 비교하면,
		// 인스턴스가 생성된 메모리의 <주소값>이 같은 지를 비교하는 것
		
		// 국어 점수와 영어 점수가 모두 같은 점수라고 정의
		System.out.println("equals 메서드 리턴 값: " + score1.equals(score2));
		
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println("==: " + (s1 == s2)); // -> 주소값이 달라서 false
		System.out.println("equals: " + s1.equals(s2)); // --> 문자열의 내용 같음
		System.out.println("s1 hash: " + s1.hashCode());
		System.out.println("s2 hash: " + s2.hashCode()); // -> equals가 true이면 hashCode가 같음.
	}

}
