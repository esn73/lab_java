package edu.java.member.model;

// Model 클래스. VO(Value Object). DTO(Data Transfer Object).
public class Member {
	// field
	private String memberId;
	private String memberPassword; //string의 기본값은 null
	
	
	//constructor
	public Member() {}
	public Member(String memberId, String memberPassword) {
		this.memberId = memberId;
		this.memberPassword = memberPassword;
	}
	
	
	// getters(변수값리턴) 파라미터가 필요없음 & setters
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPassword() {
		return memberPassword;
	}
	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}
	
	@Override
	public String toString() { //문자열로 변경
		String info = "Member{ID:" + memberId + ", PW:" + memberPassword + "}";
		return info;
	}
	
}
