package dao;

import java.sql.Connection;
import java.sql.Driver;
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
			conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","1234");
			System.out.println("연동성공");
		} catch (Exception e) {System.out.println("연동실패"+e);}
	}


	public List<Dto>list() {
		List<Dto> list = new ArrayList();
		try {
			String sql="select*from student_tbl_03";
			ps= conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				Dto dto = new Dto(rs.getString("sno"), rs.getString("sname"), rs.getString("sphone"), rs.getString("sgender"), rs.getString("saddress"));
				list.add(dto);
			}
		} catch (Exception e) {System.out.println("조회오류> "+e);}
		return list;
	}
	
	//점수등록
	public boolean register(String sno,String ekor,String emath,String eeng,String ehist ) {
		try {
			String sql="insert into exam_tbl_03 values (?,?,?,?,?)";
			ps= conn.prepareStatement(sql);
			ps.setString(1, sno);
			ps.setString(2, ekor);
			ps.setString(3, emath);
			ps.setString(4,eeng);
			ps.setString(5,ehist);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {System.out.println("점수등록함수오류> "+e);}
		return false;
	}

}//c
