<%@page import="dao.Dto"%>
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
	<%
		request.setCharacterEncoding("UTF-8");
		Dao dao = new Dao();
		String sno = request.getParameter("sno");
		String ekor = request.getParameter("ekor");
		String emath = request.getParameter("emath");
		String eeng = request.getParameter("eeng");
		String ehist = request.getParameter("ehist");
		
		dao.register(sno,ekor,emath,eeng,ehist);
		
	
	%>
</body>
</html>