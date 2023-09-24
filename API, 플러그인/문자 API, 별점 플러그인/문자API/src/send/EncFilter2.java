package send;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class EncFilter2
 */

@WebFilter(urlPatterns = { "*.send" }, servletNames = { "sendMulti" })
public class EncFilter2 extends HttpFilter implements Filter {
    private String encoding;
  /**
   * @see HttpFilter#HttpFilter()
   */
  public EncFilter2() {//�⺻ ������
      super();
      // TODO Auto-generated constructor stub
  }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {//���丮
		//���Ͱ� �޸𸮿��� ������ �� ȣ��ȴ�.
		
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//���ڵ� ó�� ����
		System.out.println("���ͷα��ε� ����α� ���� ���;� ���������Ѵ���ΰ��� ����");
		request.setCharacterEncoding(this.encoding);//�������� �ٷ� �ִ� ����: �ϵ��ڵ� ���Ϲ������� �������� �Ҹ�
		//���� ������ �����ؼ� �ش� ������ ������ �ε�(�ҷ��ͼ�) ���
		//	���ȭ�� ����ϰ� �Ǹ�
		//	JAVA�� ���ۼ� �ϰԵǸ� �������� �ʿ�
		//	�漭���� 1���̻� ���� == ����ڰ� �̿� xxx
		//
		//web.xml ����� java�� ���ۼ� �ϴ°� �ƴϱ� ������
		//�������� �� �ʿ䰡 ����
		//�� ������ ������ �ʿ䰡 ����.
		
		
		//�α�
		System.out.println("�α�");
		chain.doFilter(request, response);//������� ��û
		//�������� ��û �������� ��� ����Ǿ��ִ�.
		//������� ��û ������ ���� , ������ ��û�ߴ����� ã�Ƽ� �̵��ϱ� ������,
		//�̵��ϱ� ���� ���ڵ� ó���� �ؾ��Ѵ�.
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		//���Ͱ� ���ʷ� ������ �� �ڵ� ȣ��
		//'���ʷ� ������ ��'ȣ��Ǳ� ������ �� 1�� ȣ���
		this.encoding=fConfig.getServletContext().getInitParameter("encoding");//������� �ʱ�ȭ
		System.out.println("init ����");
		//��not pojo�� �ʱ�ȭ�� init���� �Ѵ�.
		//����� ���� ������ �����ڿ��� �ϴ°� ����
		//�Ϲ������� not pojo���� �����ڴ� �ǵ��� �ʴ´�.
	}

}
