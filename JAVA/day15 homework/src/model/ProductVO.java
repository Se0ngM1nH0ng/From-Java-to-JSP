package model;

public class ProductVO {

	private int num; // PK
	private String name; // ���� �̸�
	private int price; // ���� ����
	private int cnt; // ���� ��� 
	
	ProductVO (int num, String name, int price, int cnt){
		this.num = num;
		this.name = name;
		this.price = price;
		this.cnt = cnt;
		System.out.println(this.name +" ��ǰ ��� �Ϸ�");
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
	public String toString() {
		if(this.cnt == 0) {
			return this.num+"."+this.name+" ����: "+this.price+" ���: ǰ��";
		}else {
			return this.num+"."+this.name+" ����: "+this.price+" ���: "+this.cnt;
		}
		
	}
	
	
	
	
	
	
	
	
	
}
