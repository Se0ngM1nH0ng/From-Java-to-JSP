package model;

public class MemberVO {
	private String mid;
	private String mpw;
	private int total; //이거는 그냥 총 금액
	private int tmpPrice; // DB_테이블에는 없지만 개발 편의성때문에 JAVA_VO에서 구현한 멤버변수
	// 얘는 총금액을 !!! 얼마만큼 !!! 올려줘 // 얼마만큼이 없어서 임시로 변수를 하나 만듬
	// 얘는 임시라 생성자를 만들 필요 없다
	// private는 붙어서 getter,setter는 써줘야 함 
	private int tmpNum;
	private String tmpMpw;
	private String action;
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getTmpMpw() {
		return tmpMpw;
	}
	public void setTmpMpw(String tmpMpw) {
		this.tmpMpw = tmpMpw;
	}
	
	public int getTmpNum() {
		return tmpNum;
	}
	public void setTmpNum(int tmpNum) {
		this.tmpNum = tmpNum;
	}
	public int getTmpPrice() {
		return tmpPrice;
	}
	public void setTmpPrice(int tmpPrice) {
		this.tmpPrice = tmpPrice;
	}
	public MemberVO(String mid,String mpw) {
		this(mid,mpw,0);
	}
	public MemberVO(String mid,String mpw,int total) {
		this.mid=mid;
		this.mpw=mpw;
		this.total=total;
		this.action="비번변경";
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
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return mid+" 회원 비번 ["+mpw+"] 총 구매금액 ["+total+"]";
	}
}
