package edu.java.list04;

public class Score {
	//field(member variable)
	private int korean;
	private int english;
	
	//constructor
	public Score() {}
	public Score(int korean, int english) {
		this.korean = korean;
		this.english = english;
	}
	
	//getter & setters()
	
	public int getKorean() {
		return this.korean;
	}
	public void setKorean(int korean) {
		
	}
	
	public int getEnlgish() {
		return this.english;
	}
	
	public void setEnglish(int english) {
		
	}
	
	@Override
	public String toString() {
		return "Scroe: korean: " + this.korean +" english : " +this.english;
	}
	
	@Override // 두 점수가 같은지를 재정의
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Score){ 
		Score score = (Score)obj;//casting
		if(this.korean == score.korean && this.english == score.english) {
			result = true;
			}
		}
		return result;
	}
		
	
	// equals 메서드가 true를 리턴하는 두 객체는 hashCode가 리턴하는 int값이 같아야 됨!
	// (hashCode) 값이 다르면 equals는 false를 리턴
	// equals 메서드가 false일 때 hashCode 값이 같아야 되는 지, 달라야 되는 지의 제약 조건은 없음!
	
	
	@Override
	public int hashCode() {
		return this.korean * 100 + this.english;
	}
	
	
	}
	