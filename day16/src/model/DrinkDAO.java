package model;

import java.util.ArrayList;

// DAO�� CRUD(����Ͻ� �޼���,�ٽ� ����)��
// � �߰� ��û���׿��� ����!
// "�޼��� �ñ״�ó"�� �������ʵ��� �ڵ带 �ۼ��ؾ���!!!!!

// "�޼��� �ñ״�ó"�� ����Ǹ� �ٸ� ��Ʈ�� ������ �����...
// '���' ������ ����

// ���) "�޼��� �ñ״�ó"�� ����ܰ迡�� ����� ����Ǹ� �ȵ�!!!!!!!!!!

public class DrinkDAO {

	private static int PK = 1001;
	private ArrayList<DrinkVO> datas;

	public DrinkDAO() {
		datas = new ArrayList<DrinkVO>();
		datas.add(new DrinkVO(PK++, "�ݶ�", 1200, 3));
		datas.add(new DrinkVO(PK++, "���̴�", 900, 2));
		datas.add(new DrinkVO(PK++, "ȯŸ", 1500, 1));
	}

	// C
	public boolean insert(DrinkVO vo) { // DrinkVO vo�� ���� ����
		// ������ insert�� ȣ���� �����ʹ� vo�� �� �־�����Ѵ�.
		// ��Ʈ�ѷ��� �̵� -> insert �Ҷ� vo����
		System.out.println("MODEL(DAO): vo: " + vo); // �α� �����ֱ� vo ���
		datas.add(new DrinkVO(PK++, vo.getName(), vo.getPrice(), vo.getCnt()));
		// vo�� ���� �̸��ް�, vo�� ���� ���ݹް�, vo�� ���� ���ޱ�
		return true;
	}



	// ��� ��� �κп��� 
	// nullpointException �� �ߴ� ���� 
	//�ڡڡ� java.lang.NullPointerException
	//-> "�־�(��ü)"�� Null�̾ �߻��ϴ� �̽�
	//-> �޼��� ���� �־ Null�̾ �߻��ϴ� �̽�
	//-> aaa.bbbbb();���� aaa�� Null�̾ �߻��ϴ� �̽�



	//	1. ��ü��� ��� => �׳� �������� ������� datas ��ȯ
	//	2. �˻���� ��� => �̸��� ����, �� �̸��� ���� �ֵ��� ��ȯ	
	// R
	public ArrayList<DrinkVO> selectAll(DrinkVO vo) {
		if (vo.getName() == null) { 
			//���� �־� vo.���ñ� ���� vo�� null�̶� NullPointerException �� ����̴�.
			//������� name�� �˻��� ���߾� ? // ���࿡ �׳� ��ü�������̾��ٸ� 
			return datas; // �׷� �׳� �����͸� ��ȯ���ְ� 
		}  else {// �̸��� ����
			ArrayList<DrinkVO> datas = new ArrayList<DrinkVO>();
			// ���ο� datas�� ����,
			// �˻� ����� �ش��ϴ� �� 
			for (DrinkVO data : this.datas) {//�̸��� ���� �ֵ��� �־ ��ȯ
				if (data.getName().contains(vo.getName())) {// �˻��̸��� data�̸��� ������ ?
					// equals�� �� ��Ȯ�� �� �ܾ ��ġ�ؾ߸� ���´� 
					// �׷��� contains�� ���� 
					datas.add(data);
				}
			}
			return datas;
		}
	}

	// R
	public DrinkVO selectOne(DrinkVO vo) { // PK
		for (DrinkVO data : datas) {
			if (data.getNum() == vo.getNum()) { // �����͸� ���� pk�� �Է¹��� ��ȣ�� ��ġ�ϸ�
				DrinkVO dVO = new DrinkVO(data.getNum(), data.getName(), data.getPrice(), data.getCnt());
				// return �ڸ��� data�� ���� �Ǹ� ,, ������ �ڷḦ ���� �״�� ��� �Ǳ⶧����
				// ���� �����Ϳ� �ջ��� �ü��� �ִٴ� ������ ����.
				// �׷��� data�� �״�� ��ȯ �ϴ°��� �ƴ϶� �װͰ� �Ȱ��� ���纻�� ����
				// �� ���纻�� ��ȯ ��Ų��.

				return dVO;
				// ���� DB ������(==datas)�� ���� xxxxx
				// ���� vo��ü�� new(��üȭ)�ؼ� ���� O
			}
		}
		System.out.println(" �α�: selectOne(): �ش��ǰ����");
		return null;
	}


	// �����ε��� �Ұ����� ��� �� ���,
	// ����� �ſ� ������ ���̱� ������ ���� �������� �и��Ͽ� ����
	// -> ������ ��ɳ����� ��� �����ϴ°��� �����ϱ� ����
	// == �������� ���� -> ���������� ����

	// ���ڸ� vo�� ���缭 ���յ��� ���߰� ����� ������ ���� �ѵ� ��Ƽ� �������� ����
	// �ڹٷθ� ���� ���� �ֻ�� �ڵ�

	// U
	public boolean update(DrinkVO vo) {
		for (DrinkVO data : datas) {
			if (data.getNum() == vo.getNum()) {
				// �����Ҷ����� ���밪�̶� �� ���� ��
				if (vo.getCnt() < 0) { // �����Ҷ�
					int cnt = vo.getCnt() * (-1); // �����Ϸ��� ��
					if (cnt > data.getCnt()) {
						System.out.println(" �α�: update(): ������");
						return false;
					}
				}
				data.setCnt(data.getCnt() + vo.getCnt()); 
				// ���� ����߰��� ���缭 + �� �ϰ�
				// ���Ÿ� �ϸ� cnt�� ���ִ� �ɷ� ���� ����.
				System.out.println("data: " + data);
				return true;
			}
		}
		System.out.println(" �α�: update(): �ش��ǰ����");
		return false;
	}


	// D
	public boolean delete(DrinkVO vo) {
		for (int i = 0; i < datas.size(); i++) {
			if (datas.get(i).getNum() == vo.getNum()) {
				datas.remove(i);
				return true;
			}
		}
		System.out.println(" �α�: delete(): �ش��ǰ����");
		return false;
	}
}
