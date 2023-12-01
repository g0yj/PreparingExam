<%@page import="dao.Dao"%>
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
	<center><h3>학생성적</h3></center>
	<table>
		<tr>
			<th>학년</th>
			<th>반</th>
			<th>번호</th>
			<th>이름</th>
			<th>국어</th>
			<th>수학</th>
			<th>영어</th>
			<th>역사</th>
			<th>합계</th>
			<th>평균</th>
			<th>순위</th>
		</tr>
		
	<%
		Dao dao = new Dao();
	
	%>	
	</table>
	<%@include file="footer.jsp" %>	
</body>
</html>