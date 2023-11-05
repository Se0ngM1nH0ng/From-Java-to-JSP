package class02;



import java.util.Iterator;

import org.jsoup.Connection;
import org.jsoup.Jsoup; // org는 저기서 제공하는거라서 org라고 나옴 
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;



// 웹 크롤링
public class Test01 {
	public static void main(String[] args) {

		// 1. 웹 페이지 코드를 JAVA로 가져오기

		final String url="https://www.melon.com/";
		// a) 해당 url의 페이지코드를  받아오기 위해, 연결통로(스트림) 를 open
		//		connect() 해야한다고 얘기함
		Connection conn =  Jsoup.connect(url); // Jsoup이라는것을 사용


		// b) connect()가 정상적으로 수행되었다면, get()(getter)을 통하여 
		// 	  해당 페이지의 코드를 받아옴
		Document doc = null;
		try {
			doc = conn.get();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(doc);
		// 2. 페이지 스크랩핑 완료 ...!

		

		// Scanner, Random, ArrayList,... -> JAVA에서 기본적으로 제공하는 클래스 였다
		// Jsoup -> JAVA 에서 기본 제공 xxx




		// 3. 페이지 코드를 분석
		// a) DOM 문서를 분석<-얘가 마크업 언어로 되어있어서 태그로 분석
		//   <></> 태그 (요소,element) 단위로 분석
		// 	 속성(property)을 가질수 있으며, 
		// 	  분석할때에 가장 대표적으로 활용되는 속성이 
		//  	id(유일한 요소), class(여러개의 공통점을 가진 요소들) 
		//  로고는 유일해서 id로고 ,,,, class 는 여러개 
		
		Elements elems = doc.select("a.ellipsis");
		// 태그명#id명						상위스판 클래스가 이거인 > 하위스판 텍스트를 가져와볼게
		// 태그명.class명
		// 상위태그명 > 하위태그명
		//   => 이 과정들이 파싱 
		
		//////////////////////////////////////////////// 파싱을 통해 요소들을 데려온 상태 
		
		
		//4. 분석하여 추출 완료한 데이터를 console 화면에 출력
		
		// Iterator 이터레이터 // 컬렉션이라 utill java에서 받고 
		// Element 는 Jsoup에서 받아온다.
		// 거대한 컬렉션(elems)에 있는 데이터를 작은 단위의 컬렉션으로 나눠 저장할 수 있도록 해주는 컬렉션
		
//		 Iterator<Element> itr=elems.iterator();
//	      // itr는 hasNext(),next()
//		  // 다음 요소가 있어?,그럼 다음거(==내거,<제네릭>에 해당하는 자료형)보여줘~
//	      while(itr.hasNext()) {
//	         String str = itr.next().toString(); // 다음거 보여줘 
//	         System.out.println(str);
//	      }
		
		
	      // 5. 데이터를 가공
	         int index=str.indexOf(">"); // 앞 자를 위치
	         str=str.substring(index+1); // 앞 자름
	         index=str.indexOf("<"); // 뒤 자를 위치
	         str=str.substring(0, index);
	         System.out.println(str);
	      


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		














	}
}
