package class03;

import java.util.Iterator;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Test01 {
	public static void main(String[] args) {

		// 1. 웹 페이지 코드 java로 가져오기 

		final String url = "https://www.genie.co.kr/chart/top200";
		// a) 해당 url의 페이지코드를  받아오기 위해, 연결통로(스트림) 를 open
		//		connect() 해야한다고 얘기함

		Connection conn = Jsoup.connect(url);



		// b) connect()가 정상적으로 수행되었다면, get()(getter)을 통하여 
		// 	  해당 페이지의 코드를 받아옴
		Document doc = null;

		try {
			doc = conn.get();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		// 2. 페이지 스크랩핑 완료 !




		// 3. 페이지 코드를 분석
		// a) DOM 문서를 분석<-얘가 마크업 언어로 되어있어서 태그로 분석
		//   <></> 태그 (요소,element) 단위로 분석
		// 	 속성(property)을 가질수 있으며, 
		// 	  분석할때에 가장 대표적으로 활용되는 속성이 
		//  	id(유일한 요소), class(여러개의 공통점을 가진 요소들) 
		//  로고는 유일해서 id로고 ,,,, class 는 여러개 
		Elements elems = doc.select("a.artist");
		Elements elems2 = doc.select("a.title");
		// 태그명#id명			
		// 태그명.class명
		// 상위태그명 > 하위태그명
		//   => 이 과정들이 파싱 


		////////////////////////////////////////////////파싱을 통해 요소들을 데려온 상태 



		//4. 분석하여 추출 완료한 데이터를 console 화면에 출력
		// Iterator 이터레이터 // 컬렉션이라 utill java에서 받고 
		// Element 는 Jsoup에서 받아온다.
		// 거대한 컬렉션(elems)에 있는 데이터를 작은 단위의 컬렉션으로 나눠 저장할 수 있도록 해주는 컬렉션

		Iterator<Element> itr = elems.iterator();
		Iterator<Element> itr2 = elems2.iterator();
		// itr는 hasNext(),next()
		//				   다음 요소가 있어?,그럼 다음거(==내거,<제네릭>에 해당하는 자료형)보여줘~


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
		
		// 5. 데이터를 가공

	}
}

