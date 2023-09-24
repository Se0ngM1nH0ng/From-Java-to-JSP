package model;

public class BoardVO {
	private int num;
	private String title;
	private String artist;
	private String writer;
	
	
	public BoardVO() {
		this(0, null, null, null);
	}
	
	public BoardVO(int num, String title,String artist,String writer) {
		this.num=num;
		this.title=title;
		this.artist=artist;
		this.writer="admin";
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	@Override
	public String toString() {
		return "BoardVO [num=" + num + ", title=" + title + ", artist=" + artist + ", writer=" + writer + "]";
	}
}
