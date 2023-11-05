package test;


// vo 랑 dao 가 합쳐져 있는 클래스 이다. 
// 분리할 예정 
public class LoginBean {
	private String id;
	private String password;
	private String result;
	
	
	
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void login() {
		
		if(this.id == null) {
			this.result = ""; //  출력하는 부분을 result 를 가져와야 되니까 입력을 안했으면 result를 "" 로 보낼 수 있도록
			 // 여기서 통과 못하면 어차피 비번까지 못감 
		}else if(this.id.equals("admin") && this.password.equals("1234")){
			this.result = "관리자님 환영합니다 !";
			
		}else{
			this.result = "다시 입력해주세요";
		}
	}
}
