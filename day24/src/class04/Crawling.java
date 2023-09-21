package class04;

import java.util.ArrayList;
import java.util.Iterator;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawling {
	public static ArrayList<MusicVO> sample() {
		final String url = "https://www.melon.com/chart/";

		Connection conn = Jsoup.connect(url);

		Document doc = null;

		try {
			doc = conn.get();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		Elements elems3 = doc.select("div.ellipsis.rank01 > span > a");
		Elements elems4 = doc.select("div.ellipsis.rank02 > span");

		Iterator<Element> itr = elems3.iterator();
		Iterator<Element> itr2 = elems4.iterator();
		// 스코프 이슈 
		// 지역변수로 쓰일뻔한 변수를 밖에서 선언해준다.
		String title=" ";
		String singer=" ";
		ArrayList<MusicVO> mdatas= new ArrayList<MusicVO>();
		

		while(itr.hasNext()&&itr2.hasNext()) {
			
				title= itr.next().text();
				singer= itr2.next().text();
				System.out.println(title +" / "+singer);
				mdatas.add(new MusicVO(0,title,singer));
			
		}
		return mdatas;
	}
}





