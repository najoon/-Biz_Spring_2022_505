<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>나의 API App</title>

<link rel="stylesheet"
	href="${rootPath}/static/css/bookInsert.css?ver=2022-06-02-001">

<head />
<body>
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
	<table>
      <thead>
         <tr>
            <th>NO.</th>
            <th>ISBN</th>
            <th>도서명</th>
            <th>출판사</th>
            <th>저자</th>
            <th>출판일자</th>
         </tr>
      </thead>
      <tbody>
         <tr>
            <td>1</th>
            <td>2</th>
            <td>3</th>
            <td>4</th>
            <td>5</th>            
            <td>6</th>            
         </tr>
      </tbody>
   </table>
   <a id="insert" href="${rootPath}/books/insert">도서정보 추가</a>
	<footer>
		<address>CopyRight &copy; sk12392@naver.com</address>
	</footer>
</body>
<html />