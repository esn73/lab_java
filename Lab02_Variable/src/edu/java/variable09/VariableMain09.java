package edu.java.variable09;

public class VariableMain09 {

	public static void main(String[] args) {
		// 간단한 성적 처리 프로그램
		// java, SQL, JSP 과목의 점수(int)를 Scanner를 사용해서 입력받음.
		// 세 과목의 점수를 출력
		// 세 과목의 총점을 출력
		// 세 과목의 평균을 출력 - 소수점이 계산되도록! 
		
		int a = 89;
		int b = 70;
		int c = 95;
		double total = a+b+c;
		double ave= total/3;
		System.out.println("java = " + a );
		System.out.println("SQL = " + b );
		System.out.println("JSP = " + c);
		System.out.println(ave);
		
	}

}
