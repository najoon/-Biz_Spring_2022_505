package com.callor.school.pesistance;

import com.callor.school.model.StudentVO;

/*
 * GenericDao 를 상속받으면서
 * StudentVO와 String type 을 Generic 으로 사용하였다
 * 결국 Generic 에 선언된 method 들은 
 * 여기에서 Generic type 으로 선언한 StudentVO 와 String 타입을 갖는 method 를 자동으로 구현하게 된다.
 */

public interface StudentDao extends GenericDao<StudentVO, String>{
	
	
}
