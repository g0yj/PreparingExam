console.log('등록.js 열림');
function register(){
	const f=document.registerForm;
	if(f.sno.value==''){alert('번호입력해주세요'); f.sno.focus(); return false;}
	if(f.ekor.value==''){alert('국어입력해주세요'); f.ekor.focus();return false;}
	if(f.emath.value==''){alert('수학입력해주세요'); f.emath.focus();return false;}
	if(f.eeng.value==''){alert('영어입력해주세요'); f.eeng.focus();return false;}
	if(f.ehist.value==''){alert('역사입력해주세요'); f.ehist.focus();return false;}
	alert('모두입력되었습니다');
	f.submit();
}