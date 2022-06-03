<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<link rel="stylesheet"
	href="${rootPath}/static/css/books.css?ver=2022-06-02-001">
<header> 
	<h1>Naver OpenAPI</h1>
	</header>
	
	<nav>
		<ul>
			<li><a href="${rootPath}/">Home</a></li>
			<li><a href="${rootPath}/books/list">도서정보</a></li>
			<li><a href="${rootPath}/news">오늘의 뉴스</a></li>
			<li><a href="${rootPath}/movies">영화정보</a></li>
			<li><a href="${rootPath}/naver">네이버 체험</a></li>
		</ul>
	</nav>
	<section class="main"></section>
<form method="POST">
	<div>
		<input name="isbn" id="isbn" placeholder="ISBN"> 
		<input name="title" id="title" placeholder="도서명 입력후 Enter">
	</div>
	<div>
		<input name="author" placeholder="저자"> 
		<input name="publisher"placeholder="출판사"> 
		<input name="pubdata" placeholder="출판일">
		<input name="discount" placeholder="할인가격"> 
		<input name="price" placeholder="가격" type="number">
	</div>
	<div>
		<input name="link" placeholder="자세히보기"> <input name="image"
			placeholder="이미지 경로">
	</div>
	<input name="desciption">
	<button type="submit">저장</button>
</form>