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
	
	<center><h3>검사결과조회</h3></center>
	<table>
		<tr>
			<th>환자번호</th>
			<th>환자명</th>
			<th>검사명</th>
			<th>검사시작일</th>
			<th>검사상태</th>
			<th>검사종료일</th>
			<th>검사결과</th>
		</tr>
	
		<%
			Dao dao = new Dao();
		
		
		%>
	
	</table>
	
	<%@include file="footer.jsp" %>
</body>
</html>