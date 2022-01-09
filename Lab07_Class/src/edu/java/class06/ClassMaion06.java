package edu.java.class06;

public class ClassMaion06 {

	public static void main(String[] args) {
		// Account 인스턴스 생성
		Account account1 = new Account(123456, 1000.0);
		account1.info();

		Account account2 =  new Account(123789, 1000.0);
		account2.info();
		
		// account1에 10,000원 입금 
		account1.deposit(10_000); //java는 ,를 쓰지않음
		account1.info();
		
		// account1에 3,000원 출금
		account1.widthraw(3_000);
		account1.info();
		
		System.out.println();
		// account1에서(보내는 계좌) account2으로 5,000원을 이체
		account1.transfer(5_000, account2);
		account1.info();
		account2.info();
		

	}

}
