package edu.java.class05;

public class Student {
	// field
	int id; // 학번
	String name; // 이름
	Score score; // 학생이 수강 신청한 과목의 점수들을 저장하는 객체

	// 생성자 - default, 파라미터 3개

	public Student() {

	}

	public Student(int id, String name, Score score) {
		this.id = id;
		this.name = name;
		this.score = score;

	}
//	public Student(Score sum) {
//		this.sum = new Score();
//	}

	// 메서드 - info : 학번, 이름, 과목 점수들, 총점, 평균
	public void info() {
		System.out.print("학번: " + id);
		System.out.println("이름 : " + name);
		// ctrl+Shift+F 소스코드 포맷팅(자동 들여쓰기)
		if (score != null) {
			System.out.println("국어 " + score.korean);
			System.out.println("영어 " + score.english);
			System.out.println("수학 " + score.math);
			System.out.println("과학 " + score.science);
			System.out.println("총점 " + score.sum());
			System.out.println("평균 " + score.mean()); 
//		System.out.print("총점: "+ sum + ", 평균 " + mean);
		}else {
			System.out.println("Scroe 정보는 없음.");
		}
	}
}//end class main
