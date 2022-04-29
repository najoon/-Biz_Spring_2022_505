package com.callor.school.service;

import java.util.List;

import com.callor.school.controller.domain.StudentVO;

public interface StudentService {

	// CRUD method들의 prototype 선언
	// C (Create, insert) : 새로운 데이터 추가
	// R (Read, selectAll, findBystNum) : 데이터 읽기
	// U (Update, update) : 기존 데이터 변경
	// D (Delete, delete) : 기존 데이터 중 삭제

	public List<StudentVO> selectAll();

	public StudentVO findByStNum(String stNum);

	public Integer insert(StudentVO stVO);

	public Integer update(StudentVO stVO);

	public Integer delete(String stNum);


	// 유일한 값이 아닐 수 있는 데이터는 반드시 List<>로 return해야한다 : 구현클래스, 구현체 
	public List<StudentVO> findBystTel(String stTel);

	public List<StudentVO> findBystName(String stName);

	public List<StudentVO> findBystAddr(String stAddr);

}
