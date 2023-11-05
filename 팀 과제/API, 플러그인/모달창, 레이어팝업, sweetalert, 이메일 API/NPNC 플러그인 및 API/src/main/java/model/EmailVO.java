package model;

public class EmailVO {
	private int num;
	private String title;
	private String content;
	private String receiver;
	
	public EmailVO() {
		this(null,null,null);
	}
	public EmailVO(String title, String content, String receiver) {
		this.title=title;
		this.content=content;
		this.receiver=receiver;
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
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	
	
}
