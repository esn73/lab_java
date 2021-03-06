package edu.java.set02;

import java.util.HashSet;
import java.util.Set;

import edu.java.list04.Score;

public class SetMain02 {

	public static void main(String[] args) {
		// edu.java.list04.Score를 저장하는 HashSet을 생성
		Set<Score> set = new HashSet<>();
		System.out.println(set);
		// edu.java.l ist04.Score를 저장하는 HashSet을 생성
		// Set: 중복된(같은) 값을 저장하지 않음.
		// Hashset: 검색이 빠른 Set.
		set.add(new Score());
		System.out.println(set);
	
		set.add(new Score(0, 0));
		System.out.println(set);
		
		//equals()의 결과가 true이면, hashCode()의 리턴값이 같다.
		// hashCode()의 리턴 값이 다르면, equals는 false를 리턴!)
		// HashSet<E>은 원소를 추가(add)할 때, hashCode() 값이 다르면
		// equals 메서드가 false일 떄 hashCode 값이 같아야 되는 지, 달라야 되는지의 제약 조건은 없음.
	
		set.add(new Score(100, 100));
		System.out.println(set);
		
		Score s = new Score(); // 삭제하기 위한 객체
		set.remove(s);
		System.out.println(set);
		
	}

}
