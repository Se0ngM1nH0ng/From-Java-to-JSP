package controller;

import java.util.ArrayList;

import model.StudentDAO;
import model.StudentVO;
import view.StudentView;

// ��Ʈ�ѷ� 

public class StudentCtrl {

	// ��� ���� �߰��ٸ�

	private StudentView view;
	private StudentDAO dao; // model

	public StudentCtrl() {
		this.view = new StudentView();
		this.dao = new StudentDAO();
	}

	public void startApp() {
		while (true) {

			// ��������� �޴�������!
			view.printMenu();
			// ����ڰ� �� ���� �Է¹޾ƺ�
			int menuNum = view.getMenuNum();

			if (menuNum == 1) {
				// ��������
				ArrayList<StudentVO> datas = dao.selectAll();
				view.printStudentList(datas);
			} else if (menuNum == 2) {
				// 1�������
				int num = view.getStudentNum();
				StudentVO data = dao.selectOne(num); // ��ü�� �Ѹ� ����
				view.printStudent(data);
			} else if (menuNum == 3) {
				// ������
				int num = view.getStudentNum(); // ��ȣ�� �޾�
				int score = view.getStudentScore(); // ������ �޾�
				dao.update(num, score); // ���� (��� �л�, ����)
				view.printInfo();
			} else if (menuNum == 4) {
				// �߰���
				view.printInfo_C_Start();
				String name = view.getStudentName(); // �̸���
				int score = view.getStudentScore(); // ������ �޾�
				dao.insert(name, score); // �߰�(�̸�, ����)
				view.printInfo_C_End();
			} else if (menuNum == 5) {
				// ������
				view.printInfo_D_Start();
				int num=view.getStudentNum();
				if(dao.delete(num)) {
					view.printInfo_D_End();
				}else {
					view.printFalse();
				}
				
				// CRUD(����Ͻ� �޼���,�ٽ� ����)�� �����ߴ���,�����ߴ����� �˾ƾ���!!!!!
			} else if (menuNum == 6) {
				view.printEnd(); // ���α׷� ����
				break;
			}

		}
	}
}