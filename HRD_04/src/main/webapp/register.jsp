<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%@include file="header.jsp" %>
	<center><h3>성적입력</h3></center>
	<form name="registerForm" action="registerLogic.jsp">
		<table border="1">
			<tr><td>학번</td><td><input type="text" name="sno"></td></tr>
			<tr><td>국어점수</td><td><input type="text" name="ekor"></td></tr>
			<tr><td>수학점수</td><td><input type="text" name="emath"></td></tr>
			<tr><td>영어점수</td><td><input type="text" name="eeng"></td></tr>
			<tr><td>역사점수</td><td><input type="text" name="ehist"></td></tr>
			<tr><td colspan="2" style="text-align:center "><button type="button" onclick="register()">등록하기</button></td></tr>
		</table>
	</form>
	<%@include file="footer.jsp" %>
	<script type="text/javascript" src="register.js"></script>
</body>
</html>