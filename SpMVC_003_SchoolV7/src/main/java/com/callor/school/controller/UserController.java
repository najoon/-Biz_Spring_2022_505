package com.callor.school.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.callor.school.model.UserVO;
import com.callor.school.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value="/user")
public class UserController {
	
	private final UserService userService;
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login() {
		return null;
	}
	
	/*
	 * 1. login.form 에서 username 과 password 받기
	 * 2. userVO 에 담겨서 받게 된다
	 * 3. userVO UserService.login 에게 전달한다
	 * 4. UserService.login() method 는 username과 password 검사
	 * 5. 정상적인(username, password 가 일치) 정보이면
	 * 		나머지 user 정보를 userVO 에 담아서 return
	 * 		만약 정상적인 사용자가 아니면 null 을 return
	 * 
	 * 6. Controller.login.POST method 에는
	 * 		HtttpSession 클래스를 매개변수로 설정한다
	 * 7. 정상 사용자정보이면(userVO 가 null 이 아니면)
	 * 		setAttribute() method 를 사용하여 사용자 정보를
	 * 		변수에 setting 한다
	 * 8. 정상 사용자가 아니면 removeAttribute() method 를 사용하여
	 * 		변수를 제거해 버린다
	 */
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(UserVO userVO,HttpSession session,Model model) {
		//로그인 폼에서 입력한 username, password 는 userVO 에 담겨 
		// 이곳에 도착한다
		log.debug(userVO.toString());
		
		String loginMessage = null;
		//로그인 폼에서 전송된 데이터중 username 으로
		UserVO loginUserVO = userService.findById(userVO.getUsername()); 
		// username 이 가입된 적이 없을때
		if(loginUserVO == null) {
			
			loginMessage = "USERNAME FAIL";
		}else // else if
		// username 은 있는데 password 가 다를경우
		if(!loginUserVO.getPassword().equals(userVO.getPassword())) {
			loginMessage = "PASSWORD FAIL";
			
		}
		
		// 로그인 되었는지 그렇지 않은지 세션에 setting
		if(loginMessage == null) {
			session.setAttribute("USER", loginUserVO);
		} else {
			session.removeAttribute("USER");
		}
		model.addAttribute("LOGIN_MESSAGE",loginMessage);
		return "user/login_ok";
	}
	
	
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public String logout(HttpSession session) {
		session.removeAttribute("USER");
		
		/*
		 * redirect:
		 * 로그아웃이 끝나면
		 * web browser 의 주소창에 /user/login 을 입력하고
		 * Enter 를 눌러라 
		 */
		return "redirect:/user/login";
	}
	
	@RequestMapping(value="/join",method = RequestMethod.GET)
	public String join() {
		
		/* 이 메서드를 요청하는 url 은
		 *  /user/join이다
		 *  
		 *  return null 을 실행하면
		 *  return user/join 을 실핼한 것과 같다
		 *  
		 *  views/user/join.jsp 를 rendering 하라는 의미
		 * */
		return null;
		
	}
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String join(UserVO userVO){
		
		log.debug("JOIN");
		log.debug(userVO.toString());
		userService.join(userVO);
		/*
		 * return "문자열" :forwqrding
		 * => views/문자열.jsp를 renfering 하라
		 * 
		 * return "redierct:/url : pass,toss, rederct"
		 * => 서버의 localhost:8080/url 릏 다시 requst 하라
		 * => web browse 주소창에 
		 */
		return "redirect:/user/login";
	}
	
	/*
	 * /username 중복검사를 하기 위하여 보통 다음같은 요청을 수행한다
	 * 	/user/idcheck?username=callor
	 * 
	 * fetch(`${rootPath}/user/idcheck/${username.value}`)
	 * 만약 username 에 callor 입력했으면
	 *	/user/idcheck/callor 처럼 요청 url 을 만들어서 요청을 수행하라
	 * 	 
	 */
	@ResponseBody
	@RequestMapping(value="/idcheck/{username:.+}",method=RequestMethod.GET)
	public String idcheck(@PathVariable String username) {
		UserVO userVO = userService.findById(username);
		
		// if(username.equalsIgnoreCase(userVO.getUsername()))
		// if(userVO.getUsername().equalsIgnoreCase(username)) {
			//return "FAIL";
		//}else {
			//return "OK";
		//}
		if(userVO == null) {
			return "OK";
			
		}else {
			
			return "FAIL";
		}
	}

}
