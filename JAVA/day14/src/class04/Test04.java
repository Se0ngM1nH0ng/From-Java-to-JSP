package class04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test04 {

	public static void main(String[] args) {

		// 4. 사진 복사하기 
		
		final String path="C:\\\\HONG\\\\resource\\\\";
		final String fileName="짱구.jpg";
		final String fileCopy="짱구 - 복사본.jpg";
		
		try {
			
			FileInputStream fis=new FileInputStream(path+fileName);
			FileOutputStream fos=new FileOutputStream(path+fileCopy);
			
			int data;
			byte[] buff=new byte[10000];
			while((data=fis.read(buff))!=-1) {
				// 0 부터 data 까지 만큼 버퍼배열로 풀어
				/////System.out.println("확인");
				fos.write(buff, 0, data);
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
			System.out.println("사진 실습 완료!");
		}
		
		
		
		
	}
}

