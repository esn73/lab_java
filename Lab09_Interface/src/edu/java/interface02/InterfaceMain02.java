package edu.java.interface02;

// 인터페이스가 가질 수 있는 멤버들 - Java 8 버전 이후 변경 사항
// 1) **public static final 필드(멤버 변수)
// 2) **public abstract 메서드 (생략 가능)
// 3) public default 메서드 - Java 8 버전부터 생김. body({...})가 구현된 메서드.
// 4) public static 메서드 -  Java 8 버전부터 생김. body({...})가 구현된 static 메서드.
// 	- public default 메서드는 인터페이스를 구현하는 클래스의 객체를 생성한 후에 참조변수를 통해서 사용 가능.
// 	- public static 메서드는 객체 생성 없이 인터페이스 이름으로 접근해서 사용 가능.
// 5) private static 메서드, private 메서드 - Java 9 버전부터 생김 body({...})가 구현된 메서드.
// 	- private static 메서드는 인터페이스의 public static 메서드만 사용하기 위한 목적으로 생김.
//	- private 메서드는 인터페이스의 public default 메서드만 사용하기 위한 목적으로 생김.

// **private<protected< < public

public class InterfaceMain02 {

	public static void main(String[] args) {
		// public static final 필드 -> 객체 생성 없이 인터페이스 이름 사용
		System.out.println(Test.VERSION);

		// public static 메서드 -> 객체 생성없이 인터페이스 이름 사용해서 호출
		Test.test3();

		// public abstract, public default 메서드 -> 인터페이스 구현 클래스의 인스턴스를 생성한 후 사용 가능.
		Test t = new TestImpl();
		t.test1();
		t.test2();
	}

} // end class InterfaceMain02

interface Test {
	// 1. public static final 필드
	int VERSION = 1; // public static final 생략

	// 2. public abstract 메서드
	void test1(); // public abstract 생략

	// 3.public default 메서드 - Java 8. public은 생략 가능
	default void test2() {
		System.out.println("공개 디폴트 메서드");
	}

	// 4. public static 메서드 - Java 8. public은 생략 가능
	static void test3() {
		System.out.println("공개 static 메서드");
	}

} // end interface Test

// Test 인터페이스를 구현하는 클래스
class TestImpl implements Test {

	@Override
	public void test1() {
		System.out.println("인터페이스 추상 메서드 구현");

	}

} // end class TestImple
