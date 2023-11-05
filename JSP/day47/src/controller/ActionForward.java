package controller;

public class ActionForward {
	// Controller로 돌아갈 준비
	// 1. 리다이렉트? 포워드?
	// 2. 어디로 가야되니?
	
	// 두개의 타입을 못보내기 때문에 하나로 묶을 수 있는 vo 같은애를 만들어야 한다. 
	// 멤버변수 둘 (boolean, String)
	
	private boolean redirect; // 데이터를 가져가야하는지 말아야 하는지
	private String path; // 어디로 갈지
	public boolean isRedirect() {
		return redirect;
	}
	public void setRedirect(boolean redirect) {
		this.redirect = redirect;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
}
