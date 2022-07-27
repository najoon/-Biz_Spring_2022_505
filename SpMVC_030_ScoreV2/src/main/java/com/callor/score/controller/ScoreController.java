package com.callor.score.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.score.model.StudentVO;
import com.callor.score.service.ScoreService;
import com.callor.score.service.StudentService;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Controller
@RequestMapping(value="/score")
public class ScoreController {
private final StudentService stService;
private final ScoreService scoreService;



public ScoreController(StudentService stService, ScoreService scoreService) {
	this.stService = stService;
	this.scoreService = scoreService;
}


@RequestMapping(value="/update",method = RequestMethod.GET)
public String update(String st_num, Model model) {
	
	StudentVO student = stService.findById(st_num);
	model.addAttribute("STUDENT",student);
	return "score/input";
}


// 한개의 form 에 다수의 input 가 같은 이름으로 존재할 경우 controller 
@RequestMapping(value="/update",method = RequestMethod.POST)
public String update(String st_num, String[] sb_code, String[] sc_score) {
g
	scoreService.updateScore(st_num, sb_code, sc_score);
	
return "redirect:/student/detail?st_num=" + st_num;
}


}