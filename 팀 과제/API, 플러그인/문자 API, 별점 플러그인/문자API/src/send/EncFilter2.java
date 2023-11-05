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
  public EncFilter2() {//기본 생성자
      super();
      // TODO Auto-generated constructor stub
  }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {//디스토리
		//필터가 메모리에서 해제될 때 호출된다.
		
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//인코딩 처리 로직
		System.out.println("필터로그인데 샌드로그 전에 나와야 내가생각한대로인거임 ㅇㅇ");
		request.setCharacterEncoding(this.encoding);//설정값을 바로 넣는 행위: 하드코딩 →일반적으로 유지보수 불리
		//설정 파일을 생성해서 해당 파일의 내용을 로드(불러와서) 사용
		//	상수화를 사용하게 되면
		//	JAVA를 재작성 하게되면 컴파일이 필요
		//	→서버가 1초이상 정지 == 사용자가 이용 xxx
		//
		//web.xml 사용은 java를 재작성 하는게 아니기 때문에
		//컴파일을 할 필요가 없다
		//즉 서버가 정지할 필요가 없다.
		
		
		//로그
		System.out.println("로그");
		chain.doFilter(request, response);//사용자의 요청
		//→사용자의 요청 정보들이 모두 저장되어있다.
		//사용자의 요청 정보를 보고 , 무엇을 요청했는지를 찾아서 이동하기 때문에,
		//이동하기 전에 인코딩 처리를 해야한다.
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		//필터가 최초로 생성될 때 자동 호출
		//'최초로 생성될 때'호출되기 때문에 단 1번 호출됨
		this.encoding=fConfig.getServletContext().getInitParameter("encoding");//멤버변수 초기화
		System.out.println("init 동작");
		//→not pojo의 초기화는 init에서 한다.
		//기능이 많기 때문에 생성자에서 하는게 많다
		//일반적으로 not pojo들은 생성자는 건들지 않는다.
	}

}
