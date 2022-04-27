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
코드:${productdto.productcode }<br>
제품이름:${productdto.productname }<br>
가격:${productdto.price }<br>
회사명:${productdto.company }<br>
수량:${productdto.balance }<br>
입고일:${productdto.regdate }<br>
</body>
</html>