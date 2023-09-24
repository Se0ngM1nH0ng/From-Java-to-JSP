package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import model.BoardVO;

public class Crawling {
	// 1. static ���� ����
	// ũ�Ѹ� Ŭ������ ��ü�� ���ʿ��� ��Ȳ (��������� ���� Ŭ����)
	public static ArrayList<BoardVO> sample() {
//		public static void main(String[] args) {

		final String url="https://www.melon.com/chart/";

		Connection conn = Jsoup.connect(url);

		Document doc=null;
		try {
			doc=conn.get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Elements elements = doc.select("div.ellipsis.rank02 > span");
		Elements elements2 = doc.select("div.ellipsis.rank01 > span > a");
//		Elements elements2 = doc.select("div.ellipsis.rank02 > span > a");
//		System.out.println(elements2);

		Iterator<Element> itr = elements.iterator();
		Iterator<Element> itr2 = elements2.iterator();

		ArrayList<BoardVO> bdatas= new ArrayList<BoardVO>();
		int PK=1;
		
		while(itr.hasNext() && itr2.hasNext()) {
			String title = itr.next().text();
			String artist = itr2.next().text();
			
			// text(); �޼���� Jsoup�� �޼����
			// ���õ� ��� HTML ����� �ؽ�Ʈ �������� �ϳ��� ���ڿ��� ��ȯ�մϴ�.

			System.out.println(title+" / "+artist);
			bdatas.add(new BoardVO(PK++,title,artist,""));
		}
		return bdatas;

	}

}
