<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="rootPath" value = "${pageContext.request.contextPath}"/>

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
	margin-top: 200px;
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

	<form>
		<input name="search" placeholder="검색어 입력후 enter..." />
	</form>
<form class="insert" method="POST">
		<input class="name" name="a_name" placeholder="이름" value="${ADDR.a_name}" /> 
		<input class="tel" name="a_tel" placeholder="전화번호" value="${ADDR.a_tel}" /> 
		<input class="address" name="a_address" placeholder="주소" value="${ADDR.a_address}" />
		<button class="join">저장</button>
	</form>
	
	