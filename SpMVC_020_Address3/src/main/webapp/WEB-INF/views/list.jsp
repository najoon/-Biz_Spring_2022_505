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
<link rel="stylesheet"
	href="${rootPath}/static/css/home.css?ver=2022-07-19-004">
<title>Insert title here</title>
<style>
* {
	margin: 0px;
	padding: 0px;
}

body {
	text-align: center; /* Quirks Mode 를 위한 가운데 정렬 */
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

#center {
	display: flex;
	justify-content: center;
	align-items: center;
}

:root { -
	-button-color: #ffffff; -
	-button-bg-color: #0d6efd; -
	-button-hover-bg-color: #025ce2;
}

button {
	-webkit-appearance: none;
	-moz-appearance: none;
	appearance: none;
	background: var(- -button-bg-color);
	color: var(- -button-color);
	margin: 0;
	padding: 0.5rem 1rem;
	font-family: 'Noto Sans KR', sans-serif;
	font-size: 1rem;
	font-weight: 400;
	text-align: center;
	text-decoration: none;
	border: none;
	border-radius: 4px;
	display: inline-block;
	width: auto;
	box-shadow: 0 4px 6px -1px rgba(0, 0, 0, 0.1), 0 2px 4px -1px
		rgba(0, 0, 0, 0.06);
	cursor: pointer;
	transition: 0.5s;
}

button.success { -
	-button-bg-color: #28a745; -
	-button-hover-bg-color: #218838;
}

button.error { -
	-button-bg-color: #28a745; -
	-button-hover-bg-color: #c82333;
}

button.warning { -
	-button-color: #28a745; -
	-button-bg-color: #28a745; -
	-button-hover-bg-color: #28a745;
}

button:active, button:hover, button:focus {
	background: var(- -button-hover-bg-color);
	outline: 0;
}

button:disabled {
	opacity: 0.5;
}

input {
	width: 500px;
	height: 32px;
	font-size: 15px;
	border: 0;
	border-radius: 15px;
	outline: none;
	padding-left: 10px;
	background-color: rgb(233, 233, 233);
}

table {
	margin-top: 50px;
	box-shadow: 5px 5px 5px 5px gray;
	width: 1600px;
	text-align: center;
	border-collapse: collapse;
}

tbody tr:nth-child(even) {
	background-color: white;
}

tbody tr:nth-child(odd) {
	background-color: #808080;
	opacity: 0.5;
}

th {
	padding: 5px;
}

td {
	padding: 5px;
}
</style>
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
	
</head>
<body>
	<h1>주소록</h1>


	<%
	// fork에 한개의 input box 만 있을경우 input box text 를 입력한 후 enter 를 누르면 input box 에 담긴 문자열을 서버에 전송하는 기능이 활성화
	%>

	<form>
		<input name="search" placeholder="검색어 입력후 enter..." />
	</form>
		<a href="${rootPath}/insert">주소 추가하기</a>
	<div id="center">
		<table>
			<thead>
				<tr>
					<th>seq</th>
					<th>이름</th>
					<th>전화번호</th>
					<th>주소</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${ADDRS}" var="ADDR">
					<tr>
						<td>${ADDR.a_seq}</td>
						<td><a href="${rootPath}/detail?seq=${ADDR.a_seq}">${ADDR.a_name}<span
								class="material-symbols-outlined"> edit </span></a></td>
						<td>${ADDR.a_tel}</td>
						<td>${ADDR.a_address}</td>
					</tr>
				</c:forEach>
			</tbody>

		</table>
	</div>
	<%@ include file="/WEB-INF/views/pagenation.jsp"%>


</body>
</html>