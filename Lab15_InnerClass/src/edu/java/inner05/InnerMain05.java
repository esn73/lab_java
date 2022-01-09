package edu.java.inner05;

import javax.swing.ButtonModel;

import edu.java.inner04.Button;

public class InnerMain05 {

	public static void main(String[] args) {
		// InnerMain04 예제에서 FinishListener, CancelListener 클래스가 필요했더 이유는
		// 종료/취소 버튼이 클릭됐을 때 할일을 정의한 객체를 생성하기 위해서일뿐.
		// 다른 곳에서는 거의 사용될 일이 없는 클래스들임.
		// 이런 경우 별도의 java파일에서 클래스를 정의하기 보다는
		// 클래스가 필요한 시점에 정의하고 사용이 끝나면 클래스 정의가 사라져도 됨.
		//-> 지역 내부 클래스(local class): 메서드 안에서 정의(선언)하는 클래스
		
		// 추가 버튼 생성
		Button btnAdd = new Button("Add");
		// 추가 버튼을 클릭했을 때 할 일을 정의 -> 클래스를 정의한 목적은 그 클래스의 객체를 생성하기 위해서
		// local class: 메서드 안에서 정의하는 클래스
		class AddListener implements Button.OnclickListener{

			@Override
			public void onClick() {
				System.out.println("파일을 추가 합니다...");
				
			}
			
		}//end class AddListener
		
		// 지역 클래스 AddListener의 인스턴스를 생성
		Button.OnclickListener listener = new AddListener(); //다형성
		
		// 추가 버튼이 할 일을 설정.
		btnAdd.setOnClickListener(new AddListener());
		
		//추가 버튼 클릭.
		btnAdd.click();
		
		// 익명 클래스(anonymous class)를 사용한 Button 클래스 사용:
		// 버튼 생성
		Button btnBrowse = new Button("Browse");
		//버튼이 할일을 정의한 객체를 생성
		Button.OnclickListener browselistener = new Button.OnclickListener() {
			
			@Override
			public void onClick() {
				System.out.println("추가할 파일을 검색합니다...");
			}
		};
		// ->이름이 없는 클래스를 정의하고 super타입의 이름으로 생성자를 호출해서 오버라이드 객체 생성까지 함.
		
		// 버튼에 버튼의 기능을 설정
		btnBrowse.setOnClickListener(browselistener);
		
		//버튼 클릭
		btnBrowse.click();
		
		// 버튼 생성
		
		Button btnSearch = new Button("검색");
		// 버튼을 클릭했을 때 할 일을 등록
		btnSearch.setOnClickListener(new Button.OnclickListener() {			
			@Override
			public void onClick() {
				System.out.println("검색중...");
				
			}
		});
		
		//버튼 클릭
		btnSearch.click();
		
	} //end main

}//end class
