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
    public ServletListener() { // �ʼ� �⺻ ������
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { // �Ҹ궧 �� �ൿ
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { // ���� �޼��� 
         // �� �κп��� ũ�Ѹ� ���ּ��� �׸��� DB�� �־��ּ��� !
    	// ũ�Ѹ� �ߴ�ġ�� DB�� �ִ� ���� 
    	
    	ArrayList<MemberVO> datas=new ArrayList<MemberVO>();
        for(int i=0;i<5;i++) {
           MemberVO data=new MemberVO(); // ũ�Ѹ��� ������ �о�ִ� ��� 
           data.setName("ȫ�浿0"+(i+1));
           data.setAge(i+1);
           datas.add(data);
        }
        datas.add(new MemberVO());
        datas.add(new MemberVO());
        
        MemberVO mVO=new MemberVO();
        mVO.setName("Ƽ��");
        mVO.setAge(13);
        
        //application.setAttribute("datas",datas);
        ServletContext sc = sce.getServletContext(); // ���� ���Ͽ� ������ �־��ִ� ����  
        sc.setAttribute("datas", datas);
        sc.setAttribute("data", mVO);
        
        System.out.println("�α� ���� �Ϸ� ");
    }
	
}
