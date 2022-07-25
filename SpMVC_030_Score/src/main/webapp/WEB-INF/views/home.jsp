<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<%@ taglib uri="http://tiles.apache.org/tags-tiles"  prefix="tiles"%>    
   
<!DOCTYPE html>
<html>
<head>
<tiles:insertAttribute name="head"/>
</head>
<body>
	<h1>고려고교 성적처리2022</h1>
<tiles:insertAttribute name="header" />
<tiles:insertAttribute name="content" />

<footer>
<address>CopyRight &copy; sk12392@naver.com</address>
</footer>
</body>
</html>