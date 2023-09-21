package model;

import java.util.ArrayList;

// ������,��ϰ˻�_�̸�,��ϰ˻�_���ݼ�,��ϰ˻�_��ȸ��
public class ProductDAO {
	private ArrayList<ProductVO> datas;
	private static int PK=1001;
	public ProductDAO() {
		datas=new ArrayList<ProductVO>();
		datas.add(new ProductVO(PK++,"�尩",12000,2));
		datas.add(new ProductVO(PK++,"ȭ����",1000,1));
		datas.add(new ProductVO(PK++,"��ȭ",23000,0));
		datas.add(new ProductVO(PK++,"����",120000,1));
		datas.add(new ProductVO(PK++,"ȭ��",5500,2));
	}

	public ArrayList<ProductVO> selectAll(ProductVO pVO){// ���� ���� ��ǰ ��ȯ
		// ���� �������� ���� 
		// ��������� �ϳ��� �޼��忡�� �ۼ�



		if(pVO==null) {// pVO�� null �̾� ? �׷��� ���� ����̾� 
			return datas;
		}

		else if(pVO.getName().equals("���Ͱ˻�")) { //�̰� ���Ͱ˻��̾� ? //searchCondition // ���� 
			ArrayList<ProductVO> mdatas=new ArrayList<ProductVO>();//��ȯ���� �迭 ����� 
			//���ݹ����� ���� �����͵��� �߰��ؼ�
			for(ProductVO data : datas) {
				if(pVO.getPrice() <= data.getPrice() && data.getPrice() <= pVO.getCnt()) { //searchContent // ���ǿ� ���� ����
					//���ݹ����� ���� �����;� ?
					// ���� <= �� ���� && ������ >= �ְ�
					mdatas.add(data);
				}
			}
			return mdatas;//��ȯ�� 
		}

		else {// ��ǰ ��� �̴ϱ� Product -> �׸��� �˻��̴ϱ� ��ü�� ���� �˻縦 ����� �Ѵ�. ��ǰ �˻�
			// null�� �ƴϸ� ? �̸����� �˻�
			// '��ǰ������'�� �Ҷ����� ����(pVO)�� null�̹Ƿ�
			// pVO�� null�� �ƴ϶�� '�̸����ΰ˻�'��!
			ArrayList<ProductVO> mdatas=new ArrayList<ProductVO>();
			for(ProductVO data:datas) {
				if(data.getName().contains(pVO.getName())) {
					// ó������ ������ ���鼭
					//			if(����ڰ� �Է��� �̸��� ���� �����;�)?{
					//				// () ���� : ���� ���� �ִ� ������ �̸�(data.getName)�� �˻���(pVO.getName)�� �����ϰ�(contains) �־� ?
					//				// pVO.getName() == ����ڰ� �˻��� �ܾ�
					mdatas.add(data);
				}
			}         
			return mdatas;
		}

		//   	��ǰ �̸����� �˻��� ���� �ѱ� �ڵ�
		//		if(�̸����� �˻����̴�?) { // pVO != null
		//			// pVO�� null�� �ƴ϶�� '�̸����� �˻�'�� 

		//			ó������ ������ ���鼭
		//			if(����ڰ� �Է��� �̸��� ���� �����;�)?{
		//				// () ���� : ���� ���� �ִ� ������ �̸�(data.getName)�� �˻���(pVO.getName)�� �����ϰ�(contains) �־� ?
		//				// pVO.getName() == ����ڰ� �˻��� �ܾ�


		//				//(mdatas)output�� ������
		//				mdatas.add(data);
		//			}
		//			return (mdatas)output����!
		//		}else {
		//			return datas;
		//			
		//		}

	}
	public ProductVO selectOne(ProductVO pVO){
		//���� ��� ��ǰ = pVO.getName;

		if(pVO.getName().equals("�ְ�") ) {// searchCondition //���� �ְ� �˻��̾� ?
			//�ְ� ã�� �˰���
			int max=datas.get(0).getPrice();
			int maxIndex=0;
			for(int i=1;i<datas.size();i++) {
				if(max<datas.get(i).getPrice()) {
					max=datas.get(i).getPrice();
					maxIndex=i;
				}
			}
			return datas.get(maxIndex);//�ְ���ǰ
		}else if(pVO.getName().equals("������")) {
			int min = datas.get(0).getCnt();
			int minIndex = 0;
			for (int i = 0; i < datas.size(); i++) {
				if(min > datas.get(0).getCnt()) {
					min = datas.get(i).getCnt();
					minIndex=i;
				}
			}
			return datas.get(minIndex);
		}
		return null;
	}	

	public boolean insert(ProductVO pVO) {
		// �̱����� ���¿����� false�� �α�
		return false;  
	}
	public boolean update(ProductVO pVO) {
		return false;
	}
	public boolean delete(ProductVO pVO) {
		return false;
	}
}
