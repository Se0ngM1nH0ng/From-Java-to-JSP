package class04;

import java.util.Iterator;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Test01 {
	public static void main(String[] args) {
		final String url = "https://music.bugs.co.kr/chart";

		Connection conn = Jsoup.connect(url);

		Document doc = null;

		try {
			doc = conn.get();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		Elements elems3 = doc.select("th > p");
		Elements elems4 = doc.select("td > p");

		Iterator<Element> itr = elems3.iterator();
		Iterator<Element> itr2 = elems4.iterator();
		// 스코프 이슈 
		// 지역변수로 쓰일뻔한 변수를 밖에서 선언해준다.
		String str=" ";
		String str2=" ";



		while(itr.hasNext()&&itr2.hasNext()) {

			str= itr.next().text();
			str2= itr2.next().text();

			System.out.print(str);
			System.out.println(" - "+str2);

		}

	}
}





