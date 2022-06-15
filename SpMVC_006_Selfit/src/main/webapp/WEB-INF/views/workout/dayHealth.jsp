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
div.list {
	display: flex;
	justify-content: space-around;
}
</style>
</head>
<body>
	<section class="health">
		<h1>${HEALTH.list_name}</h1>
		<p>** 세트가 끝날때 마다 체크를 눌러주세요</p>
		<c:forEach begin="1" end="${HEALTH.sl_set}" varStatus="INDEX">
			<div class="list">
				<span>${INDEX.count} set</span> <input
					placeholder="${HEALTH.sl_weight}"><label>kg</label> <input
					placeholder="${HEALTH.sl_rep}"><label>회</label>
				<button>체크</button>
		</c:forEach>
		</div>
	</section>

</body>
</html>