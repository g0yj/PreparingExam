<%@page import="dao.Dto"%>
<%@page import="java.util.List"%>
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
	
	<center><h3>학생목록</h3></center>
	<table border="1">
		<tr>
			<th>학번</th>
			<th>이름</th>
			<th>학년</th>
			<th>반</th>
			<th>번호</th>
			<th>성별</th>
			<th>전화번호</th>
			<th>주소</th>
		</tr>
		
		<% 
			Dao dao = new Dao();
		 	List<Dto>list=dao.list();
		 	for(int i=0; i<list.size();i++){
		 		Dto dto=list.get(i);
		 %>
		<tr>
			<th><%=dto.getSno() %></th>
			<th><%=dto.getSname() %></th>
			<th><%=dto.getSno().substring(0,1) %></th>
			<th><%=dto.getSno().substring(1,3) %></th>
			<th><%=dto.getSno().substring(3,5) %></th>
			<th><%=dto.getSgender().equals("M")?"남":"여" %></th>
			<th><%=dto.getSphone() %></th>
			<th><%=dto.getSaddress() %></th>
		</tr>		 
		 
		 
		 <%		
		 	}
		
		%>
	
	</table>
	<%@include file="footer.jsp" %>
</body>
</html>