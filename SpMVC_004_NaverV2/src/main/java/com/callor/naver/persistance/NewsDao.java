package com.callor.naver.persistance;

import java.util.List;

import com.callor.naver.model.NewsVO;

public interface NewsDao extends GenericDao<NewsVO, String> {
	/*
	 * GenrincDao 를 상속받음으로 해서 기본 CRUD 5개의 method 는 만들지 않아도 된다 
	 * 
	 */
	
	// 기본 CRUD 외에 필요한 method 가 있을경우 별도록 추가할수있다
	public List<NewsVO> findByTitle(String title);

}
