package edu.java.list03;

import java.util.ArrayList;
import java.util.Scanner;

public class ListMain03 {
	// 기본 생성자(default constructor)를 사용해서 Member 클래스의 인스턴스를 생성

	private static Scanner scanner = new Scanner(System.in);

	
	public static void main(String[] args) {
		Member m1 = new Member();
		System.out.println("m1 " + m1);
		// getter: 멤버 변수(필드)의 값을 가져옴(읽어옴)
		System.out.println("m1.memberId: " + m1.getMemberId());
		System.out.println("m1.memberPassword: " +  m1.getMemberPassword());
		// setter: 멤버 변수(필드)의 값을 설정.
		m1.setMemberPassword("abcd");
		System.out.println("m1.memberPassword: " +  m1.getMemberPassword());
		
		//파라미터를 갖는 생성자를 사용해서 Member 클래스의 인스턴스를 생성
		Member m2 = new Member("guest", "guest1234");
		// Member 타입을 저장할 수 있는 ArrayList를 생성
		ArrayList<Member> list = new ArrayList<>(); // 생성자를 호출할 떄는 ArrayList가 저장하는 타입을 생략할 수 있음.
		System.out.println(list);
		
		
		// 반복문을 사용해서
		// 아이디와 비밀번호를 입력받고 Member 객체를 생성해서
		// ArrayList에 추가 Member 타입 객체 3개를 추가
		
		
		for(int i=0; i<3; i++) {
			//id/password를 입력받음
			System.out.println("ID를 입력하세요");
			String id = scanner.nextLine();
			System.out.println("비밀번호를 입력하세요");
			String pw = scanner.nextLine();
			System.out.println("Id: " + id + ", Pw : " + pw);
			Member m = new Member(id, pw);
			// Member 객체를 ArrayList에 추가
			list.add(m);
			// 회원 정보가 추가된 내용을 출력
			System.out.println(list);
		}
		
		
//		

		// 리스트의 내용을 출력 - 각각의 회원의 아이디와 비밀번호가 출력될 수 있도록 (toString으로 override 테스트)
		for ( Member m : list) {
			System.out.println(m);
		}
		
		// 인덱스 0 위치의 회원 정보중에서 비밀번호를 변경하고 리스트 내용 출력
		// (1)인덱스 9 위치의 회원 정보를 찾음(2) 그 회원이 비번을 설정(setter).
		Member m0 = list.get(0);
		m0.setMemberPassword("abcd1234"); //(2) 그 회원의 비번을 설정(setter).
		list.get(0).setMemberPassword("abcd1234");
		System.out.println(list);
		// Member m = memberList.get(0); m.setPwd(새 비번);
		
		// 인덱스 1 위치의 회원 정보를 삭제하고 리스트 내용을 출력
		list.remove(1);
		System.out.println(list);
		
		// 아이디가 일치하면 같은 회원으로 간주되도록 Member 클래스를 수정 상속에서 toString override
		// 아이디가 일치하는 회원을 리스트에서 삭제하고 리스트 내용을 출력 
		Member member = new Member("aaa", "111"); //삭제하려고 하는 회원 정보
		/*
		list.remove(member);
		for (int i = 0; i < list.size(); i++) { // 인덱스 0부터 마지막 원소까지 반복하면서 
			Member m = list.get(i); // 인덱스 위치에 있는 원소를 가져옴
			if(m.getMemberId().equals(member.getMemberId())) { 
				// 리스트에 저장된 회원 아이디와 삭제하려고 하는 회원 아이디가 같다면
				list.remove(i); // 리스트에서 그 인덱스의 원소를 삭제.
				break; // 반복문 종료
			}
		} //연습
		*/
		list.remove(member);
		System.out.println(list);
		
		
	}

}
