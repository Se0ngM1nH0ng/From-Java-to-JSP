package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



// JDBC�� ���õ� 1,2 => connect()
// 4. �ڵ带 "���ȭ" => disconnect()
// -> ������ Ŭ������ ĸ��ȭ �ϴ°��� �� ������ !

//  ������ ������ ���ȭ �� Ŭ������ �θ��¸�  == Util Ŭ���� 

public class MovieDAO {

	private Connection conn;
	private Statement stmt;
	private ResultSet rs;

	// Q. �迭����Ʈ�� �޾ƿ��µ�,
	// insert()�� �׷� 1���ϳ���?
	// A. NO! insert()�� �迭����Ʈ.size()��ŭ for��(�ݺ�) �����ϴ�!
	public boolean insert(MovieVO mVO) {
		conn=JDBCUtil.connect();

		final String sql_INSERT="INSERT INTO MOVIE (NAME,ODATE) VALUES('"+mVO.getName()+"','"+mVO.getOdate()+"');";
		try {
			stmt=conn.createStatement();
			int result=stmt.executeUpdate(sql_INSERT);
			// Query -> SELECT
			// Update -> INSERT,UPDATE,DELETE

			if(result<=0) {
				// ����� row�� ����!
				return false;
			}

		} catch (SQLException e1) {
			e1.printStackTrace();
			return false;
		} finally {
			JDBCUtil.disconnect(stmt, conn);
		}


		return true;
	}

	public boolean update(MovieVO mVO) {
		conn=JDBCUtil.connect();

		String sql_UPDATE="UPDATE MOVIE SET NAME='"+mVO.getName()+"' WHERE NUM="+mVO.getNum()+";";

		try {
			stmt=conn.createStatement(); // ����� // statement �� read,write�� �������ִ� �� 
			int result=stmt.executeUpdate(sql_UPDATE);
			// Query -> SELECT
			// Update -> INSERT,UPDATE,DELETE

			if(result<=0) {
				// ����� row�� ����!
				return false;
			}

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return false;
		}
		finally {
			JDBCUtil.disconnect(stmt, conn);
		}

		return true;
	}
	public boolean delete(MovieVO mVO) {
		conn=JDBCUtil.connect();

		String sql_DELETE="DELETE FROM MOVIE WHERE NUM="+mVO.getNum()+";";

		try {
			stmt=conn.createStatement(); // ����� // statement �� read,write�� �������ִ� �� 
			int result=stmt.executeUpdate(sql_DELETE);
			// Query -> SELECT
			// Update -> INSERT,UPDATE,DELETE

			if(result<=0) {
				// ����� row�� ����!
				return false;
			}

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		finally {
			JDBCUtil.disconnect(stmt, conn);
		}

		return true;
	}

	public ArrayList<MovieVO> selectAll(MovieVO mVO) {
		conn=JDBCUtil.connect();

		final String sql_SELECTALL="SELECT NUM,NAME,ODATE FROM MOVIE WHERE NAME LIKE '%"+mVO.getName()+"%';";
		ArrayList<MovieVO> mdatas=new ArrayList<MovieVO>();
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql_SELECTALL);
			// Query -> SELECT
			// Update -> INSERT,UPDATE,DELETE

			while(rs.next()) {
				int num=rs.getInt("NUM");
				String name=rs.getString("NAME");
				String odate=rs.getString("ODATE");
				MovieVO mdata=new MovieVO(num,name,odate);
				mdatas.add(mdata);
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
			return null;
		} finally {
			JDBCUtil.disconnect(rs, stmt, conn);
		}

		return mdatas;
	}
	public MovieVO selectOne(MovieVO mVO) {
		conn=JDBCUtil.connect();

		final String sql_SELECTONE="SELECT NUM,NAME,ODATE FROM MOVIE WHERE NUM="+mVO.getNum()+";";
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql_SELECTONE);
			// Query -> SELECT
			// Update -> INSERT,UPDATE,DELETE

			if(rs.next()) {
				int num=rs.getInt("NUM");
				String name=rs.getString("NAME");
				String odate=rs.getString("ODATE");
				MovieVO mdata=new MovieVO(num,name,odate);
				return mdata;
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
			return null;
		} finally {
			JDBCUtil.disconnect(rs, stmt, conn);
		}
		
		return null;
	}


}