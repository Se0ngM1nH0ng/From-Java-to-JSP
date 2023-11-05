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
		datas.add(new ProductVO(101,"¼¼Á¦",23000));
		datas.add(new ProductVO(102,"Çê°³¼ö",1500));
		datas.add(new ProductVO(103,"¿ìÀ¯",1100));
		datas.add(new ProductVO(104,"¹ÚÄ«½º",900));
		datas.add(new ProductVO(105,"´ß°¡½¿»ì",11700));
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
