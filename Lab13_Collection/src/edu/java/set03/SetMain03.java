package edu.java.set03;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetMain03 {
	public static void main(String[] args) {
		//정수(Integer)를 저장할 수 있는 HashTree을 생성
		Set<Integer> set = new HashSet<>();
		System.out.println(set);
		
		// 0 이상  ~ 9 이하의 서로 다른 난수 5개를 저장.
		Random random = new Random(); // 난수를 생성하는 도구
		while (true) {
			int r = random.nextInt(10); // 난수생성
			System.out.println(r);
			set.add(r); //난수를 set에 추가(다른 숫자이면 추가되고, 같은 숫자이면 추가 되지 않음.)
			System.out.println(set);
			
			if(set.size()== 5 ) { // set의 원소의 개수가 5개이면
				break; // 무한 루프 종료
			}
		
		}
	} 
} 
