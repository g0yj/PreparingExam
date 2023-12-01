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
	
		System.out.println("로직입장");	
	
		String p_no = request.getParameter("p_no");
		String t_code = request.getParameter("t_code");
		String t_sdate = request.getParameter("t_sdate");
		String t_status = request.getParameter("t_status");
		String t_ldate = request.getParameter("t_ldate");
		String t_result = request.getParameter("t_result");
	
		Dao dao = new Dao();
		dao.register(p_no, t_code, t_sdate, t_status, t_ldate, t_result);
		
		response.sendRedirect("index.jsp");
	%>
</body>
</html>