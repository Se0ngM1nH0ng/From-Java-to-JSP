package model;

import java.util.ArrayList;

public class ProductDAO {
	private ArrayList<ProductVO> datas;
	public ArrayList<ProductVO> getDatas() {
		return datas;
	}
	public void setDatas(ArrayList<ProductVO> datas) {
		this.datas = datas;
	}

	public ProductDAO() {
		datas=new ArrayList<ProductVO>();
		datas.add(new ProductVO(101,"����",23000));
		datas.add(new ProductVO(102,"�갳��",1500));
		datas.add(new ProductVO(103,"����",1100));
		datas.add(new ProductVO(104,"��ī��",900));
		datas.add(new ProductVO(105,"�߰�����",11700));
	}
	
	public ArrayList<ProductVO> selectAll(ProductVO pVO){
		return datas;
	}
	public ProductVO selectOne(ProductVO pVO) {
		for(ProductVO v:datas) {
			if(pVO.getNum()==v.getNum()) {
				return v;
			}
		}
		return null;
	}
}
