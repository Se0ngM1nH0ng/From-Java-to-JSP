package model;


// c �� �ۼ�
// r �� ��Ϻ���
// (r �� 1�� �����ϱ�)
// u �� �����ϱ� 
// d �� �����ϱ� 


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BoardDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	static final private String SQL_SELECTALL="SELECT * FROM BOARD";
	static final private String SQL_SELECTONE="SELECT * FROM BOARD WHERE BID=?";
	static final private String SQL_INSERT="INSERT INTO BOARD (MID,BCONTENT,DATE) VALUES(?,?,NOW())";
	static final private String SQL_UPDATE="UPDATE BOARD SET BCONTENT=?,FAVCNT=?,REPLYCNT=? WHERE BID=?";
	static final private String SQL_DELETE="DELETE FROM BOARD WHERE BID=?";

	public ArrayList<BoardVO> selectAll(BoardVO bVO){ // r �� ��Ϻ���
		conn=JDBCUtil.connect();

		ArrayList<BoardVO> datas=new ArrayList<BoardVO>();

		try {
			pstmt=conn.prepareStatement(SQL_SELECTALL);
			rs=pstmt.executeQuery();

			while(rs.next()) {
				BoardVO data=new BoardVO();
				data.setBid(rs.getInt("BID"));
				data.setMid(rs.getString("MID"));
				data.setBcontent(rs.getString("BCONTENT"));
				data.setFavcnt(rs.getInt("FAVCNT"));
				data.setReplycnt(rs.getInt("REPLYCNT"));
				data.setDate(rs.getDate("DATE"));
				datas.add(data);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		JDBCUtil.disconnect(rs, pstmt, conn);

		return datas;
	}
	public BoardVO selectOne(BoardVO bVO){
		conn=JDBCUtil.connect();

		BoardVO data=null;

		try {
			pstmt=conn.prepareStatement(SQL_SELECTONE);
			pstmt.setInt(1, bVO.getBid());
			rs=pstmt.executeQuery();

			if(rs.next()) {
				data=new BoardVO();
				data.setBid(rs.getInt("BID"));
				data.setMid(rs.getString("MID"));
				data.setBcontent(rs.getString("BCONTENT"));
				data.setFavcnt(rs.getInt("FAVCNT"));
				data.setReplycnt(rs.getInt("REPLYCNT"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		JDBCUtil.disconnect(rs, pstmt, conn);

		return data;
	}

	public boolean insert(BoardVO bVO) {
		conn=JDBCUtil.connect();
		try {
			pstmt=conn.prepareStatement(SQL_INSERT);
			pstmt.setString(1, bVO.getMid());
			pstmt.setString(2, bVO.getBcontent());
			
			int rs=pstmt.executeUpdate();
			if(rs<=0) {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

		JDBCUtil.disconnect(pstmt, conn);

		return true;
	}
	public boolean update(BoardVO bVO) {
		conn=JDBCUtil.connect();
		try {
			pstmt=conn.prepareStatement(SQL_UPDATE);
			pstmt.setString(1, bVO.getBcontent());
			pstmt.setInt(2, bVO.getFavcnt());
			pstmt.setInt(3, bVO.getReplycnt());
			pstmt.setInt(4, bVO.getBid());

			int rs=pstmt.executeUpdate();
			if(rs<=0) {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

		JDBCUtil.disconnect(pstmt, conn);

		return true;
	}
	public boolean delete(BoardVO bVO) {
		conn=JDBCUtil.connect();

		try {
			pstmt=conn.prepareStatement(SQL_DELETE);
			pstmt.setInt(1, bVO.getBid());
			int rs=pstmt.executeUpdate();
			if(rs<=0) {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

		JDBCUtil.disconnect(pstmt, conn);

		return true;
	}
}


