package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
	// 클래스와 유사한데 
	// 클래스는 아니라서 "생성자"가 없음
	// "객체화(인스턴스화)"도 안됨
	// "메서드 오버라이딩 강제" 하려고 존재하는 문법 
	ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
	// 디폴트 설정으로 abstract 키워드가 존재하기 때문에
	// 당연히 public 도 디폴트 이다. 당연히 여러군데에서 사용해야 하기 때문에 
	// 오버라이딩을 강제 하려는 목적으로만 사용하기 때문에 
}
