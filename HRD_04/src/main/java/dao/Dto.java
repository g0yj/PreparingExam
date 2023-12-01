package dao;

public class Dto {

	private String sno;
	private String sname;
	private String sphone ;
	private String sgender;
	private String saddress;


	private String ekor;
	private String emath;
	private String eeng;
	private String ehist;
	
	
	
	public Dto() {}


	//1.전체학생조회
	public Dto(String sno, String sname, String sphone, String sgender, String saddress) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sphone = sphone;
		this.sgender = sgender;
		this.saddress = saddress;
	}


	//2. 점수등록
	

//=============================================
	public String getSno() {
		return sno;
	}




	public String getEkor() {
		return ekor;
	}


	public void setEkor(String ekor) {
		this.ekor = ekor;
	}


	public String getEmath() {
		return emath;
	}


	public void setEmath(String emath) {
		this.emath = emath;
	}


	public String getEeng() {
		return eeng;
	}


	public void setEeng(String eeng) {
		this.eeng = eeng;
	}


	public String getEhist() {
		return ehist;
	}


	public void setEhist(String ehist) {
		this.ehist = ehist;
	}


	public void setSno(String sno) {
		this.sno = sno;
	}



	public String getSname() {
		return sname;
	}



	public void setSname(String sname) {
		this.sname = sname;
	}



	public String getSphone() {
		return sphone;
	}



	public void setSphone(String sphone) {
		this.sphone = sphone;
	}



	public String getSgender() {
		return sgender;
	}



	public void setSgender(String sgender) {
		this.sgender = sgender;
	}



	public String getSaddress() {
		return saddress;
	}



	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	
	
	
	


}
