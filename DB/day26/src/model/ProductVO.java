package model;

public class ProductVO {
	private int num;
	private String name;
	private int cnt;
	private int price;
	private int tmpNum;
	private String searchCondition; // searchKeyword
	
	
	
	public ProductVO(int num,String name,int cnt,int price) {
		this.num=num;
		this.name=name;
		this.cnt=cnt;
		this.price=price;
		this.searchCondition = "이름";
	}
	
	public String getSearchCondition() {
		return searchCondition;
	}
	public void setSearchCondition(String searchCondition) {
		this.searchCondition = searchCondition;
	}
	public ProductVO() {
		this(0,"",0,0);
	}
	public int getTmpNum() {
		return tmpNum;
	}

	public void setTmpNum(int tmpNum) {
		this.tmpNum = tmpNum;
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
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		if(cnt<=0) {
			System.out.print("[품절] ");
		}
		return num+"번 상품 "+name+" 재고 ["+cnt+"] 가격 ["+price+"]";
	}
}
