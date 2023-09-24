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
// @ 를 어노테이션(애너테이션) 
@WebFilter("*.jsp") // 필터 맵핑 설정이라서 이게 없으면 안돈다. 
public class EncFilter implements Filter { // Not POJO 라서 import 가 엄청 많다. 
	
	private String encoding;

    /**
     * Default constructor. 
     */
    public EncFilter() { // 기본 생성자 필수 
    	super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// 필터가 메모리에서 해제될때 자동 호출 
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		 
		request.setCharacterEncoding(this.encoding); // 인코딩 처리 로직 // 이렇게 설정값을 바로 넣는 행위를 하드 코딩이라고 함 .유지보수에 불리함 
		// ---> 상수화 시켰다 final 붙여서 
		// ---> 설정파일을 생성해서 해당 파일의 내용을 로드  (불러와서) 사용
		//				장점이뭔데 그럼 ? java를 재작성하게 되면 재컴파일이 필요합니다. === 그래서 불리
		//				서버가 1초이상 정지 == 사용자가 이용 xxx
		
		System.out.println("로그");
		
		
		chain.doFilter(request, response); // -> 사용자의 요청정보를 보고 어디를 요청 했는지 ,무엇을 요청 했는지 찾아서 다음페이지로 이동하기 때문에 이동하기 전에 처리해야 한다.(인코딩을) 
		// == 사용자의 요청이다. 
		// 사용자의 요청정보들이 모두 저장되어 있음
		
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// 필터가 최초로 생성될때 자동 호출 
		// '최초로 생성될때' 호출되기 때문에 단 1번 호출된다. 
		
		// 멤버변수에 대해서는 init에서 초기화 한다. 
		
		//this.encoding="UTF-8"; // not pojo 들은 init 이 해준다. 
		// 내꺼 인코딩 utf-8로 초기화 // 멤버변수 초기화
		this.encoding=fConfig.getServletContext().getInitParameter("encoding");
		System.out.println("init 동작()");
	}
}
