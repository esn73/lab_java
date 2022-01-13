package edu.java.method07;

public class MethodMain07 {

	public static void main(String[] args) {
		// 가변 길이 argument 메서드(variavle-length argument method):
		// 메서드의 argument 개수가 자유롭게 변할 수 있는 메서드.
		// 단, 메서드 argument의 타입은 1개.

		int result = addAllintegers(); // argument 0개 -> {} 배열처럼 생각.
		System.out.println(result);
		
		result = addAllintegers(1); // argument 1개 --> {1}
		System.out.println(result);
		
		result = addAllintegers(1, 2, 3); // argument 3개 --> {1, 2, 3}
		System.out.println(result);
		
		System.out.printf("%s", "문자열");
		System.out.println();
		System.out.printf("%s %d %f", "문자열" , 100, 3.141592);

	}

	// 가변 길이 인수를 저장하는 파라미터를 선언할 때는 
	// 타입... 변수 이름
	// 형식으로 선언.
	
	public static int addAllintegers(int... args) {
		
		
		//메서드 내부에서 가변 길이 인수는 배열처럼 생각하면 됨.
		int sum = 0;
		for (int x : args) {
			sum += x;
		}
		return sum;
	}
	
}
