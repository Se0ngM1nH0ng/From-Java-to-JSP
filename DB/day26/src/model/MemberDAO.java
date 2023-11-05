package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
	static final String sql_insert="INSERT INTO MEMBER (MID,MPW) VALUES(?,?)";
	static final String sql_update_MPW="UPDATE MEMBER SET MPW=? WHERE MID=?";
	static final String sql_update_TOTAL="UPDATE MEMBER SET TOTAL=TOTAL+? WHERE MID=?";
	static final String sql_delete="DELETE FROM MEMBER WHERE MID=?";
	static final String sql_selectOne="SELECT MID,MPW,TOTAL FROM MEMBER WHERE MID=? AND MPW=?";
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	// ȸ������
	public boolean insert(MemberVO mVO) {

		conn=JDBCUtil.connect();
		try {
			pstmt=conn.prepareStatement(sql_insert);
			pstmt.setString(1, mVO.getMid()); // �̰��� [1]�� ������!!!!! // �迭�� [0]��° �����ε� 
			pstmt.setString(2, mVO.getMpw()); // String ���� int���� Ÿ�� �����ֱ� 
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			return false;
		}
		JDBCUtil.disconnect(pstmt, conn);
		return true;
	}
	// ��ǰ����
	// �������
	public boolean update(MemberVO mVO) {

		conn=JDBCUtil.connect();
		try {
			if(mVO.getAction().equals("�������")) {
				pstmt=conn.prepareStatement(sql_update_MPW);	
				pstmt.setString(1, mVO.getTmpMpw());
				pstmt.setString(2, mVO.getMid());
			}
			else if(mVO.getAction().equals("��Ż����")) {
				pstmt=conn.prepareStatement(sql_update_TOTAL);
				pstmt.setInt(1, mVO.getTmpPrice()); //Ÿ�� �����ֱ� //total�� TmpPrice��ŭ �������ֱ� 
				pstmt.setString(2, mVO.getMid());
			}
			int result=pstmt.executeUpdate();
			if(result<=0) {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			return false;
		}
		JDBCUtil.disconnect(pstmt, conn);
		return true;
	}
	// ȸ��Ż��
	public boolean delete(MemberVO mVO) {

		conn=JDBCUtil.connect();
		try {
			pstmt=conn.prepareStatement(sql_delete);
			pstmt.setString(1, mVO.getMid());
			int result=pstmt.executeUpdate();
			if(result<=0) {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			return false;
		}
		JDBCUtil.disconnect(pstmt, conn);
		return true;
	}

	private ArrayList<MemberVO> selectAll(MemberVO mVO){
		return null;
	}
	// �α���
	public MemberVO selectOne(MemberVO mVO){
		

		MemberVO mdata=null;

		conn=JDBCUtil.connect();
		try {
			pstmt=conn.prepareStatement(sql_selectOne);
			pstmt.setString(1, mVO.getMid());
			pstmt.setString(2, mVO.getMpw());
			rs=pstmt.executeQuery();

			if(rs.next()) {
				mdata=new MemberVO(rs.getString("MID"),rs.getString("MPW"),rs.getInt("TOTAL"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
		JDBCUtil.disconnect(pstmt, conn);

		return mdata;
	}
}
