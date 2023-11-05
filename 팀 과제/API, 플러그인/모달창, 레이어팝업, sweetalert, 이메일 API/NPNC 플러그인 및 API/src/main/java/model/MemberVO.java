package model;

public class MemberVO {
	private String mid;
	private String mpw;
	private String name;
	private String email;
	
	public MemberVO() {
		this(null,null,null,null);
	}
	public MemberVO(String mid,String mpw,String name,String email) {
		this.mid=mid;
		this.mpw=mpw;
		this.name=name;
		this.email=email;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMpw() {
		return mpw;
	}
	public void setMpw(String mpw) {
		this.mpw = mpw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "MemberVO [mid=" + mid + ", mpw=" + mpw + ", name=" + name + "]";
	}
}
