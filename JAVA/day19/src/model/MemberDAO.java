package model;

import java.util.ArrayList;

// ������ ���
// ȸ��������
// ȸ������,�α���,�α׾ƿ�,����������,ȸ��Ż��
public class MemberDAO {
	private ArrayList<MemberVO> datas;
	public MemberDAO() {
		datas=new ArrayList<MemberVO>();
		datas.add(new MemberVO("admin","1234","������")); // ���̵�, ��й�ȣ, 
		datas.add(new MemberVO("coding_helper","timo","���� Ƽ��"));
	}

	public ArrayList<MemberVO> selectAll(MemberVO mVO){
		return datas; // ���� ���� ���� ȸ����� ��ȯ �ϸ� �ȴ�
	}
	public MemberVO selectOne(MemberVO mVO){
		// ���� ���� �� ����Ʈ�� �־� ?
		for(MemberVO v : datas) { // ��ü�� �� �Ⱦ� ������
			if(mVO.getMid().equals(v.getMid())) {// ���� ���� ���� �迭�� �־� ? // Ȥ�� ���� �������� datas�� �־� ?
				//���� ���� ���̵� v���� ���� ������ �־� ?
				if(mVO.getMpw().equals(v.getMpw()))  {//��й�ȣ Ȯ���غ���
					return v;  //�� ��ȯ�� 
				}
				System.out.println(" �α�: MemberDAO: selectOne(): ��й�ȣ�� ��ġ�����ʽ��ϴ�!");
				return null;  //���̵�� �´µ� ��й�ȣ �˻��� // ��й�ȣ�� Ʋ�ȴٸ� 
			}
		}
		System.out.println(" �α�: MemberDAO: selectOne(): �ش� ���̵� �����ϴ�!");
		return null; // ���̵� �ƿ� ����� �ȵǾ��ִٸ�
	}

	public boolean insert(MemberVO mVO) {  // C -> M ������ ȸ������ ���� ?
		//mVO �� �ǹ��ϴ°� == ȸ�������� ���� <--- ������ �� ���� //mVO -> �� ȸ������ ������
		//mVO�� �������� datas �� �־��� ����
		//PK �ߺ��˻縦 �ؾ��ϰ�, �����ϸ� add()

		// �ߺ� �˻縦 �� ���� !!!
		// ȸ������ �����ּ��� ~~ �ϸ� -> �ϴ� ���̵� �ߺ� �˻� ���� ��
		// ���� �����ִ°� �̰����� �������� �� ~~~ ������� �ƴ� ��Ȳ --> flag ������ ����Ѵ�
		//		if(Ȥ�� PK�� �ߺ��Ǿ���?) { 
		//			return false; //�����ϸ� false ��ȯ
		//		}
		//		datas�� mVO������ ���� add() // �ߺ��˻簡 ����� �Ǹ� 
		//		return true;


		boolean flag = false; // ó������ ������ ���鼭 ���Ͱ��� ���̵� �ִ��� üũ�ϰڽ��ϴ�
		for(MemberVO data : datas) { // ���̵� ������ ������ �����͸� �� �����Ѵ�. for������ ������ �� ~ ���� 
			if(data.equals(mVO)) { //��ü�񱳴� equals //�������̵� �Ϸ� ���� //data == mVO<--- ��ü�񱳸� �����ڷ� �ϰ� ���� xx
				// �ϳ��� ȸ�������� ������ ���� ?
				flag = true;
				System.out.println(" �α�: MemberDAO: insert(): ���̵� �ߺ�"); // �α� �޾��� 
				break;
			}
		}
		if(flag) { // PK�� �ߺ� �Ǿ���? // �ߺ��˻縦 �ϴ� �ϰ� 
			return false;
		}
		//if�� ���� �ʾ� �� �����Դٸ� 
		//datas �� ���ο� ����� �߰� �ϰ� �ǰ� // ���ο� ���̵�, ���ο� ���, ���ο� �г���
		datas.add(new MemberVO(mVO.getMid(),mVO.getMpw(),mVO.getName())); // ��ü new ���ְ� ��ü
		//���ο����� ��������(���ڿ��� mVO���� ����);	
		return true;
		//datas �� mVO������ ���� add() // �ߺ��˻� �����ϸ� ������ ��
		//mVO �� datas �� �־��� ����
		// ���ڿ��� mVO ������ ������ �� 
		/* 51 ������ ���� 
		 *1) datas.add(new MemberVO());
		 * -> datas DB������ new ���ο� �����͸� �߰� // new ��ü
		 *2)   MemberVO(������1,������2,������3)
       		-> �����͵��� mVO���� �����ϸ��
		 */



	}
	public boolean update(MemberVO mVO) {
//		������ �Է¹޾Ƽ� ���ο� ��й�ȣ�� �ٲ���
//		��ü�� ���������� �Է��� ������ ���� �Է��� ��ȣ�� ������ 
//		���ο� ��й�ȣ�� �ٲ��� 
		
		for (int i = 0; i < datas.size(); i++) {
			if(datas.get(i).equals(mVO)) { // ���ο� ������ ����
				datas.get(i).setMpw(mVO.getMpw()); // �������� �ٽ� ���� 
				return true;
			}
		}
		return false;
	}
	public boolean delete(MemberVO mVO) {
		for (int i = 0; i < datas.size(); i++) {
			if(datas.get(i).equals(mVO)) { //��ü�� ��������  �Է��� ������ ���� ���� ������ �ε����� ��ġ�ϸ� 
				datas.remove(i); // ���� �Ѵ�.
				return true;
			}
		}
		return false; // �׷��� ������ false�̴�.
	}
}
