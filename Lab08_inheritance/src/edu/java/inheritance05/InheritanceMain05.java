package edu.java.inheritance05;

public class InheritanceMain05 {

	public static void main(String[] args) {
		// 다형성(polymorphism)을 사용할 때 주의할 점
		Parent child1 = new Child();
		child1.testParent();
		((Child) child1).testChild(); //Downcasting
		
		System.out.println();
		
		Parent child2 =  new AnotherChild();
		child2.testParent();
		//((Child) child2).testChild();
		// 위 코드는 컴파일 에러는 발생하지 않음.
		// 실제 객체가 AnotherChild 타입이기 때문에
		// 실행 중에 Child 타입으로 타입 변환을 할 수 없다는 ClassCastException이 발생함. cannot be cast
		// 강제 타입 변환(downcasting)을 할 때는 어떤 클래스의 인스턴스인지 검사하고 타입 변환을 할 필요가 있음.
		// "변수이름 instanceof 클래스 이름" 형식으로 타입 검사를 수행.
		if (child2 instanceof Child) { //instanceof 2항 연산자 true false 
			((Child) child2).testChild();
		}else if(child2 instanceof AnotherChild) {
			((AnotherChild) child2).testAnotherChild(); 
		}
	}

}//end class InheritanceMain05


class Parent { // private , protected 는 사용할수 없음
	public void testParent() {
		System.out.println("I'm your father!");
	}
} // end class Parent

class Child extends Parent {
	public void testChild() {
		System.out.println("Child");
	}
} // end class Child

class AnotherChild extends Parent{
	public void testAnotherChild() {
		System.out.println("Another Child");
	}
} //end class AnotherChild