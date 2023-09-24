package controller;

import java.util.ArrayList;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import model.BoardDAO;
import model.BoardVO;

/**
 * Application Lifecycle Listener implementation class SampleListener
 *
 */
@WebListener
public class SampleListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public SampleListener() { // 필수 기본 생성자
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  {  // 소멸때 할 행동
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { // 생성 메서드 
    	// 이 부분에서 크롤링 해주세요 그리고 DB에 넣어주세요 !
    	
    	ArrayList<BoardVO> datas=Crawling.sample();
    	BoardDAO bDAO = new BoardDAO();
    	for(int i =0;i<datas.size();i++) {
    		bDAO.insert(datas.get(i));
    	}
    	
    	
    	System.out.println("로그 수행 완료");
    	
    }
	
}
