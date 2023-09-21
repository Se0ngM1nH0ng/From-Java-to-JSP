package model;

import java.util.ArrayList;

// CRUD (����Ͻ� �޼���, �ٽ� ����) ������ ��ǥ
// : �Ϲ������� output �� boolean Ÿ���̴� !!! �ڡڡڡڡڡ�
// �� boolean���� �ٲ��ְ� return true���� false����
// ��ɱ��� 
// �α׵鸸 syso() ���� -> ���߿� �α״� �ּ����� ������ !
// ������ syso() ------> view �� ���!
public class StudentDAO {

	// model�� �����͸� ������ �ִ�
	// �̰��� ���� ���� ������ �̴�.

	// static�� �ƴ϶� �����ڿ��� ���� 

	// �ܺη� ���� �� �޾ƿ;� �ǰ� �� ����ϴ��� 
	// �α׸� � ��Ű�� ��� ���� �޾ƿԴ���

	/*
	PK�� ����ڷκ��� �Է¹����� �ȵ�!!!!!
	ID�� �Է¹�������������, "�ߺ��˻�"�� ��!
	�ý��ۿ��� int���� �ο��ؾ���!!!!!
	 */
	private static int PK = 1001; // �� pk�� ���� �� ������ �͵��� ��ȣ // ��ȣ�� ������ ����
	private ArrayList<StudentVO> datas;
	public StudentDAO(){
		this.datas=new ArrayList<StudentVO>();
		this.datas.add(new StudentVO(PK++,"ȫ�浿",85));
		this.datas.add(new StudentVO(PK++,"�ƹ���",92));
		this.datas.add(new StudentVO(PK++,"Ƽ��",51));
	}


	// �̸� ����


	// C :  �л��� �߰��ϴ� ����
	public boolean insert(String name,int score) {
		this.datas.add(new StudentVO(PK++,name,score));
		return true;
	}

	// ���� ���� �����ͽ� ������ ADD �Ұž� 
	//add�� �Ϸ��� pk,name,score �� �ʿ��� 





	// R : ����� ���� ���� , ��� ���
	// �л� ����� ����� 

	public ArrayList<StudentVO> selectAll() {
		return this.datas;
	}

	// R : 1���� ����ϴ� ���� , select
	// PK �� �޾Ƽ�,
	public StudentVO selectOne(int num) { // PK�� �޾Ƽ�,
		for(int i=0;i<this.datas.size();i++) {
			if(this.datas.get(i).getNum()==num) {
				return this.datas.get(i);
			}
		} // -> ���� for��(forEach��)
		System.out.println("  �α�: model: StudentDAO: selectOne(): ��ȯ�� �л��� �����ϴ�!");
		return null; // �ش� PK�� ���� �л��� ���� ����
	}





	// U : ��л��� � ��������  
	public boolean update(int num,int score) {
		for(int i=0;i<this.datas.size();i++) {
			if(this.datas.get(i).getNum()==num) {
				this.datas.get(i).setScore(score);// > int
				return true;
			}
		}
		System.out.println("  �α�: model: StudentDAO: update(): ���������� �л��� �����ϴ�!");
		return false;
	}





	// D : �л��� �����ϴ� ����
	public boolean delete(int num) { // �ϴ� ��ȣ�� �˾ƾ��� 
		for(int i=0;i<this.datas.size();i++) {
			if(this.datas.get(i).getNum()==num) {
				this.datas.remove(i);
				return true;
			}
		}
		System.out.println("  �α�: model: StudentDAO: delete(): ������ �л��� �����ϴ�!");
		return false;
	}












}
