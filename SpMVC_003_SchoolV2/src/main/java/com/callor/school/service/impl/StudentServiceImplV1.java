package com.callor.school.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.callor.school.controller.domain.StudentVO;
import com.callor.school.service.StudentService;

@Service
public class StudentServiceImplV1 implements StudentService {

	@Override
	public List<StudentVO> selectAll() {
List<StudentVO> stList = new ArrayList<>();
		
		StudentVO stVO = new StudentVO();
		stVO.setStNum("00001");
		stVO.setStName("홍길동");
		stVO.setIntGrade(3);
		stVO.setStAddr("서울특별시");
		stList.add(stVO);
		
		/*
		 * vo 데이터를 사용하여 새로운 학생정보를 list 에 추가하기 위해서는
		 * 반드시 vo 를 다시 생성해 주어야 한다.
		 */
		stVO = new StudentVO(); // stVO 를 다시 생성하기
		stVO.setStNum("00002");
		stVO.setStName("이몽룡");
		stVO.setIntGrade(2);
		stVO.setStAddr("전라북도 익산시");
		stList.add(stVO);

		stVO = new StudentVO(); // stVO 를 다시 생성하기
		stVO.setStNum("00003");
		stVO.setStName("성춘향");
		stVO.setIntGrade(1);
		stVO.setStAddr("전라북도 남원시");
		stList.add(stVO);

		stVO = new StudentVO(); // stVO 를 다시 생성하기
		stVO.setStNum("00004");
		stVO.setStName("임꺽정");
		stVO.setIntGrade(4);
		stVO.setStAddr("함경북도 함흥시");
		stList.add(stVO);
		
		stVO = new StudentVO(); // stVO 를 다시 생성하기
		stVO.setStNum("00005");
		stVO.setStName("장보고");
		stVO.setIntGrade(1);
		stVO.setStAddr("전라남도 진도군");
		stList.add(stVO);
		return stList;
	
	}

	@Override
	public StudentVO findByStNum(String stNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer insert(StudentVO stVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer update(StudentVO stVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer delete(String stNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentVO> findBystTel(String stTel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentVO> findBystName(String stName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentVO> findBystAddr(String stAddr) {
		// TODO Auto-generated method stub
		return null;
	}

}
