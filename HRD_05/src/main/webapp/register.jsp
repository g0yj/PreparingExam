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
	<center><h3>검사결과입력</h3></center>

	<script type="text/javascript">
		function rrreset(){
			console.log('실행')
			alert('처음등록');
			let f=document.registerForm;
			f.reset();
			f.p_no.focus();
			focus()
		}
	</script>
	<form name="registerForm" action="registerLogic.jsp">
		<table border="1">
			<tr>
				<th>환자번호</th>
				<td><input type="text" name="p_no">예)1003</td>
			</tr>
			<tr>
				<th>검사코드</th>
				<td>
					<select name="t_code">
						<option>검사명</option>
						<option value="T001">[T001]결핵</option>
						<option value="T002">[T002]장티푸스</option>
						<option value="T003">[T003]수두</option>
						<option value="T004">[T004]홍역</option>
						<option value="T005">[T005]콜레라</option>
					</select>
				</td>
			</tr>
			<tr>
				<th>검사시작일</th>
				<td><input type="text" name="t_sdate">예)20200202</td>
			</tr>
			
			<tr>
				<th>검사상태</th>
				<td>
					<input type="radio" name="t_status" value="1">검사중
					<input type="radio" name="t_status" value="2">검사완료
				</td>
			</tr>
			
			
			<tr>
				<th>검사완료일자</th>
				<td><input type="text" name="t_ldate">예)20200202</td>
			</tr>
			<tr>
				<th>검사결과</th>
				<td>
					<input type="radio" name="t_result" value="X">미입력
					<input type="radio" name="t_result" value="P">양성
					<input type="radio" name="t_result" value="N">음성
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<button onclick=register() type="button">검사결과등록</button>
					<button onclick=rrreset() type="button">다시쓰기</button>
				</td>
				
			</tr>
		
		</table>
	
	
	</form>	
	
	<%@include file="footer.jsp" %>
	<script type="text/javascript" src="register.js"></script>
</body>
</html>