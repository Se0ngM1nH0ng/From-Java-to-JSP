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
    public SampleListener() { // �ʼ� �⺻ ������
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  {  // �Ҹ궧 �� �ൿ
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { // ���� �޼��� 
    	// �� �κп��� ũ�Ѹ� ���ּ��� �׸��� DB�� �־��ּ��� !
    	
    	ArrayList<BoardVO> datas=Crawling.sample();
    	BoardDAO bDAO = new BoardDAO();
    	for(int i =0;i<datas.size();i++) {
    		bDAO.insert(datas.get(i));
    	}
    	
    	
    	System.out.println("�α� ���� �Ϸ�");
    	
    }
	
}
