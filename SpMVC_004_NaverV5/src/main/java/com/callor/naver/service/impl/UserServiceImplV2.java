package com.callor.naver.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.callor.naver.config.QualifierConfig;
import com.callor.naver.model.UserVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service(QualifierConfig.SERVICE.USER_V2)
public class UserServiceImplV2 extends UserServiceImplV1{
	@Autowired
	protected PasswordEncoder passwordEncoder;
	
	@Override
	public int join(UserVO userVO) {
List<UserVO> users = userDao.selectAll();
if(users == null || users.size() < 1) {
	userVO.setRole("ADMIN");
	
}else {
	userVO.setRole("GUEST");
	
}

// password 를 암호화 하자
String planPassword = userVO.getPassword();
String encPassword = passwordEncoder.encode(planPassword);

// 암호화된 password 를 다시 VO  에 setting
userVO.setPassword(encPassword);

//user 정보를 insert
userDao.insert(userVO);
		
		return 0;
	}
	
	@Override
	public UserVO login(UserVO userVO) {
		UserVO loginUser = userDao.findById(userVO.getUsername());
		String encPassword = loginUser.getPassword();
		String planPassword = userVO.getPassword();
								//(평문          암호화된 문자열)
		if(passwordEncoder.matches(planPassword, encPassword)) {
			return loginUser;
		}
		return null;
	}



}
