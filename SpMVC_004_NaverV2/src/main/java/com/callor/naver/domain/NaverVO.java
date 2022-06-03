package com.callor.naver.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NaverVO {
	
	private String isbn;
	private String title;
	private String author;
	private String publisher;
	private int price;
	private int discount;
	private String desciption;
	private String pubdata;
	private String link;
	private String image;
}
