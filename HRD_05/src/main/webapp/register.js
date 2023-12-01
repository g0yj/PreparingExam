console.log('js열림')

function register(){
	console.log('버튼누름')
	let f= document.registerForm;
	if(f.p_no.value==''){alert('환자번호입력안됨');f.p_no.focus();return false;}
	if(f.t_code.value==''){alert('검사코드입력안됨');f.t_code.focus();return false;}
	if(f.t_sdate.value==''){alert('시작일입력안됨');f.t_sdate.focus();return false;}
	if(f.t_status.value==''){alert('상태입력안됨');f.t_status.focus();return false;}
	if(f.t_ldate.value==''){alert('완료일자입력안됨');f.t_ldate.focus();return false;}
	if(f.t_result.value==''){alert('검사결과입력안됨');f.t_result.focus();return false;}
	f.submit();
	alert('정상등록');
	
	
}
