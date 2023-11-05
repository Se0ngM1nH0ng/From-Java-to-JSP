package model;

import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ServletListener
 *
 */
@WebListener
public class ServletListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ServletListener() { // 필수 기본 생성자
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { // 소멸때 할 행동
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { // 생성 메서드 
         // 이 부분에서 크롤링 해주세요 그리고 DB에 넣어주세요 !
    	// 크롤링 했다치고 DB에 넣는 느낌 
    	
    	ArrayList<MemberVO> datas=new ArrayList<MemberVO>();
        for(int i=0;i<5;i++) {
           MemberVO data=new MemberVO(); // 크롤링한 데이터 밀어넣는 모습 
           data.setName("홍길동0"+(i+1));
           data.setAge(i+1);
           datas.add(data);
        }
        datas.add(new MemberVO());
        datas.add(new MemberVO());
        
        MemberVO mVO=new MemberVO();
        mVO.setName("티모");
        mVO.setAge(13);
        
        //application.setAttribute("datas",datas);
        ServletContext sc = sce.getServletContext(); // 서블릿 파일에 서블릿을 넣어주는 역할  
        sc.setAttribute("datas", datas);
        sc.setAttribute("data", mVO);
        
        System.out.println("로그 수행 완료 ");
    }
	
}
