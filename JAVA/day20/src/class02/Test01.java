package class02;



import java.util.Iterator;

import org.jsoup.Connection;
import org.jsoup.Jsoup; // org�� ���⼭ �����ϴ°Ŷ� org��� ���� 
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;



// �� ũ�Ѹ�
public class Test01 {
	public static void main(String[] args) {

		// 1. �� ������ �ڵ带 JAVA�� ��������

		final String url="https://www.melon.com/";
		// a) �ش� url�� �������ڵ带  �޾ƿ��� ����, �������(��Ʈ��) �� open
		//		connect() �ؾ��Ѵٰ� �����
		Connection conn =  Jsoup.connect(url); // Jsoup�̶�°��� ���


		// b) connect()�� ���������� ����Ǿ��ٸ�, get()(getter)�� ���Ͽ� 
		// 	  �ش� �������� �ڵ带 �޾ƿ�
		Document doc = null;
		try {
			doc = conn.get();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(doc);
		// 2. ������ ��ũ���� �Ϸ� ...!

		

		// Scanner, Random, ArrayList,... -> JAVA���� �⺻������ �����ϴ� Ŭ���� ����
		// Jsoup -> JAVA ���� �⺻ ���� xxx




		// 3. ������ �ڵ带 �м�
		// a) DOM ������ �м�<-�갡 ��ũ�� ���� �Ǿ��־ �±׷� �м�
		//   <></> �±� (���,element) ������ �м�
		// 	 �Ӽ�(property)�� ������ ������, 
		// 	  �м��Ҷ��� ���� ��ǥ������ Ȱ��Ǵ� �Ӽ��� 
		//  	id(������ ���), class(�������� �������� ���� ��ҵ�) 
		//  �ΰ�� �����ؼ� id�ΰ� ,,,, class �� ������ 
		
		Elements elems = doc.select("a.ellipsis");
		// �±׸�#id��						�������� Ŭ������ �̰��� > �������� �ؽ�Ʈ�� �����ͺ���
		// �±׸�.class��
		// �����±׸� > �����±׸�
		//   => �� �������� �Ľ� 
		
		//////////////////////////////////////////////// �Ľ��� ���� ��ҵ��� ������ ���� 
		
		
		//4. �м��Ͽ� ���� �Ϸ��� �����͸� console ȭ�鿡 ���
		
		// Iterator ���ͷ����� // �÷����̶� utill java���� �ް� 
		// Element �� Jsoup���� �޾ƿ´�.
		// �Ŵ��� �÷���(elems)�� �ִ� �����͸� ���� ������ �÷������� ���� ������ �� �ֵ��� ���ִ� �÷���
		
//		 Iterator<Element> itr=elems.iterator();
//	      // itr�� hasNext(),next()
//		  // ���� ��Ұ� �־�?,�׷� ������(==����,<���׸�>�� �ش��ϴ� �ڷ���)������~
//	      while(itr.hasNext()) {
//	         String str = itr.next().toString(); // ������ ������ 
//	         System.out.println(str);
//	      }
		
		
	      // 5. �����͸� ����
	         int index=str.indexOf(">"); // �� �ڸ� ��ġ
	         str=str.substring(index+1); // �� �ڸ�
	         index=str.indexOf("<"); // �� �ڸ� ��ġ
	         str=str.substring(0, index);
	         System.out.println(str);
	      


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		














	}
}
