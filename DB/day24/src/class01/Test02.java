package class01;

import java.sql.Connection; // �ڹٿ��� �⺻������ �Ǿ������� 
// � ��Ű�� �ȿ� ������ �Ǽ� ����ǰ� �ִµ� �� ��Ű���� sql 
import java.sql.DriverManager; // ó�������� java. �ƴϸ� �ܺο��� �����°��̴�. 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import class04.StudentVO;

public class Test02 {

	public static void main(String[] args) {

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
		final String url_MySQL="jdbc:mysql://localhost/hong"; // ������ ���� ���̺�� ����
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


		
		// �о��
		Statement stmt=null;
		// ��� ��Ʈ�ѷ��� insert�� ���� �־��� ģ���� ��� �� 


		
		 ResultSet rs=null;
	     final String sql_SELECTALL="SELECT NUM,NAME,SCORE FROM STUDENT;";


		// ���� WHERE �� �ڿ��� PK�� ���� ���� �������� 

		// �������� �޾ƿð��־ ResultSet �� ��� �Ѵ� .
		// jsoup�� element ���� ģ�� 

		try {
			stmt=conn.createStatement(); // ����� // statement �� read,write�� �������ִ� �� 
			rs=stmt.executeQuery(sql_SELECTALL); // ���
			// Query -> SELECT // ���̺� ������ �ִ� ������ 
			// rs.get��¼���� �÷����� ���� �ȴ�. 

			
			// �信�� ������ while �ۿ��� ������ rs �ϳ��� ���ڷ� �ָ� �ǰ� 
			while(rs.next()) {
				// ���⼭ �並 ������ ���ڸ� ���� �����;� �Ѵ�. ����

				// ������� �並 ���⼭ ������
				// ---- ctrl ����
				 StudentVO sVO=new StudentVO(rs.getInt("NUM"),rs.getString("NAME"),rs.getInt("SCORE"));
				 //�� �л������� 
				// ---- ctrl ��

				// ---- VIEW ����
				//RS�� �� ���� �䰡 ������ ������ �ȵȴ� �װ��� ��Ʈ�ѷ��� �ؾߵȴ� . 
//				System.out.println(rs.getInt("NUM"));
//				System.out.println(rs.getString("NAME"));
//				System.out.println(rs.getInt("SCORE"));
				System.out.println(sVO);
				System.out.println();
			}

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}



		// 4. DB�� �������� �� (��ǻ�Ͱ� �޸𸮸� ��� ��� ��ƸԾ ���ڱ� ������. �ݵ�� ���������� ���ش�. )
		try {
			rs.close(); // �ֵ� �ݾ���� �� 
			stmt.close(); // ����� �������� �� ���� ���� �� ������ �׷��� 
			conn.close(); // �ݰ� �ٽ� �ݰ� ���;� �� 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(" �α�: ���α׷� ����");




	}

}
