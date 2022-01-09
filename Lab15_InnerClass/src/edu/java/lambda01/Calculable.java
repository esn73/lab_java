package edu.java.lambda01;

// Function Interface(함수형 인터페이스) : **오직 한 개의 추상 메서드를 갖는 인터페이스.
@FunctionalInterface // 컴파일러가 Functional interface인 지를 검사하도록 선언하는 annotation
public interface Calculable {
	double calculate(double x, double y); // 추상 메서드(abstract method) - 인터페이스는 추상메서드만 가짐 body가 없는 메서드
	double PI = 3.14;
	int TEN = 10;
	
// double calculate(double x, double y) : // 추상 메서드(abstract method)
}
