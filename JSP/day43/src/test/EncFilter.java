package test;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class EncFilter
 */
// @ �� ������̼�(�ֳ����̼�) 
@WebFilter("*.jsp") // ���� ���� �����̶� �̰� ������ �ȵ���. 
public class EncFilter implements Filter { // Not POJO �� import �� ��û ����. 
	
	private String encoding;

    /**
     * Default constructor. 
     */
    public EncFilter() { // �⺻ ������ �ʼ� 
    	super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// ���Ͱ� �޸𸮿��� �����ɶ� �ڵ� ȣ�� 
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		 
		request.setCharacterEncoding(this.encoding); // ���ڵ� ó�� ���� // �̷��� �������� �ٷ� �ִ� ������ �ϵ� �ڵ��̶�� �� .���������� �Ҹ��� 
		// ---> ���ȭ ���״� final �ٿ��� 
		// ---> ���������� �����ؼ� �ش� ������ ������ �ε�  (�ҷ��ͼ�) ���
		//				�����̹��� �׷� ? java�� ���ۼ��ϰ� �Ǹ� ���������� �ʿ��մϴ�. === �׷��� �Ҹ�
		//				������ 1���̻� ���� == ����ڰ� �̿� xxx
		
		System.out.println("�α�");
		
		
		chain.doFilter(request, response); // -> ������� ��û������ ���� ��� ��û �ߴ��� ,������ ��û �ߴ��� ã�Ƽ� ������������ �̵��ϱ� ������ �̵��ϱ� ���� ó���ؾ� �Ѵ�.(���ڵ���) 
		// == ������� ��û�̴�. 
		// ������� ��û�������� ��� ����Ǿ� ����
		
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// ���Ͱ� ���ʷ� �����ɶ� �ڵ� ȣ�� 
		// '���ʷ� �����ɶ�' ȣ��Ǳ� ������ �� 1�� ȣ��ȴ�. 
		
		// ��������� ���ؼ��� init���� �ʱ�ȭ �Ѵ�. 
		
		//this.encoding="UTF-8"; // not pojo ���� init �� ���ش�. 
		// ���� ���ڵ� utf-8�� �ʱ�ȭ // ������� �ʱ�ȭ
		this.encoding=fConfig.getServletContext().getInitParameter("encoding");
		System.out.println("init ����()");
	}
}
