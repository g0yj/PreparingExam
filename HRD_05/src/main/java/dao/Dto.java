package dao;

public class Dto {
	private String p_no;
	private String p_name;
	private String p_birth;
	private String p_gender;
	private String p_tel1;
	private String p_tel2;
	private String p_tel3 ;
	private String p_city;
	
	
	private String t_code;  
	private String t_sdate; 
	private String t_status; 
	private String t_ldate;
	private String t_result;
	
		
	
	public Dto() {}

	
	
	public Dto(String p_no, String p_name, String p_birth, String p_gender, String p_tel1, String p_tel2, String p_tel3,
				String p_city) {
			super();
			this.p_no = p_no;
			this.p_name = p_name;
			this.p_birth = p_birth;
			this.p_gender = p_gender;
			this.p_tel1 = p_tel1;
			this.p_tel2 = p_tel2;
			this.p_tel3 = p_tel3;
			this.p_city = p_city;
		}


	
	//=====================================================	
	
	public Dto(String p_no, String t_code, String t_sdate, String t_status, String t_ldate, String t_result) {
		super();
		this.p_no = p_no;
		this.t_code = t_code;
		this.t_sdate = t_sdate;
		this.t_status = t_status;
		this.t_ldate = t_ldate;
		this.t_result = t_result;
	}



	public String getP_no() {
		return p_no;
	}


	public String getT_code() {
		return t_code;
	}



	public void setT_code(String t_code) {
		this.t_code = t_code;
	}



	public String getT_sdate() {
		return t_sdate;
	}



	public void setT_sdate(String t_sdate) {
		this.t_sdate = t_sdate;
	}



	public String getT_status() {
		return t_status;
	}



	public void setT_status(String t_status) {
		this.t_status = t_status;
	}



	public String getT_ldate() {
		return t_ldate;
	}



	public void setT_ldate(String t_ldate) {
		this.t_ldate = t_ldate;
	}



	public String getT_result() {
		return t_result;
	}



	public void setT_result(String t_result) {
		this.t_result = t_result;
	}



	public void setP_no(String p_no) {
		this.p_no = p_no;
	}


	public String getP_name() {
		return p_name;
	}


	public void setP_name(String p_name) {
		this.p_name = p_name;
	}


	public String getP_birth() {
		return p_birth;
	}


	public void setP_birth(String p_birth) {
		this.p_birth = p_birth;
	}


	public String getP_gender() {
		return p_gender;
	}


	public void setP_gender(String p_gender) {
		this.p_gender = p_gender;
	}


	public String getP_tel1() {
		return p_tel1;
	}


	public void setP_tel1(String p_tel1) {
		this.p_tel1 = p_tel1;
	}


	public String getP_tel2() {
		return p_tel2;
	}


	public void setP_tel2(String p_tel2) {
		this.p_tel2 = p_tel2;
	}


	public String getP_tel3() {
		return p_tel3;
	}


	public void setP_tel3(String p_tel3) {
		this.p_tel3 = p_tel3;
	}


	public String getP_city() {
		return p_city;
	}


	public void setP_city(String p_city) {
		this.p_city = p_city;
	}
	
	
	
	
	
}
