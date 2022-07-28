package com.callor.sec.service.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.callor.sec.model.UserVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("authenticationProvider")
public class AuthorProviderImpl implements AuthenticationProvider{

	@Autowired
	@Qualifier("userDetailsService")
	private UserDetailsService userDeService;
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		/*
		 * Authentication
		 * 로그인한 사용자의 정보를 전달받을 객체
		 * username password 를 통한 login 절차
		 * Principal Credential 방식의 로그인
		 */
		
		String username = (String)authentication.getPrincipal().toString();
		String password = authentication.getCredentials().toString();
		
		UserVO user= (UserVO) userDeService.loadUserByUsername(username);
		
		// 사용자의 비밀번호 검사 들을 실행하여 정상 접근인지 확인하기
		// 최초 회원가입을 했을때는 아직 정상 절차가 완료되지 않아서
		// 로그인을 성공해도 다른 기능을 사용할 수 없도록 하기 위해서
		// 회원데이터의 isEnavle 값을 false 로 설정하고
		// 이후 다른 절차를 통하여 정상사용자 임이 입증되면
		// isEnabled 칼럼을 true 인가하는 절차를 진행한다
		if(user.isEnabled()== false) {
			throw new BadCredentialsException(username+"NOT Recognize");
		}
		
		
		log.debug("인증클래스");
		
		// 인증이 완료되면 사용자 정보를 Security.Context token 과 함께 담아서
		// 로그인 성공을 프로젝트레 전파하기 위하여 객체로 구현
		// user:로그인한 사용자 정보,
		// user.getAuthorfities(): 로그인한 사용자의 권한 리스트
		Authentication authorOK = new UsernamePasswordAuthenticationToken(user, null,user.getAuthorities());
		return authorOK;
	}

	
	@Override
	public boolean supports(Class<?> authentication) {
		// TODO Auto-generated method stub
		return true;
	}

}
