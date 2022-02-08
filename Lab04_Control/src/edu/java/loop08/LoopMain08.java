package edu.java.loop08;

public class LoopMain08 {

	public static void main(String[] args) {
		/* 구구단을 1단부터 12단까지 출력. 1단은 1x1까지, 2단은 2x2까지, ..., 12단은 12x12까지 출력하세요.
		break를 사용하는 방법과 break를 사용하지 않는 방법을 생각해 보세요.
		(출력 결과)
		1 x 1 = 1
		----------
		2 x 1 = 2
		2 x 2 = 4
		----------
		3 x 1 = 3
		3 x 2 = 6
		3 x 3 = 9
		----------
		...
	 */
		
		// break 사용	
		
		for (int i=1; i<13; i++) {
			System.out.println(i+"단");
			for(int j=1; j<13; j++) {
				System.out.println(i+" x "+j+ " = " + (i*j));
				if(i==j) {
					break;
				}
				
			}System.out.println("----------");
		}
		
		// break 사용하지 않는 방법
		
	}
}
