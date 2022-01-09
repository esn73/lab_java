package edu.java.lambda03;

import edu.java.lambda03.Calculator.Calculable;

public class LambdaMain03 {

	public static void main(String[] args) {
		// Calculator(계산기) 객체 생성
		Calculator calculator = new Calculator();

		// TODO 1. 변수 add가 두 숫자의 덧셈 결과가 저장되도록
		// 익명 클래스를 사용
		Calculable calc = new Calculable() { // 클래스가 아니라 인터페이스라 추상메서드

			@Override
			public double calculate(double x, double y) {
				return x + y;
			}
		};
		double add = calculator.calculate(1.0, 2.0, calc);
		System.out.println("add = " + add); // ->3.0
		
		
		
		
		
		double add2 = calculator.calculate(1.0, 2.0, new Calculable() {			
			@Override
			public double calculate(double x, double y) {				
				return x + y;
			}
		});
		System.out.println("add = " + add2);

		// TODO 2. 변수 subtract가 두 숫자의 뺄셈 결과가 저장되도록...
		// 람다 표현식 사용
		double substract =  calculator.calculate(1.0, 2.0, (x, y) -> (x-y));
		System.out.println("subract = " + substract); //->1.0
		
		
	}

}
