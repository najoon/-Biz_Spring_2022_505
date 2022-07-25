<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />

<title>Insert title here</title>
<style>
* {
	margin: 0px;
	padding: 0px;
}

ul, ol {
	list-style: none;
}

a {
	text-decoration: none;
	color: black;
}

h1 {
	position:  relative;
	        left:  300px;
	        top:  50px;
}
#center{
box-shadow: 2px 1px 10px 1px rgba(0,0,255,0.5), -5px -10px 10px 1px gray;
width: 400px;
height : 200px;
 margin:100px auto;
 border-radius: 5px;
}

</style>
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
</head>
<body>
<div id="center">
	<h3>이름 : ${ADDR.a_name}</h3><br>
	<h3>전화번호 : ${ADDR.a_tel}</h3><br>
	<h3>주소 : ${ADDR.a_address}</h3><br>
	<div>
		<a href="${rootPath}/update?seq=${ADDR.a_seq}">수정하기<span class="material-symbols-outlined">
edit
</span></a> <a
			href="${rootPath}/delete?seq=${ADDR.a_seq}">삭제하기<span class="material-symbols-outlined">
delete
</span></a> <a
			href="${rootPath}/">처음으로<span class="material-symbols-outlined">
undo
</span></a>
	</div>
	</div>

</body>
</html>