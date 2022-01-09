package edu.java.class05;

public class Score {
	//field(멤버 변수)
	int korean; 
	int english;
	int math;
	int science;
 

	
	// 생성자 - default, 파라미터 4개
	public Score() {
		
	}

	public Score(int korean, int english, int math, int science) {
		
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}
	
	

	// 메서드 - 총점 리턴, 평균 리턴.
	
	public int sum() {
		return korean + english + math + science;
	}
	public double mean() {
		return (double)sum() /4;
	}
	

}
