<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="POST">
	<div><input name="st_name"  placeholder="이름"></div>
	<div><input name="st_kor"  placeholder="국어"></div>
	<div><input name="st_eng"  placeholder="영어"></div>
	<div><input name="st_math"  placeholder="수학"></div>
	<div><button>서버로 보내기</button></div>
	</form>
	
	<div>
	<p> 이름 : ${SCORE.st_name}</p>
	<p> 국어 : ${SCORE.st_kor}</p>
	<p> 영어 : ${SCORE.st_eng}</p>
	<p> 수학 : ${SCORE.st_math}</p>
	</div>
</body>
</html>