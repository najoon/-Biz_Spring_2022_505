package com.callor.todo.service.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.callor.todo.persistance.UserDao;

@Service
public class BeanServiceImpl {
	
	@Autowired
	private UserDao userDao;
	
	@Bean("passwordEncoder")
	public PasswordEncoder getPassword() {
		
		return new BCryptPasswordEncoder();
	}
	/*
	 * UserServiceImpl 에서 table 을 생성하는 sql 호출하면
	 * @Transacion 과 충돌하는 현상이 발생하여 
	 * 별도로 분리하였다
	 */
	@Bean
	public void create_table() {
		userDao.create_user_table();
		userDao.create_author_table();
		
	}
	
		

}
