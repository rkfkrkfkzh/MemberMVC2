package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDao {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public void con() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 占쏙옙占쏙옙譴占� 占싸듸옙
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@db202110262237_high?TNS_ADMIN=/Users/imhyojin/Wallet_DB202110262237", "ADMIN",
					"Dkfdktek36270113"); // connection占쏙옙체占쏙옙占쏙옙
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void discon() { // close占쌨쇽옙占쏙옙 insert,update占쏙옙 占쏙옙占쏙옙玖占� 호占쏙옙
		try {
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public MemberVO findMember(String id) throws SQLException {
		return null;
	}

	public void insertMember(MemberVO vo) throws SQLException {

	}

	public boolean isExist(String id) throws SQLException {
		return false;
	}

	public MemberVO login(String id, String password) throws SQLException {
		return null;
	}

	public void updateMember(MemberVO vo) throws SQLException {

	}

	public ArrayList<MemberVO> getAllMemList() throws SQLException {
		return null;
	}

}
