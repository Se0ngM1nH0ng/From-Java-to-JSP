package class04;



public class MusicVO {
	// 1. ��� ����
	private int num; // �뷡 ��ȣ
	private String title; // �뷡 ����
	private String singer; // �뷡 ����
	
	// 2. ������
	public MusicVO (int num, String title, String singer) {
		this.num=num;
		this.title=title;
		this.singer=singer;
	}
	
	// 3. �޼���
	

	// 	toString �������̵�
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
