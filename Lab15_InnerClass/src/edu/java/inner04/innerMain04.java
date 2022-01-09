package edu.java.inner04;

import edu.java.inner04.Button.OnclickListener;

public class innerMain04 {

	public static void main(String[] args) {
		//Button 클래스의 인스턴스를 생성
		 Button btnFinish = new Button("Finish"); // 버튼을 만듦.

		 // Button.OnclickListener 인터페이스를 구현하는 클래스의 인스턴스를 생성
		 FinishListener finish = new FinishListener(); // 버튼을 클릭했을 떄 할일 정의.
		 //종료 버튼의 listener를 설정
		 btnFinish.setOnClickListener(finish); // 버튼이 할일을 버튼에 설정.
		 
		// 생성된 종료 버튼 클릭
		btnFinish.click(); // 버튼을 클릭.
		
		//취소 버튼 생성
		Button btnCancel = new Button("Cancel");
		//취소 버튼이 해야 할 일을 정의하고, 취소 버튼에 설정
		btnCancel.setOnClickListener(new CancelListener());
		//취소 버튼 클릭
		btnCancel.click();
		
		
	}//end main

}// end class innermain04



// import 문 사용
class CancelListener implements OnclickListener {

	@Override // 취소버튼을 클릭했을 때 해야할 일
	public void onClick() {
		System.out.println("모든 작업을 취소하고 창을 닫습니다....");
		
	}
	
} // end class CancelListener

// OnclickListener 인터페이스를 구현하는 클래스
class FinishListener implements Button.OnclickListener {

	@Override // 추상메서드 구현
	public void onClick() {
		System.out.println("모든 내용을 저장하고 창을 닫습니다...");
	}
	
} //end class FinishListener
