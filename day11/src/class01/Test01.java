package class01;

class Student{
	private String name; // ���� �ǵ帱�ž� private  // ���� ������
	private int score;  // �ܺο��� ���̷�Ʈ ������ �Ұ���������.
	
	Student(String name, int score){
		this.name = name;
		this.score = score;
		System.out.println(this.name + "�л� �����Ϸ�!");
	}
	
	@Override // ���α׷��� ������ �ִ� �ּ�
	public String toString() {
		return this.name + "�л��� " + this.score + "���Դϴ�. ";//ȭ�鿡 ���� ��µ��� ����ٰ� �ۼ�
	}
	
	// private�� ��������� ���� �����ϵ��� �ϴ� "�޼���"�� �߰��� ���� 
	// private�϶� �����ϴ� ���
	// setter : ��������� ���� ��������
	void setName(String name) {
		this.name = name ;
	}
	void setScore(int score) {
		this.score = score ;
	}
	
	// getter : ��������� ���� �޾ƿü� �ֵ��� ��������
	String getName() {
		return this.name;
	}
	int getScore() {
		return score;
	}
}


public class Test01 {

	public static void main(String[] args) {
		Student s1 = new Student("�Ƹ�", 89);
//		s1.name = "ȫ"; // ���Կ�����(�ܼ� ������) �� �α׿� �ȳ��´� .
		s1.setScore(95); // '�α�'�� ��ϵ�
		System.out.println(s1);
		
		// [�α�] �ڡڡڡڡڡ�
		// ������ �����丮 ���� // ��� �Խ��� 
		// �ϳ��� �ڵ带 ���� �����ڰ� �۾��ϰ� �Ǵµ� 
		// �ϳ��� �ڵ�� ���� �����ڵ��� ���ÿ� �۾� �ϰ� �Ǵµ� 
		// : ������Ʈ �ϼ��� �⿩�� ���� 
		// ������ � �ڵ带 �ǵ�ȴ����� ���� ����� �ʿ��ϴ�.
		// ���� �߻��� � �׼� + � ��ɿ��� �߻��ߴ��� ��� 
		// => �޼��� ���ַ� ��ϵ�
		// => �ܼ� �����ڴ� �Ҽ� ������ ���� ���Ѵ� xxxx
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
