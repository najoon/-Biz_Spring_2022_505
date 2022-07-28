package com.callor.sec.service.auth;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.callor.sec.model.AuthorityVO;
import com.callor.sec.model.UserVO;
import com.callor.sec.persistance.UserDao;


/*
 * Spring Security 에서 로그인 사용자 정보를 db 로부터
 * 가져와서 핸들링하는 클래스
 * Security UserDetailsService 인터페이스를 상속받고
 * loadUserByUsername() method 를 정의 한다
 */
@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService{
	private final UserDao userDao;
	public UserDetailsServiceImpl(UserDao userDao) {
this.userDao = userDao;
	}

	/* 
	 * 로그인한 사용자의 username 을 매개변수로 전달받아 userDao 를 통해 로그인한 사용자 정보를 db로 부터 가져온다
	 */
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	UserVO userVO = userDao.findById(username);
	
	// 로그인한 사용자의 username 이 table 에 없으면
	if(userVO == null) {
		// exception 을 강제로 발생시켜
		// Spring Securytu 에게 exception 을 발생시켜
		// 메시지 전달하기
		throw new UsernameNotFoundException(username + ": 회원가입을 먼저하세요");
	}
	
	//username 에 해당하는 role 정보를 tbl_authorities table 에서 가져오기
	List<AuthorityVO> authoList= userDao.roleSelect(username);
	// Securitu 의 GrantLIst 로 생성
		List<GrantedAuthority> grantList = new ArrayList<>();
		
		//role 정보 문자열을 grant type 으로 변경하여list add
		for(AuthorityVO author : authoList) {
			grantList.add(new SimpleGrantedAuthority(author.getAuthority()));
			
			
		}
		// grantList userVO.authorities 에 저장
		userVO.setAuthorities(grantList);
		return userVO;
	}
	

}
