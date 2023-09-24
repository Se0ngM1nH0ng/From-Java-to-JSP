package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import test.MailSender;

public class MemberDAO {
	final String sql_insert = "INSERT INTO MEMBER (MID,MPW,NAME,EMAIL) VALUES(?, ?, ?, ?)";
	final String sql_selectONE = "SELECT MID, MPW, NAME, EMAIL FROM MEMBER WHERE MID = ? AND MPW= ?";
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	private ArrayList<MemberVO> datas;
	public MemberDAO() {
		datas=new ArrayList<MemberVO>();
		datas.add(new MemberVO("admin","1234","류준태","lyu41896849@gmail.com"));
		datas.add(new MemberVO("test","1234","테스트","vbn5623@naver.com"));
	}

	public ArrayList<MemberVO> selectAll(MemberVO mVO){
		return null;
	}
	public MemberVO selectOne(MemberVO mVO) {

		MemberVO mdata = null;

		conn = JDBCUtil.connect();

		try {
			pstmt = conn.prepareStatement(sql_selectONE); // 로그인
			pstmt.setString(1, mVO.getMid());
			pstmt.setString(2, mVO.getMpw());
			
			rs = pstmt.executeQuery();
			if (rs.next()) {
				mdata = new MemberVO(rs.getString("MID"), rs.getString("MPW"), rs.getString("NAME"),rs.getString("EMAIL"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		JDBCUtil.disconnect(rs, pstmt, conn);

		return mdata;
	}
	public boolean insert(MemberVO mVO) {

		conn = JDBCUtil.connect();
		try {
			pstmt = conn.prepareStatement(sql_insert);

			pstmt.setString(1, mVO.getMid());
			pstmt.setString(2, mVO.getMpw());
			pstmt.setString(3, mVO.getName());
			pstmt.setString(4, mVO.getEmail());
			pstmt.executeUpdate();

		}catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		MailSender.mailSender(mVO);
		JDBCUtil.disconnect(pstmt, conn);
		return true;

	}
	public boolean delete(MemberVO mVO){
		return false;
	}
	public boolean update(MemberVO mVO){
		return false;
	}
}
