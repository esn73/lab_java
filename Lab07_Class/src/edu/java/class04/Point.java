package edu.java.class04;


//2차원 평면 상의 점의 좌표를 표현하는 클래스
//class: field + method + constructor => data type
public class Point {
	
	//필드(멤버 변수)
	double x; // 점의 x 좌표
	double y; // 점의 y 좌표
	
	// 생성자 - default, 파라미터 2개
	
	public Point() {}


	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	


	// 메서드 
	/**
	 *  점의 좌표를 출력하는 메서드.
	 */
	
	public void info() {
		System.out.println("Point(x = " + this.x + ", 중심 y = " + this.y + ")");
	}
	
	/**
	 * 점의 좌표를 x 축의 방향으로 dx만큼, y축의 방향으로 dy만큼 이동시키는 기능.
	 * 필드 x를 (x + dx), y를 (y + dy)로 변경한 후 자기 자신을 리턴.
	 * 
	 * @param dx - double.x 축의 방향으로 이동시킬 양.
	 * @param dy - double.y 축의 방향으로 이동시킬 양.
	 * @return Point (return this;)
	 * 
	 */


	public Point move(double dx, double dy) {
		x += dx; // x = x + dx;
		y += dy; // 
		return this; // 인스턴스의 주소(참조) 값을 리턴.
	}

}//end class Point

