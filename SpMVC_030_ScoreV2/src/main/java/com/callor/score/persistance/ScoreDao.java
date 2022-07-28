package com.callor.score.persistance;

import org.apache.ibatis.annotations.Param;

import com.callor.score.model.ScoreVO;

public interface ScoreDao extends GenericDao<ScoreVO, String>{
	
	public int updateScore(ScoreUpdateVO score);
	public int updateScore(@Param("sc_num") String st_num,@Param("sc_code") String sb_code,@Param("sc_score") String sc_score );
	
	
	
}
