package com.callor.school.controller.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// 1. Spring project에서 VO(DT) 클래스를 선언할 때는 필드 변수를 private으로 선언하고
// 2. getter() & setter() 를 선언하고
// 3. toString() 메서드를 재 정의하고
// 4. 기본생성자와 필드생성자를 정의해둔다


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class StudentVO {

	private String stNum; // 학번
	private String stName; // 이름
	private int intGrade; // 학년
	private String stTel; // 전화번호
	private String stAddr; // 주소
	private String stDept; // 학과
	
	
}
