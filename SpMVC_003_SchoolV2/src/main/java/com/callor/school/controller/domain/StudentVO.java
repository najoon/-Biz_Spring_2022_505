package com.callor.school.controller.domain;

// 1. Spring project에서 VO(DT) 클래스를 선언할 때는 필드 변수를 private으로 선언하고
// 2. getter() & setter() 를 선언하고
// 3. toString() 메서드를 재 정의하고
// 4. 기본생성자와 필드생성자를 정의해둔다
public class StudentVO {

	// 데이터 추상화
	private String stNum; // 학번
	private String stName; // 이름
	private int intGrade; // 학년
	private String stTel; // 전화번호
	private String stAddr; // 주소
	private String srDept; // 학과
	
	public StudentVO() {
		
	}
	
	// 변수를 전부 초기화시켜주는 필드 생성자
	public StudentVO(String stNum, String stName, int intGrade, String stTel, String stAddr, String srDept) {
		// super();
		this.stNum = stNum;
		this.stName = stName;
		this.intGrade = intGrade;
		this.stTel = stTel;
		this.stAddr = stAddr;
		this.srDept = srDept;
	}

	public String getStNum() {
		return stNum;
	}
	public void setStNum(String stNum) {
		this.stNum = stNum;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public int getIntGrade() {
		return intGrade;
	}
	public void setIntGrade(int intGrade) {
		this.intGrade = intGrade;
	}
	public String getStTel() {
		return stTel;
	}
	public void setStTel(String stTel) {
		this.stTel = stTel;
	}
	public String getStAddr() {
		return stAddr;
	}
	public void setStAddr(String stAddr) {
		this.stAddr = stAddr;
	}
	public String getSrDept() {
		return srDept;
	}
	public void setSrDept(String srDept) {
		this.srDept = srDept;
	}
	
	@Override
	public String toString() {
		return "StudentVO [stNum=" + stNum + ", stName=" + stName + ", intGrade=" + intGrade + ", stTel=" + stTel
				+ ", stAddr=" + stAddr + ", srDept=" + srDept + "]";
	}
	
	
}
