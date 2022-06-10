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
<title>Insert title here</title>
<style>
form.login {
	width: 60%;
	margin: 10px auto;
	padding: 10px;
}

form.login input, form login button {
	margin: 10px;
}
</style>
<script src="${rootPath}/static/js/login.js?ver=2022-06-09-001"></script>
</head>
<body>
	<form method="POST" class="w3-container login w3-card-4">
		<h2 class="w3-text-blue">로그인</h2>
		<c:if test="${error == 'LOGIN_NEED'}">
		<div class="w3-red w3-padding-16"> * 로그인이 필요한 서비스입니다.</div>
		</c:if>
		<c:if test="${error == 'USERNAME_FAIL'}">
		<div class="w3-red w3-padding-16"> ID 가 없습니다 회원가입 먼저</div>
		</c:if>
		<c:if test="${error == 'PASSWORD_FAIL'}">
		<div class="w3-red w3-padding-16"> 비밀번호가 틀림</div>
		</c:if>
		
		<label class="w3-text-blue"><Strong>USER NAME(ID)</Strong></label>
		 <input name="username" , placeholder="USERNAME" class="w3-input w3-boder">
		<label><Strong>비밀번호</Strong></label> <input name="password"
			, placeholder="PASSWORD" class="w3-input w3-boder">
		<button type="button" class="w3-button w3-green btn-login">로그인</button>

	</form>
</body>
</html>