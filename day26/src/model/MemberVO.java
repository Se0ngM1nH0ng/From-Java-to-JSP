package model;

public class MemberVO {
	private String mid;
	private String mpw;
	private int total; //�̰Ŵ� �׳� �� �ݾ�
	private int tmpPrice; // DB_���̺��� ������ ���� ���Ǽ������� JAVA_VO���� ������ �������
	// ��� �ѱݾ��� !!! �󸶸�ŭ !!! �÷��� // �󸶸�ŭ�� ��� �ӽ÷� ������ �ϳ� ����
	// ��� �ӽö� �����ڸ� ���� �ʿ� ����
	// private�� �پ getter,setter�� ����� �� 
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
		this.action="�������";
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
		return mid+" ȸ�� ��� ["+mpw+"] �� ���űݾ� ["+total+"]";
	}
}
