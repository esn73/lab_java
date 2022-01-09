package edu.java.inheritance03;

public class ElectricCar extends Car {
	private int charge; // 전기차 배터리 충전량

	public ElectricCar(int speed, int charge) {
		super(speed); // 상위 클래스어 생성자를 명시적(explicit)으로 호출.
		this.charge = charge;

// 4. 상위 클래스가 기본 생성자를 갖고 있지 않고, 파라미터가 있는 생성자만 갖고 있을 때
//	  하위 클래스에서 "반드시(!)" 상위 클래스의 생성자를 명시적으로 호출하지 않으면 컴파일 에러가 발생함.
//-> 해결방법 1: 상위 클래스에서 기본 생성자를 만듦.
//-> 해결방법 2: 하위 클래스에서 상위 클래스의 파라미터가 있는 생성자를 "명시적"으로 호출.

	}

	// method override: 위로 덮어버리는 것
	// 상위 클래스가 가지고 있는 메서드를 하위 클래스에서 재정의 하는 것.
	// override를 할때는 메서드의 signature가 같아야 함.
	// - 메서드 리턴 타입, 이름, 파라미터, 파라미터개수가 모두 같아야 함.
	// override를 할 때 접근 제어 수식어는 상위 클래스의 가시성보다 같거나 넓어지면 됨.
	// - private < (package) < protected < public

	// method overload: 여러개가 존재하는 것
	// 하나의 클래스 안에서 파라미터(의 개수, 타입)가 다른 메서드를 같은 이름으로 여러개 정의하는 것.

	@Override // annotation(어노테이션)
	// 자바 컴파일러에게 상위 클래스의 메서드 signature와 동일한지 검사하도록 함.
	public void drive() {
		super.drive(); // 상위 클래스의 drive() 메서드를 명시적(explicit)으로 호출
		System.out.println("배터리 충전량 = " + charge);
	}

	public int getCharge() {
		return charge;

	}
	public void setCharge(int charge) {
		this.charge = charge;
	}

}// end class
