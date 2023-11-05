package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import test.MailSender;

public class EmailDAO {
	final String sql_insert = "INSERT INTO EMAIL (TITLE,CONTENT,RECEIVER) VALUES(?, ?, ?)";
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	public boolean insert(EmailVO eVO) {

		conn = JDBCUtil.connect();
		try {
			pstmt = conn.prepareStatement(sql_insert);

			pstmt.setString(1, eVO.getTitle());
			pstmt.setString(2, eVO.getContent());
			pstmt.setString(3, eVO.getReceiver());
			pstmt.executeUpdate();

		}catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		MailSender.mailSender(eVO);
		JDBCUtil.disconnect(pstmt, conn);
		return true;

	}
	
	
}
