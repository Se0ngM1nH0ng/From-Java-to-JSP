package class01;

import java.sql.Connection; // 자바에서 기본제공은 되어있으나 
// 어떤 패키지 안에 저장이 되서 실행되고 있는데 그 패키지가 sql 
import java.sql.DriverManager; // 처음시작이 java. 아니면 외부에서 가져온것이다. 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import class04.StudentVO;


public class Test04 {

	public static void main(String[] args) {

		// JDBC의 4가지 순서(국룰)

		// 1. JAVA와 DB를 연결해줄 자원(resouce)을 가진 클래스
		// (== 드라이버 : 서로 다른 시스템, 이종기기 간의 연결을 위해 필요한 객체 ) 를 
		// 메모리로 불러와야함 == load(적재)

		// 유지보수가 용이한 코드를 만들어 내기 위해 
		final String driverName_MySQL = "com.mysql.cj.jdbc.Driver"; // 불러올 친구가 반드시 jar 드라이버를  가지고 있어야 한다.
		// final String driverName_Oracle = "oracle.jdbc.driver.OracleDriver";
		// 상단에 배치 하는것이 더 보편적이다. 
		// 이 드라이버



		try { // 드라이버를 메모리에 load 했다.
			Class.forName(driverName_MySQL); // 요 메서드 사용에서 데이터를 불러온다.
			// 불러올 친구가 반드시 jar 드라이버를  가지고 있어야 한다. 
			//클래스명, 드라이버명 // new 를 안해도 class. 으로 바로써서 static 이 붙는 다는 것을 알수 있다 .
			//MySQL의 드라이버 명 : com.mysql.jdbc.Driver
			//오라클 드라이버 명 : oracle.jdbc.driver.OracleDriver
		} catch (ClassNotFoundException e) { // 너가 불러올 클래스가 없으면 예외가 발생해야지 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 


		// 2. DB와 연결 
		// : Connection 객체가 필요하다 !
		final String url_MySQL="jdbc:mysql://localhost/hong"; // 본인이 가진 테이블로 기입
		//final String url_Oracle="jdbc:oracle:thin:@localhost:1521:xe";
		final String userName="root";
		final String passwd="1234";
		Connection conn=null; // 이 connection 을 확보하는것 

		try {
			//		DriverManager.getConnection(url, userName, passWord);
			conn=DriverManager.getConnection(url_MySQL, userName, passwd);
			// conn 객체는 DB와의 연결통로 역할!
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// conn 객체는 DB와의 연결통로 역할 !
		// getConnection의 인자 3가지 
		// 1. url(데이터베이스에 직접적으로 연결할 수 있는 역할을 한다.) ---> "jdbc:mysql://localhost/DB명" 
		// "jdbc:oracle:thin:@localhost:1521:xe" -> 오라클 url

		// 2. userName ---> "root"

		// 3. passWord ---> 1234 




		// 3. DB에 데이터를 작성하거나(write),
		//    DB의 데이터를 받아오거나(read) 할수 있음 
		// ----> Statement 객체를 생성하고, 사용하는것이 목표 !

		// 읽어옴
		Statement stmt=null;
		// 뷰랑 컨트롤러는 insert를 위해 있었던 친구라 없어도 됨 

		ResultSet rs=null;
		// 먼저 SQL에서 되는지 조건을 생각 해보고, 조건절이나 구하려는 값에 대해서 생각해보고 넘어오기 
		// 하나만 받아올거야 // 아까처럼 전체를 받지말고 특정 지어서 무엇을 받아올건지 그거 하나만 조건절
		// 조건절 안에는  보통 PK 가 들어감  
		// 보통 WHERE 절 뒤에는 PK를 많이 쓴다 조건으로 

		// 쿼리류는 받아올게있어서 ResultSet 을 써야 한다 .
		// jsoup의 element 같은 친구 



		//// ---> 뷰 시작
		Scanner sc = new Scanner(System.in);

		try {
			while(true) {
				System.out.println("정수를 입력 해주세요 !");
				int num = sc.nextInt();


				if(num<1) { // 0 밑으로는 번호에 해당하지 않기 때문에 
					System.out.println("1 이상의 값만 넣어주세요.");	
					continue;
				}


		//// ---> 뷰 끝

				//// ---> CTRL 시작
				StudentVO sVO = new StudentVO(num,"",0);
				//// ---> CTRL 끝


				final String sql_SELECTONE="SELECT NUM,NAME,SCORE FROM STUDENT WHERE NUM=";
				try {
					stmt=conn.createStatement(); // 만들고 // statement 가 read,write를 제공해주는 것 
					rs=stmt.executeQuery(sql_SELECTONE+num+";");

					// while 은 무조건 selectall에만 사용 한다. 
					if(rs.next()) { // 데이터가 있어 ? 그러면 그거 보여줘 
						sVO = new StudentVO(rs.getInt("NUM"),rs.getString("NAME"),rs.getInt("SCORE"));
						System.out.println(sVO);
						break;
					}else { // 그게 아니면 다 없는 학생입니다 이런식으로 조건을 줘야함 
						System.out.println("없는 학생입니다.");
						continue;
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (Exception e1) {
			System.out.println("정수만 입력해주세요 ");
			e1.printStackTrace();
		}





		// 4. DB와 연결해제 ★ (컴퓨터가 메모리를 계속 계속 잡아먹어서 갑자기 꺼진다. 반드시 연결해제를 해준다. )
		try {
			rs.close(); // 애도 닫아줘야 함 
			stmt.close(); // 만든거 역순으로 문 열고 들어가서 또 문열고 그러면 
			conn.close(); // 닫고 다시 닫고 나와야 함 
			sc.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(" 로그: 프로그램 종료");






	}
}
