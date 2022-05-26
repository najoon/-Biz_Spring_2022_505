package com.callor.school.model;

import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentVO {
	
	 private String st_num;
	 private String st_name;
	 private int st_grade;
	 private String st_addr;
	 private String st_tel;

}
