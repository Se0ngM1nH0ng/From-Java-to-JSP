package class01;

import java.sql.Connection; // �ڹٿ��� �⺻������ �Ǿ������� 
							// � ��Ű�� �ȿ� ������ �Ǽ� ����ǰ� �ִµ� �� ��Ű���� sql 
import java.sql.DriverManager; // ó�������� java. �ƴϸ� �ܺο��� �����°��̴�. 
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import class04.StudentVO;

public class Test01 {

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
			Class.forName(driverName_MySQL); // �� �޼��� ��뿡�� �����͸� �ҷ��´�. // static �޼���
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
			conn=DriverManager.getConnection(url_MySQL, userName, passwd); // ����̹� static �޼��� 
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
		
		
		
		/// ---------- VIEW ����
		Scanner sc=new Scanner(System.in);
		System.out.println("�л��� �̸��� �Է��ϼ���.");
		String studentName=sc.next();
		System.out.println("�л��� ������ �Է��ϼ���.");
		int studentScore=sc.nextInt();
		/// ---------- VIEW ��
		
		
		/// ---------- CONTROLLER ����
		// CTRL ���� : "M�� DAO�� CRUD �޼����� ���ڴ� VO�ε� ,,, ���� VO�� �ָ� ������ ���� ..."
		StudentVO sVO = new StudentVO(0,studentName,studentScore);
		/// ---------- CONTROLLER ��
		
		
		/// ---------- MODEL ����
//		final String sql_INSERT="INSERT INTO STUDENT (NAME,SCORE) VALUES('"+studentName+"',"+studentScore+");";
		final String sql_INSERT="INSERT INTO STUDENT (NAME,SCORE) VALUES('"+sVO.getName()+"',"+sVO.getScore()+");";
		
		// ���� WHERE �� �ڿ��� PK�� ���� ���� �������� 
		
		
		try {
			stmt=conn.createStatement(); // ����� // statement �� read,write�� �������ִ� �� 
			stmt.executeUpdate(sql_INSERT); // ���
			// Query -> SELECT // ���̺� ������ �ִ� ������ 
			// Update -> INSERT,UPDATE,DELETE // ���̺� ������ ���� �ʴ� ������
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}



		// 4. DB�� �������� �� (��ǻ�Ͱ� �޸𸮸� ��� ��� ��ƸԾ ���ڱ� ������. �ݵ�� ���������� ���ش�. )
		try {
			stmt.close(); // ����� �������� �� ���� ���� �� ������ �׷��� 
			conn.close(); // �ݰ� �ٽ� �ݰ� ���;� �� 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(" �α�: ���α׷� ����");




	}

}
