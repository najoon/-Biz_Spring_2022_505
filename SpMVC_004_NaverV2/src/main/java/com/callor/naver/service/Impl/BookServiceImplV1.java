package com.callor.naver.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.callor.naver.config.QualirfierConfig;
import com.callor.naver.model.BookVO;
import com.callor.naver.service.BookService;
/*
 * bookServiceV1
 * BookService interface 를 상속받은 클래스가 다수 있을때
 * Controller 에서 어떤 클래스를 지금 연결하여 사용할 것인가의 
 * 문제가 발생한다
 * 그럴때 @Service Annotation 이름 을 부착하여 두고
 * 클래스 중에서 필요한 부분을 선택할 수 있도록 하기 위해서
 * 부착하는 것
 */
@Service(QualirfierConfig.SERVICE.BOOKS_V1)
public class BookServiceImplV1  implements BookService{

	@Override
	public List<BookVO> findByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookVO> findByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookVO> findByPubisher(String publisher) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookVO> findByPrice(int price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookVO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookVO findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(BookVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(BookVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(BookVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
