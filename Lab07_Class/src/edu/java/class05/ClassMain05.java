package edu.java.class05;

public class ClassMain05 {

	public static void main(String[] args) {
		// 기본 생성자를 사용해서 Score 인스턴스를 생성

		
		Score score1 = new Score();
		System.out.println("총점 :" + score1.sum());
		System.out.println("평균 :" + score1.mean());
		
		System.out.println();
		//파라미터르르 갖는 생성자를 사용해서 Score 인스턴스를 생성.
		Score score2 = new Score(100, 50, 60, 77);
		System.out.println("총점 :" +  score2.sum());
		System.out.println("평균 :" +  score2.mean());
	
		System.out.println();
		//기본 생성자를 사용해서 Student 인스턴스를 생성.
		Student stu = new Student();
		stu.info();
		
		System.out.println();
		//파라미터를 갖는 생성자를 사용해서 Student인스턴스를 생성
		Student ssam = new Student(2021, "오쌤" , new Score());
		ssam.info();
		
	}//main

}//class
