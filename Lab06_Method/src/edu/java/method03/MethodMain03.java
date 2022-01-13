package edu.java.method03;

public class MethodMain03 {

	public static void main(String[] args) {
		// method에서 return의 의미:
		// 1) 메서드를 호출한 곳으로 값을 반환
		// 2) 메서드를 종료
		
		countdown(-1);

	}

	public static void countdown(int count) {
		if (count < 0) {
			System.out.println("count는 0이상 이어야 함");
			return;
		}
			
		for (int i = count; i >= 0; i--) {
			System.out.println(i);
			
		}
	}
	
	
}
