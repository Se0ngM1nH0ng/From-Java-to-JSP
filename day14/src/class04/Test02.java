package class04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {

	public static void main(String[] args) {

		// 1. 파일 생성하기
		File file = new File("C:\\HONG\\resource\\test.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("파일 객체생성 완료!");
		}

		// 2. 파일 읽어오기
		String a = "";

		try {
			FileInputStream fis = new FileInputStream("C:\\HONG\\resource\\test01.txt");

			int data;
			try {
				while ((data = fis.read()) != -1) {
					System.out.print((char) data);
					if (data % 2 == 1) {
						a = "홀";
					} else {
						a = "짝";
					}
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			System.out.println();
			System.out.println("입력하신 수는 " + a + "수 입니다.");
		}

		
		// 1. 파일 생성하기
		File file2 = new File("C:\\HONG\\resource\\test02.txt");
		try {
			file2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("파일 객체 생성 완료 !");
		}

		// 3. 파일 작성하기
		try {
			FileOutputStream fos = new FileOutputStream("C:\\HONG\\resource\\test02.txt");

			int result = 0;
			for (int i = 97; i <= 122; i++) {
				result = i;
				fos.write((char) result);
			}

			fos.flush();
			fos.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("fos객체로 파일 작성하기 작업 완료 !");
		}

	}

}
