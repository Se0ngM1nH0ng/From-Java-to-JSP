package model;

import java.util.ArrayList;


// DAO�� CRUD(����Ͻ� �޼��� , �ٽɷ���)��
// � �߰� ��û���׿��� ���� !
// " �޼��� �ñ״�ó" �� ������ �ʵ��� �ڵ带 �ۼ��ؾ��� !
// ���ο� ���� �ٲٴ� ������ �ܺο� ������ ���� �ʴ´�.
// �޼��� �ñ״�ó�� �����ϸ� �ٸ� ���� �� �ٲ�� �ϱ� ������ ���� !

//"�޼��� �ñ״�ó"�� ����Ǹ� �ٸ� ��Ʈ�� ������ ����� ...
// '���' ������ ������.
//��� ) "�޼��� �ñ״�ó"�� ����ܰ迡�� ����� ����Ǹ� �ȵ� !!!



public class ProductDAO { // this �� �ٿ��ֱ�
	private static int PK = 1; // �ý��ۿ��� �ο��ϴ� �����̴�.
	private ArrayList<ProductVO>datas;
	
	 public ProductDAO(){
		this.datas = new ArrayList<ProductVO>();
	}
	
	 // ��� ���ڴ� ProductVO vo �� ����
	 
	// C : ���Ḧ �߰��ϴ� ���� // �̸�,����,���� �߰�
	 public boolean insert(String name,int price, int cnt) {
			this.datas.add(new ProductVO(PK++,name,price,cnt));
				return true; // �̰� �׻� �ǰ���
	 }
	 // �̸�, ����, ��� �� �߰��ž���  
	 
	 
	// R : ��� ���
	 public ArrayList<ProductVO> selectAll() {
		if(��ü������) { // vo.getName() == null	 
		 return this.datas;
		}else {
			
			for() {
				if(�˻��̸��� data�̸��� ������?) { //data.getName().equals(vo.getName())
					datas.add(data);
				}
			}
			
			�̸��� ���� ,
			���ο� datas�� ����, 
			�̸��� ���� �ֵ��� �־ ��ȯ
		}
			 
			
			 selectAll �� �Ҽ� �ִ°�
			 1. ��ü������ => �׳� ���� ���� ������� datas  ��ȯ
			 2. �˻���� ��� => �̸��� ����, �� �̸��� ���� �ֵ��� ��ȯ
			 
			 
			 
		}
	 public ProductVO selectOne(int num) { // ��� �ϳ��� �޾ƿ��� �Ŷ� PK�� ������ �޾ƾ���
		 for(ProductVO data : datas) {
			 if(data.getNum() == num) {
				 return data;
			 }
		 }
		 System.out.println(" �α�: selectOne(): ");
		 return null;
	 }
	 // ���� DB ������ (==datas)�� ���� xxxx
	 // ���� vo��ü�� new(��üȭ) �ؼ� ���� 
	 
	 
	// U ���� : �����ȣ�� ������ �Է¹ް� ����� �ϸ� ��� ����
	 // �信���� ��� �˼��� ���� ������ //data�� �信�� �˼� ���� ������ 
	 // 
	 
	 
	 // ��ǰ�� ã�Ҿ� 
	 �����ϴ� �Ŵ�? ������ ģ�� ��ž
			 ���� ��� ������ ���� ?
					 �ƴѵ� ? �׷� false
					 
	 public boolean update(int num, int cnt) { // �� ��������
		 for (int i = 0; i < this.datas.size(); i++) {
			if(this.datas.get(i).getNum() == num) { // ��ȣ�� ��ġ�ϸ�
			datas.get(i).setCnt(datas.get(i).getCnt()-cnt); // ���̳ʽ� ��ų����
			
			//set �ٲܰž� ������ setCnt �ٽü����Ұž� ~ =>
			//��� ? ���� �������� ������ ������ ����! 
			return true;
			}
		}
		 System.out.println(" �α� : model: ProduuctDAO: update(): ������ ���ᰡ �����ϴ�.");
		 return false;
	 }
//	 Ȥ�ó��� �����Ϳ� �Է��� �ѹ� ���� ���� ������ ��ȣ�� ����?
//			 if(Ȥ�� ��� �־�?) {
//			 ��� --;
//			 return true;
//			 }
//	 			syso :������
//	 			return false;
//	 for�� �� ���Ҵµ��� �ѹ����� ������ ���ߴٸ� �ش��ϴ� ��ǰ�� ��� 
//	 false�̴� 
//	 return false;
//	 
	// D : ���Ḧ �����ϴ� ����
	 
	 public boolean delete(int num) { // ��ȣ�� �Է¹޾ƾ� �ϴϱ� // �� �������� 
		 for(int i = 0; i < this.datas.size(); i++) {
			 if(this.datas.get(i).getNum() == num) {
				 this.datas.remove(i); //���� �Ҷ��� forEach�� �Ҹ��ϴ� 
				 						//���� �Ҷ� for��
				 return true;
			 }
		 }
		 System.out.println(" �α� : model: ProductDAO: delete(): ������ ���ᰡ �����ϴ�.");
		 return false;
	 }
	
	
}
