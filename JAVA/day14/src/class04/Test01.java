package class04;

import java.io.File; // 운영체제(컴퓨터)랑 자바랑 대화를 시킬 예정
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
// 지금까지는 콘솔이랑 자바랑 대화 시킴 

public class Test01 {

	public static void main(String[] args) {

		// 1. 파일 생성하기 // 기본생성자가 없다 // 우리가 경로를 작성해줘야 한다.
		File file = new File("C:\\HONG\\resource\\test.txt"); // 파일 기본 생성자가 없어
		// 파일에게는 default 생성자가 없다
		// 해당파일이 존재하지 않으면, 하나 새로 생성해준다 ! <- 이런뜻
		try {
			file.createNewFile();
		} catch (IOException e) { // IO 랑 관련된것은 항상 try catch를 해줘야 한다.
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("파일 객체생성 완료 !");
		}

		// 2. 파일 읽어오기
		try {
			FileInputStream fis = new FileInputStream("C:\\HONG\\resource\\test.txt");
			// FileInputStream fis = new FileInputStream(file);

			// 내가 뭐라고 썼는지 몇번 읽어와야되는지 뭔지 몰라 while
			int data; // 얘가 반환을 int 로 하는 바람에
			while ((data = fis.read()) != -1) {
				// 읽어온 데이터가 -1 이면 "다 읽었다."
				// c언어는 마지막 끝나면 end of file이라 하는데
				// 자바는 int 라서 -1이면 다 읽었다고 표현한다
				System.out.println((char) data);
			}
			System.out.println();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("fis객체로 파일 읽어오기 작업 완료!");
		}

		// 3. 파일 작성하기
		try {
			FileOutputStream fos = new FileOutputStream("C:\\HONG\\resource\\test.txt", true);
			// 생성자에 작성한 파일이 존재하지 않으면 새로 생성 해주고
			// 파일이 존재하면 !!! 덮어 쓰기 !!! 된다.
			// 파일이 존재할때 이어쓰기 하고 싶으면 ? (, true) 두번째 인자에 true를 쓰면 된다.

			// 얘네가 문자로 소통하는게 아니라 정수로 소통한다.
			fos.write(65); // 'A'
			fos.write(97); // 'a' -> 아스키 코드

			// ★★★★★★★
			// OS와 소통하던 통로를 직접 닫아주지 않으면 다음 수행시 문제가 발생할 수도 있다.
			fos.flush();
			fos.close();
			// 안닫았을시 문제가 생기는 애들 ! 꼭 닫아줘야함
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("fos객체로 파일 작성하기 작업 완료!");
		}

	}

}
 