package com.callor.naver.persistance;

import java.util.List;

import com.callor.naver.model.UserVO;

public interface UserDao extends GenericDao<UserVO, String>{

	public List<UserVO> findByName(String name);
	public List<UserVO> findByNickname(String nickName);
	public List<UserVO> findByEmail(String email);
	/*
	 * username, password 찾기에서 email 을 활용하는 경우가 많기 때문에
	 * Email 칼럼을 UNIQUE 로 설정하는 경우가 많다
	 * DBtable 의 칼럼이 unique 라면 칼럼을 조건으로 select 를 했을때 list 가 아닌 VO 가 추출될 것이다
	 * 그렇다면 굳이 method 의 return type 을 List(VO) 로 할 필요가 없다 
	 */
	
	public void create_user_table();
	}
	

