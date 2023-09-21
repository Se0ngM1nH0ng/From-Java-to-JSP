package class04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Test02 {

	public static void main(String[] args) {
//		ArrayList<MusicVO> datas=Crawling.sample(); // ���� ũ�Ѹ�
		// JDBC�� 4���� ����(����)
		
				// 1. JAVA�� DB�� �������� �ڿ�(resouce)�� ���� Ŭ����
				// (== ����̹� : ���� �ٸ� �ý���, ������� ���� ������ ���� �ʿ��� ��ü ) �� 
				// �޸𸮷� �ҷ��;��� == load(����)

				// ���������� ������ �ڵ带 ����� ���� ���� 
				final String driverName_MySQL = "com.mysql.cj.jdbc.Driver"; // �ҷ��� ģ���� �ݵ�� jar ����̹���  ������ �־�� �Ѵ�.
				// final String driverName_Oracle = "oracle.jdbc.driver.OracleDriver";
				// ��ܿ� ��ġ �ϴ°��� �� �������̴�. 
				// �� ����̹�



				try { // ����̹��� �޸𸮿� load �ߴ�.
					Class.forName(driverName_MySQL); // �� �޼��� ��뿡�� �����͸� �ҷ��´�.
					// �ҷ��� ģ���� �ݵ�� jar ����̹���  ������ �־�� �Ѵ�. 
					//Ŭ������, ����̹��� // new �� ���ص� class. ���� �ٷνἭ static �� �ٴ� �ٴ� ���� �˼� �ִ� .
					//MySQL�� ����̹� �� : com.mysql.jdbc.Driver
					//����Ŭ ����̹� �� : oracle.jdbc.driver.OracleDriver
				} catch (ClassNotFoundException e) { // �ʰ� �ҷ��� Ŭ������ ������ ���ܰ� �߻��ؾ��� 
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 


				// 2. DB�� ���� 
				// : Connection ��ü�� �ʿ��ϴ� !
				final String url_MySQL="jdbc:mysql://localhost/hong"; // ������ ���� �����ͺ��̽��� ����
				//final String url_Oracle="jdbc:oracle:thin:@localhost:1521:xe";
				final String userName="root";
				final String passwd="1234";
				Connection conn=null; // �� connection �� Ȯ���ϴ°� 

				try {
					//		DriverManager.getConnection(url, userName, passWord);
					conn=DriverManager.getConnection(url_MySQL, userName, passwd);
					// conn ��ü�� DB���� ������� ����!
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				// conn ��ü�� DB���� ������� ���� !
				// getConnection�� ���� 3���� 
				// 1. url(�����ͺ��̽��� ���������� ������ �� �ִ� ������ �Ѵ�.) ---> "jdbc:mysql://localhost/DB��" 
				// "jdbc:oracle:thin:@localhost:1521:xe" -> ����Ŭ url

				// 2. userName ---> "root"

				// 3. passWord ---> 1234 


				// 3. DB�� �����͸� �ۼ��ϰų�(write),
				//    DB�� �����͸� �޾ƿ��ų�(read) �Ҽ� ���� 
				// ----> Statement ��ü�� �����ϰ�, ����ϴ°��� ��ǥ !
				
				// �ۼ�
				
				
				Statement stmt=null;
				ResultSet rs=null;

				
				
				final String sql_SELECTALL="SELECT NUM,TITLE,SINGER FROM MUSIC;";
					
					try {
						stmt=conn.createStatement(); // ����� // statement �� read,write�� �������ִ� �� 
						rs=stmt.executeQuery(sql_SELECTALL); // ���
						// Query -> SELECT // ���̺� ������ �ִ� ������ 
						// Update -> INSERT,UPDATE,DELETE // ���̺� ������ ���� �ʴ� ������
						
						while(rs.next()) {
							
							System.out.print(rs.getInt("NUM")+".");
							System.out.print(rs.getString("TITLE")+" / ");
							System.out.println(rs.getString("SINGER"));
							System.out.println();
						}
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				



				// 4. DB�� �������� �� (��ǻ�Ͱ� �޸𸮸� ��� ��� ��ƸԾ ���ڱ� ������. �ݵ�� ���������� ���ش�. )
				try {
					rs.close();
					stmt.close(); // ����� �������� �� ���� ���� �� ������ �׷��� 
					conn.close(); // �ݰ� �ٽ� �ݰ� ���;� �� 
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println(" �α�: ���α׷� ����");

		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
