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
	<center><h3>환자조회</h3></center>
	<table border="1">
		<tr>
			<th>환자번호</th>
			<th>환자성명</th>
			<th>생년월일</th>
			<th>성명</th>
			<th>전화번호</th>
			<th>지역</th>
		</tr>
		
		<%
			Dao dao = new Dao();
			List<Dto> list=dao.list();
			for(int i=0; i<list.size();i++){
				Dto dto = list.get(i);
		%>
		
		<tr>
			<td><%=dto.getP_no()%></td>
			<td><%=dto.getP_name() %></td>
			<td>
				<%=
					dto.getP_birth().substring(0,4)+"년"
					+dto.getP_birth().substring(4,6)+"월" 
					+dto.getP_birth().substring(6,8)+"일" 
				%>
			</td>
			<td>
				<%=
					dto.getP_gender().equals("M")?"남":"여"
				%>
			</td>
			<td>
				<%=
					dto.getP_tel1()+"-"
					+dto.getP_tel2()+"-"
					+dto.getP_tel3()
				%>
			</td>
			<td><%=dto.getP_city().equals("10")?"서울":
					dto.getP_city().equals("20")?"경기":
					dto.getP_city().equals("30")?"강원":"대구"
				%></td>
		
		</tr>
		
		<%	
			}
		%>
		
	</table>
	<%@include file="footer.jsp" %>
</body>
</html>