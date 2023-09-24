package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StarDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	static final private String SQL_INSERT="INSERT INTO STAR (STARVALUE) VALUES(?)";

	public ArrayList<StarVO> selectAll(StarVO sVO){
		return null;
	}
	public StarVO selectOne(StarVO sVO){
		return sVO;
	}

	public boolean insert(StarVO sVO) {
		conn=JDBCUtil.connect();

		try {
			pstmt=conn.prepareStatement(SQL_INSERT);
			pstmt.setDouble(1, sVO.getStarvalue());
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
	public boolean update(StarVO sVO) {
		return false;
	}
	public boolean delete(StarVO sVO) {
		return false;
	}
}
