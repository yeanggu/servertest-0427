<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="resources/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		
	});
</script>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<c:forEach items="${ productlist }" var="dto">
	<h3>${ dto.productcode }</h3>
	<h3><a href="/product?code=${ dto.productcode }"> ${ dto.productname }</a></h3>
	<h3>${ dto.price }</h3>
	<h3>${ dto.company }</h3>
	<h3>${ dto.balance }</h3>
	<h3>${ dto.regdate }</h3><br>
</c:forEach>
</body>
</html>