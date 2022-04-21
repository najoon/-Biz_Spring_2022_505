package com.callor.app.service;

import com.callor.app.domain.StudentVO;

public interface StudentService { // 인터페이스
		
		public int insert(StudentVO studentVO); // 데이터 추가
		public StudentVO[] selectAll(); // 전체 리스트 가져오기
		public StudentVO findById(String stNum);// 개인 데이터 가져오기
		

}
