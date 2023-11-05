package class08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Test02 {
	public static void main(String[] args) {

		ArrayList<MovieVO> mdatas=Test01.sample();
		//////////////////////////////////////////////////

		final String driverName_MySQL="com.mysql.cj.jdbc.Driver";
		//final String driverName_Oracle="oracle.jdbc.driver.OracleDriver";
		// �������� ����
		try {
			Class.forName(driverName_MySQL);
			// Ŭ������,����̹���
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 2. DB�� ����
		//  : Connection ��ü�� �ʿ��ϴ�!
		final String url_MySQL="jdbc:mysql://localhost/kim";
		//final String url_Oracle="jdbc:oracle:thin:@localhost:1521:xe";
		final String userName="root";
		final String passwd="1234";
		Connection conn=null;
		try {
			conn=DriverManager.getConnection(url_MySQL, userName, passwd);
			// conn ��ü�� DB���� ������� ����!
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 3. DB�� �����͸� �ۼ��ϰų�(write),
		//    DB�� �����͸� �޾ƿ��ų�(read) �� �� ����
		//  : Statement ��ü�� �����ϰ�, ����ϴ°��� ��ǥ!
		Statement stmt=null;


		for(MovieVO v:mdatas) {

	
			final String sql_INSERT="INSERT INTO MOVIE (NAME,ODATE) VALUES('"+v.getName()+"','"+v.getOdate()+"');";

			try {
				stmt=conn.createStatement();
				stmt.executeUpdate(sql_INSERT);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

		}


		//////////////////////////////////////////////////




		ResultSet rs=null;
		final String sql_SELECTALL="SELECT NUM,NAME,ODATE FROM MOVIE;";
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql_SELECTALL);

			while(rs.next()) {
				// --- CTRL ����
				MovieVO mVO=new MovieVO(rs.getInt("NUM"),rs.getString("NAME"),rs.getString("ODATE"));
				// --- CTRL ��

				// --- VIEW ����
				System.out.println(mVO);
				System.out.println();
				// --- VIEW ��
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		try {
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		System.out.println(" �α�: ���α׷� ����");





	}
}
