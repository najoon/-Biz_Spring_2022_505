package com.callor.score.persistance;

import java.util.List;

public interface GenericDao<VO, PK> {
	
	public List<VO> selectAll();
	public VO findById(PK id);
	public int insert(VO vo);
	public int update(VO vo);
	public int delete(PK id);
	public VO findScore(PK id);
	public int updateScore(VO vo);



}
