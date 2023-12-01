package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Dao {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public Dao() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn= DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","1234");
			System.out.println("연동성공");
		} catch (Exception e) {System.out.println("연동실패"+e);}
		
	}


	//1.환자조회
	public List<Dto> list(){
		List<Dto> list = new ArrayList();
		try {
			String sql="select*from tbl_patient_202004";
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				Dto dto = new Dto(rs.getString("p_no"), rs.getString("p_name"), rs.getString("p_birth"), rs.getString("p_gender"), rs.getString("p_tel1"), rs.getString("p_tel2"), rs.getString("p_tel3"), rs.getString("p_city"));
				list.add(dto);
				System.out.println(list);
			}
		} catch (Exception e) {System.out.println("환자조회오류>"+e);}
		return list;
	}

	
	//2. 검사결과등록
	public boolean register(String p_no,String t_code,String t_sdate,String t_status,String t_ldate,String t_result) {
		try {
			String sql= "insert into tbl_result_202004 values (?,?,?,?,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setString(1, p_no);
			ps.setString(2, t_code);
			ps.setString(3, t_sdate);
			ps.setString(4, t_status);
			ps.setString(5, t_ldate);
			ps.setString(6, t_result);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {System.out.println("등록오류> "+e);}
		return false;
	}
	
	//3. 결과 출력
	public List<Dto> print(){
		List<Dto> list = new ArrayList<Dto>();
		try {
			String sql="";
			ps=conn.prepareStatement(sql);
			
			
		} catch (Exception e) {System.out.println("결과출력오류> "+e);}
		return list;
	}
	
}//c
