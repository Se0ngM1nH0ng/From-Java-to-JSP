package test;


// vo �� dao �� ������ �ִ� Ŭ���� �̴�. 
// �и��� ���� 
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
			this.result = ""; //  ����ϴ� �κ��� result �� �����;� �Ǵϱ� �Է��� �������� result�� "" �� ���� �� �ֵ���
			 // ���⼭ ��� ���ϸ� ������ ������� ���� 
		}else if(this.id.equals("admin") && this.password.equals("1234")){
			this.result = "�����ڴ� ȯ���մϴ� !";
			
		}else{
			this.result = "�ٽ� �Է����ּ���";
		}
	}
}
