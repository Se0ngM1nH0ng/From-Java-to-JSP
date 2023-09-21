package model;
// 모든 데이터는 반드시 가져야 하는 속성  : 식별가능 해야함 PK 가 있어야함 
public class MemberVO {
	private String mid; // 아이디 PK
	// : 일반적으로 PK는 시스템에서 부여한다 
	// : 사용자가 등록 -----> ☆ 중복검사 필수 ☆
	private String mpw; // 비밀번호
	private String name; // 회원 이름 
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
		return this.name+"님";
	}

	@Override
	public boolean equals(Object obj) { // equals 오버라이딩 하기 
		// 아이디(mid) PK 가 같으면 같다라고 할 예정 , 같은객체 !
		MemberVO mVO=(MemberVO)obj; // 다운 캐스팅
		if(this.mid.equals(mVO.mid)) { // 내가 가진 아이디와 받아온 새로운 아이디가 같니 ?
			return true; // 그러면 중복이야 
		}
		return false; // 아니야 중복 아니야 
	}
	
}
