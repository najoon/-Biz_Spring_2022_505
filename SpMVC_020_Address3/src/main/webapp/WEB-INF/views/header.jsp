<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="rootPath" value = "${pageContext.request.contextPath}"/>
	<header>
		<h1>주소록 2022</h1>
	</header>
	<nav>
		<ul>
			<li><a href="${rootPath}/home">HOME</a></li>
			<li><a href="${rootPath}/about">About</a></li>
			<li>JOIN</li>
			<LI>LOGIN</LI>
		</ul>
	</nav>