package model;

public class ProductVO {
	private int num; // 상품번호 PK
	private String name;
	private int price;
	private int cnt; // 조회수  // 검색을 당할때마다 조회수가 올라가도록 코딩 예정
	public ProductVO(int num,String name,int price,int cnt) {
		this.num=num;
		this.name=name;
		this.price=price;
		this.cnt=cnt;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	@Override
	public String toString() { // toString 재정의 
		
		String msg=num+". "+name+" "+price+"원 [";
		if(cnt == 0) {
			msg+="품절]";
		}else {
			msg+=cnt + "]";
		}
		return msg;
	}
}
