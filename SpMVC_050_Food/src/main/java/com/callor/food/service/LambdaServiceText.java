package com.callor.food.service;

public class LambdaServiceText {
	
	public void home() {
		String result = (nation,name,num)->{
			return nation + name +num;
			
		}
		
	}

}
