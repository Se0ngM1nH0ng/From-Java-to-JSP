package class04;



public class MusicVO {
	// 1. 멤버 변수
	private int num; // 노래 번호
	private String title; // 노래 제목
	private String singer; // 노래 가수
	
	// 2. 생성자
	public MusicVO (int num, String title, String singer) {
		this.num=num;
		this.title=title;
		this.singer=singer;
	}
	
	// 3. 메서드
	

	// 	toString 오버라이딩
	@Override
	public String toString() {
		String msg = num+". ["+title+" - "+singer+"]";
		return msg;
	}

	// 	getter,setter
	


	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	@Override
	public boolean equals(Object obj) {
		MusicVO musicVO=(MusicVO)obj;
		if(this.num==musicVO.num) {
			return true;
		}
		return false;
	}
	
}
