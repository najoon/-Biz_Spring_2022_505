<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Insert title here</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<style>
nav ul {
	list-style: none;
	display: flex;
	background-color: blue;
	color: white;
}

nav li {
	padding: 12px 5px;
	margin: 5px;
	cursor: pointer;
}

nav li:hover {
	box-shadow: 2px 2px 2px yellow;
}

nav li:nth-last-of-type(5) {
	margin-left: auto;
}

nav a {
	text-decoration: none;
	color: inherit;
}
form #logout-form {

display: none;
}
</style>
</head>
<body>
	<header class="w3-container w3-green w3-text=white">
		<h1>반갑습니다</h1>
		<p>심플한</p>
	</header>
	<nav>
		<ul>
			<li><a href="${rootPath}/">home</a></li>
			<sec:authorize access="isAnonymous()">
			<li><a href="${rootPath}/user/login">로그인</a></li>
			<li><a href="${rootPath}/user/join">회원가입</a></li>
			</sec:authorize>
			
			<sec:authorize access="isAuthenticated()">
			<li class="logout">로그아웃</li>
			<sec:authorize access="hasRole('ROLE_USER')"> </sec:authorize>
			<li><a href="${rootPath}/user/mypage">my page</a></li>
			</sec:authorize>
			
			<sec:authorize access="hasRole('ROLE_ADMIN')"/>
			<li><a href="${rootPath}/admin">관리자</a></li>
		</ul>
	</nav>
	<section class="w3-container w3-padding-16">
		<c:choose>
			<c:when test="${LAYOUT =='LOGIN' }">
			<%@ include file="/WEB-INF/views/user/login.jsp"%>
			</c:when>
			<c:when test="${LAYOUT =='JOIN' }">
			<%@ include file="/WEB-INF/views/user/join.jsp"%>
			</c:when>
			<c:otherwise>
				<h1>여기는 홈화면</h1>
			</c:otherwise>
		</c:choose>

	</section>

	<form:form id="logout-form" action="${rootPath}/logout" method="POST"/>
	<script>
	document.querySelector("li.logout")?.addEventListener("click",()=>{
		document.querySelector("form#logout-form")?.submit()

	})
	</script>
	
</body>
</html>