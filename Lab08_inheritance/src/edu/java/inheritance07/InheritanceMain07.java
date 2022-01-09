package edu.java.inheritance07;

// final : 최종적인(마지막의), 변경할 수 없는.
// 1) 변수 앞 (멤버 변수, 지역 변수, 파라미터) 앞 - 변경할 수 없는 변수. 상수.
// 2) 클래스 앞 - 변경할 수 없는 클래스. 상속할 수 없는 클래스. Sub class를 만들 수 없는 클래스.
// 3) 메서드 앞 - 변경할 수 없는 메서드. override(재정의)를 할 수 없는 메서드.

public class InheritanceMain07 {
	private static final int MAX = 3; // 변경할 수 없는 필드(멤버 변수)
	
	public static void main(String[] args) {
//		MAX = 5; 변경할 수 없는 멤버 변수 
		final int n = 10; // 변경할 수 없는 지역 변수 (지역변수안에는 public, private가 들어갈수 없음)
		// n = 100;
		
	}

} //end InheritanceMain07

class A {
	public void test() {}
	public final void testFinal() {}
}

// final이 아닌 클래스는 확장(상속)할 수 있음.
class B extends A { // A클래스를 확장(변경)해서 B 생성
	@Override // final이 아닌 부모의 메서드는 override가 가능.
	public void test() { // 부모으 기능을 사용
		super.test();
		// 추가 기능 구현
	}
}

final class C {}

//final로 선언한 클래스는 확장(상속)할 수 없음.
// class D extends C {} // The type D cannot subclass the **final class C