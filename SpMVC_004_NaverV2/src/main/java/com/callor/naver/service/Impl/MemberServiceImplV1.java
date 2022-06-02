package com.callor.naver.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.callor.naver.config.QualirfierConfig;
import com.callor.naver.model.MemberVO;
import com.callor.naver.service.MemberService;

@Service(QualirfierConfig.SERVICE.MEMBER_V1)
public class MemberServiceImplV1 implements MemberService{

	@Override
	public List<MemberVO> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberVO> findByTel(String tel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberVO findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberVO findByEmailAndTel(String email, String tel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberVO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberVO findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(MemberVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(MemberVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(MemberVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
