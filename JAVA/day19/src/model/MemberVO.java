package model;
// ��� �����ʹ� �ݵ�� ������ �ϴ� �Ӽ�  : �ĺ����� �ؾ��� PK �� �־���� 
public class MemberVO {
	private String mid; // ���̵� PK
	// : �Ϲ������� PK�� �ý��ۿ��� �ο��Ѵ� 
	// : ����ڰ� ��� -----> �� �ߺ��˻� �ʼ� ��
	private String mpw; // ��й�ȣ
	private String name; // ȸ�� �̸� 
	public MemberVO(String mid,String mpw,String name) {
		this.mid=mid;
		this.mpw=mpw;
		this.name=name;
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

	@Override
	public String toString() {
		return this.name+"��";
	}

	@Override
	public boolean equals(Object obj) { // equals �������̵� �ϱ� 
		// ���̵�(mid) PK �� ������ ���ٶ�� �� ���� , ������ü !
		MemberVO mVO=(MemberVO)obj; // �ٿ� ĳ����
		if(this.mid.equals(mVO.mid)) { // ���� ���� ���̵�� �޾ƿ� ���ο� ���̵� ���� ?
			return true; // �׷��� �ߺ��̾� 
		}
		return false; // �ƴϾ� �ߺ� �ƴϾ� 
	}
	
}
