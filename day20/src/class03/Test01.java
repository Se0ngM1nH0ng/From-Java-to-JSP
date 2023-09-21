package class03;

import java.util.Iterator;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Test01 {
	public static void main(String[] args) {

		// 1. �� ������ �ڵ� java�� �������� 

		final String url = "https://www.genie.co.kr/chart/top200";
		// a) �ش� url�� �������ڵ带  �޾ƿ��� ����, �������(��Ʈ��) �� open
		//		connect() �ؾ��Ѵٰ� �����

		Connection conn = Jsoup.connect(url);



		// b) connect()�� ���������� ����Ǿ��ٸ�, get()(getter)�� ���Ͽ� 
		// 	  �ش� �������� �ڵ带 �޾ƿ�
		Document doc = null;

		try {
			doc = conn.get();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		// 2. ������ ��ũ���� �Ϸ� !




		// 3. ������ �ڵ带 �м�
		// a) DOM ������ �м�<-�갡 ��ũ�� ���� �Ǿ��־ �±׷� �м�
		//   <></> �±� (���,element) ������ �м�
		// 	 �Ӽ�(property)�� ������ ������, 
		// 	  �м��Ҷ��� ���� ��ǥ������ Ȱ��Ǵ� �Ӽ��� 
		//  	id(������ ���), class(�������� �������� ���� ��ҵ�) 
		//  �ΰ�� �����ؼ� id�ΰ� ,,,, class �� ������ 
		Elements elems = doc.select("a.artist");
		Elements elems2 = doc.select("a.title");
		// �±׸�#id��			
		// �±׸�.class��
		// �����±׸� > �����±׸�
		//   => �� �������� �Ľ� 


		////////////////////////////////////////////////�Ľ��� ���� ��ҵ��� ������ ���� 



		//4. �м��Ͽ� ���� �Ϸ��� �����͸� console ȭ�鿡 ���
		// Iterator ���ͷ����� // �÷����̶� utill java���� �ް� 
		// Element �� Jsoup���� �޾ƿ´�.
		// �Ŵ��� �÷���(elems)�� �ִ� �����͸� ���� ������ �÷������� ���� ������ �� �ֵ��� ���ִ� �÷���

		Iterator<Element> itr = elems.iterator();
		Iterator<Element> itr2 = elems2.iterator();
		// itr�� hasNext(),next()
		//				   ���� ��Ұ� �־�?,�׷� ������(==����,<���׸�>�� �ش��ϴ� �ڷ���)������~


		int i = 0;

		String str1 = " ";
		String str2 = " ";

		
		while(itr.hasNext()) {
			str1 = itr.next().text();
			//System.out.println(str1);
			
		}
		
		while(itr2.hasNext()) {
			str2 = itr2.next().text();
			//System.out.println(str2);
			
		}
		
		// 5. �����͸� ����

	}
}

