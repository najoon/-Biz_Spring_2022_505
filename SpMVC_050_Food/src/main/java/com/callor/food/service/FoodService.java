package com.callor.food.service;

import java.util.List;

import com.callor.food.controller.FoodItem;

public interface FoodService {
	
	public String queryString(String search);
	public List<FoodItem> getFoodItems(String queryString);

}
