package class04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test04 {

	public static void main(String[] args) {

		// 4. ���� �����ϱ� 
		
		final String path="C:\\\\HONG\\\\resource\\\\";
		final String fileName="¯��.jpg";
		final String fileCopy="¯�� - ���纻.jpg";
		
		try {
			
			FileInputStream fis=new FileInputStream(path+fileName);
			FileOutputStream fos=new FileOutputStream(path+fileCopy);
			
			int data;
			byte[] buff=new byte[10000];
			while((data=fis.read(buff))!=-1) {
				// 0 ���� data ���� ��ŭ ���۹迭�� Ǯ��
				/////System.out.println("Ȯ��");
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
			System.out.println("���� �ǽ� �Ϸ�!");
		}
		
		
		
		
	}
}

