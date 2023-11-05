package class04;

import java.io.File; // �ü��(��ǻ��)�� �ڹٶ� ��ȭ�� ��ų ����
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
// ���ݱ����� �ܼ��̶� �ڹٶ� ��ȭ ��Ŵ 

public class Test01 {

	public static void main(String[] args) {

		// 1. ���� �����ϱ� // �⺻�����ڰ� ���� // �츮�� ��θ� �ۼ������ �Ѵ�.
		File file = new File("C:\\HONG\\resource\\test.txt"); // ���� �⺻ �����ڰ� ����
		// ���Ͽ��Դ� default �����ڰ� ����
		// �ش������� �������� ������, �ϳ� ���� �������ش� ! <- �̷���
		try {
			file.createNewFile();
		} catch (IOException e) { // IO �� ���õȰ��� �׻� try catch�� ����� �Ѵ�.
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("���� ��ü���� �Ϸ� !");
		}

		// 2. ���� �о����
		try {
			FileInputStream fis = new FileInputStream("C:\\HONG\\resource\\test.txt");
			// FileInputStream fis = new FileInputStream(file);

			// ���� ����� ����� ��� �о�;ߵǴ��� ���� ���� while
			int data; // �갡 ��ȯ�� int �� �ϴ� �ٶ���
			while ((data = fis.read()) != -1) {
				// �о�� �����Ͱ� -1 �̸� "�� �о���."
				// c���� ������ ������ end of file�̶� �ϴµ�
				// �ڹٴ� int �� -1�̸� �� �о��ٰ� ǥ���Ѵ�
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
			System.out.println("fis��ü�� ���� �о���� �۾� �Ϸ�!");
		}

		// 3. ���� �ۼ��ϱ�
		try {
			FileOutputStream fos = new FileOutputStream("C:\\HONG\\resource\\test.txt", true);
			// �����ڿ� �ۼ��� ������ �������� ������ ���� ���� ���ְ�
			// ������ �����ϸ� !!! ���� ���� !!! �ȴ�.
			// ������ �����Ҷ� �̾�� �ϰ� ������ ? (, true) �ι�° ���ڿ� true�� ���� �ȴ�.

			// ��װ� ���ڷ� �����ϴ°� �ƴ϶� ������ �����Ѵ�.
			fos.write(65); // 'A'
			fos.write(97); // 'a' -> �ƽ�Ű �ڵ�

			// �ڡڡڡڡڡڡ�
			// OS�� �����ϴ� ��θ� ���� �ݾ����� ������ ���� ����� ������ �߻��� ���� �ִ�.
			fos.flush();
			fos.close();
			// �ȴݾ����� ������ ����� �ֵ� ! �� �ݾ������
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("fos��ü�� ���� �ۼ��ϱ� �۾� �Ϸ�!");
		}

	}

}
 