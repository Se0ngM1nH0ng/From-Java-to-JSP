package model;

public class StarVO {
	private int num;
	private double starvalue;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public double getStarvalue() {
		return starvalue;
	}
	public void setStarvalue(double starvalue) {
		this.starvalue = starvalue;
	}
	@Override   
	public String toString() {
		// TODO Auto-generated method stub
		return "º° °³¼ö : " + starvalue;
	}
}
