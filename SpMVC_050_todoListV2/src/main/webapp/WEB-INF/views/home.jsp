<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Insert title here</title>
</head>
<body>
	<h1>하이</h1>
	<sec:authorize access="isAnonymous()">
		<h3>
			<a href="${ rootPath}/login">로그인</a>
		</h3>
		<h3>
			<a href="${ rootPath}/user/join">회원가입</a>
		</h3>
	</sec:authorize>
	<sec:authorize access="isAuthenticated() AND hasRole('ROLE_ADMIN')">
		<h3>
			<a href="${rootPath }/admin/home">관리자 페이지</a>
		</h3>
	</sec:authorize>
	<sec:authorize access="isAuthenticated() AND hasRole('ROLE_USER')">
		<h3>
			<a href="${rootPath }/admin/mypage">SDF</a>
		</h3>
	</sec:authorize>
	<h3>
		<form:form action="${rootPath}/logout ">
			<button>로그아웃</button>
		</form:form>
	</h3>

</body>
</html>