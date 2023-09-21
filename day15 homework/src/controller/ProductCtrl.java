package controller;

import java.util.ArrayList;

import model.ProductDAO;
import model.ProductVO;
import view.ProductView;

public class ProductCtrl { // this �� �ٿ������

	private ProductView view;
	private ProductDAO dao;

	public ProductCtrl() {
		this.view = new ProductView();
		this.dao = new ProductDAO();
	}

	// DAO �� CRUD���� �����ؾ��ϴ� ���� ����
	// �������� �ʾƵ��Ǵ� ������ 0,null ����

	public void startApp() {
		while (true) { // ���α׷� ���Ḧ ������ �������� �ȳ������̴�.

			System.out.println(" �α�: ����ڰ� ���� �����մϴ�.");
			//��ٱ��ϸ� ���� ����ڰ����� �߰��Ͽ���.
			// ����ڰ� ���� �����ϸ� ��ٱ��ϵ� ���� �����.
			// �α״� : Ȯ���� ���Ѱ� 
			// ���� ���񽺿����� ��� xxx
			ArrayList<ProductVO> cart = new Product();


			//��ٱ��� ��ٱ��� = �ʱ�ȭ;
			���� ������ �����Ҷ� 
			ArrayList

			//			(�ѱ��ڵ�)
			// ����ڿ��� �޴�ȭ���� �����־����
			// �޴�ȭ���� �� ����ڴ� console�� ����� �޴��� �Է�
			int action = view.printMenu();

			// C��V���� �Է°��� �޾Ƽ�, 
			// � M(���)�� �����ؾ� �ϴ��� �������� ����
			
			if(action == 1) {// ���࿡ �����߰��� ����ڰ� �����ߴٸ�
				
				//dao�� �μ�Ʈ�� �̸� ,���� ,���� �� ��������
				// �̸� ������� �־���� �Ѵ�
				String name = view.getMenuName();
				int price = view.getMenuPrice();
				int cnt = view.getMenuCnt();
				
				//c�� m���� �����߰��� ��Ź�� ����
				//m �� �����߰� (c, insert())�� �ϱ����� -
				//-������ �̸�, ������ ����, ������ ��� �ʿ���� 
				if(dao.insert(name, price, cnt)) {// �̰� ����� ������
					 //true 
				}else {
					//false
				}
				
				
				//c�� �̷�m�� ��Ȳ�� �˰�, 
				//v���� ��Ź�մϴ�.
				//v�� �̸�, ���� , ��� ������� ����ڿ��� �Է� �޾ƿ�
				//�Է°� v->c �Ѱ��� 
				//c�� �Է°��� m���� �Ѱ���
			}else if(action ==2) {
				// ���࿡ ����������� �����ߴٸ�, c�� m���� R(selectAll())�� ��û��
				//m�� selectAll()�� �����ϰ� , �� �����(��ȯ��,���ϰ�,output)�� c���� �� 
				//c�� ������� v���� ����
				//v�� consoleȭ�鿡 ���
			}
			else if(action ==3) {
				//���࿡ ���Ÿ� �����ߴٸ� , 
				//v�� ��������� ���췡 ? ���
				//����ڴ� console�� ��ȣ �Է�
				//v�� ���� ��ȣ�� c���� �� 
				//c�� m����  U(update())�� ��û
				//�̶� , ���� ��ȣ�� m���� ������ 
				//m�� UPDATE �������� T or F �� c���� ��ȯ���� // ���� ��ȣ�� �ùٶ�� ��� ���°͵� F��
				//C�� ���� ����� �ƴϱ� ,
				//�������� �´� ȭ���� V���� ��û�� 
			}
			else if(action ==4) {
				//���࿡ ������ �����ߴٸ�, 
				//v�� ��������� �������ҷ� ? ��� 
				//����ڴ� console�� ��ȣ �Է�
				//v�� ���� ��ȣ�� c���� �� 
				//c�� m���� d(delete())�� ��û
				//�̶�, ���� ��ȣ�� m���� ������
				//m�� d �������� t or f �� c���� ��ȯ���� 
				//c�� �������� �ƴϱ� 
				//������ �´� ȭ���� V���� ��û��
			}
			else if(action ==5) { // ���������̶��
				//���α׷� ����
					view.printFalse();
			}


			// ���࿡ �����߰��� ����ڰ� �����ߴٸ�,
			//c�� m���� �����߰��� ��Ź�� ����
			//m �� �����߰� (c, insert())�� �ϱ����� -
			//-������ �̸�, ������ ����, ������ ��� �ʿ���� 
			//c�� �̷�m�� ��Ȳ�� �˰�, 
			//v���� ��Ź�մϴ�.
			//v�� �̸�, ���� , ��� ������� ����ڿ��� �Է� �޾ƿ�
			//�Է°� v->c �Ѱ��� 
			//c�� �Է°��� m���� �Ѱ��� 



			// ���࿡ ����������� �����ߴٸ�, c�� m���� R(selectAll())�� ��û��
			//m�� selectAll()�� �����ϰ� , �� �����(��ȯ��,���ϰ�,output)�� c���� �� 
			//c�� ������� v���� ����
			//v�� consoleȭ�鿡 ���



			//���࿡ ���Ÿ� �����ߴٸ� , 
			//v�� ��������� ���췡 ? ���
			//����ڴ� console�� ��ȣ �Է�
			//v�� ���� ��ȣ�� c���� �� 
			//c�� m����  U(update())�� ��û
			//�̶� , ���� ��ȣ�� m���� ������ 
			//m�� UPDATE �������� T or F �� c���� ��ȯ���� // ���� ��ȣ�� �ùٶ�� ��� ���°͵� F��
			//C�� ���� ����� �ƴϱ� ,
			//�������� �´� ȭ���� V���� ��û�� 



			//���࿡ ������ �����ߴٸ�, 
			//v�� ��������� �������ҷ� ? ��� 
			//����ڴ� console�� ��ȣ �Է�
			//v�� ���� ��ȣ�� c���� �� 
			//c�� m���� d(delete())�� ��û
			//�̶�, ���� ��ȣ�� m���� ������
			//m�� d �������� t or f �� c���� ��ȯ���� 
			//c�� �������� �ƴϱ� 
			//������ �´� ȭ���� V���� ��û��
			//				         
			//���α׷� ����
			if(���������̶��) {
				view.printFalse();
			}






			// ����ڿ��� �޴�������
			view.printProduct();
			// ����ڰ� ������ �Է¹޾ƺ�
			int menuNum = view.getMenuNum();

			// �����߰�����
			if (menuNum == 1) {
				view.printInfo_C_Start(); // ���� �ȳ� ��Ʈ
				String name = view.getMenuName(); 
				// �̸� �Է¹ޱ� //view ->con �Է°��Ѱ��ֱ�
				int price = view.getMenuPrice(); 
				// ���� �޾ƿ���//view ->con �Է°��Ѱ��ֱ�
				int cnt = view.getMenuCnt(); 
				// ���� �Է¹ޱ�//view ->con �Է°��Ѱ��ֱ�
				if (dao.insert(name, price, cnt)) { 
					// �Է��� ���� �߰��ϱ� //con -> model���� �ٽ� �Ѱ���
					view.printInfo(); // true�϶� �� �� ���
				} else {
					view.printFalse(); // false �϶� �� �� ���
				}
				view.printReturn(); // ó������ ���ư��ϴ� �ȳ���Ʈ
			} else if (menuNum == 2) {
				// ���� ��� �������
				ArrayList<ProductVO> datas = dao.selectAll(); 
				//selectAll�ϸ� ������� arraylist�� ���� 
				// �迭 ��ü�� ��� ���ּ��� 
				view.printMenuList(datas); // �ٽ� ������ ���� 

			} else if (menuNum == 3) {
				// ���� ��������
				view.printInfo_U_Start();
				ArrayList<ProductVO> datas = dao.selectAll(); // �迭 ��ü ���
				view.printMenuList(datas);
				int num = view.getProductNum(); 
				// �Է��� �����ȣ ���� // ��� ��� �췡 ?
				int cnt = view.sellCnt(); 
				// �Է��� ���� ���� // � �췡 ?
				if (dao.update(num, cnt)) { // ������ ��ŭ ����
					// ���ſ� �������������� ��ٱ��Ͽ� �ش� ��ǰ �� �߰�
					// ��ٱ���.add(���� ������ ��ǰ);
					ProductVO data = dao.selectOne(vo);
					data.setCnt(cnt); // pk,name,price �� ���Ǳ⿡ ����� ��ǰ������ ����������,
					// cnt�� ����ڰ� �Է��ߴ� ������ �����ؾ��� !
					cart.add(data); // pk,name,price,cnt // ��ٱ���.add(���� ������ ��ǰ);
					view.printInfo_U_End();
				} else {
					view.printFalse();
				}
				view.printReturn();

			} else if (menuNum == 4) {
				// ���� ��������
				view.printInfo_D_Start(); // ���� ���� ��ư �ȳ���Ʈ
				ArrayList<ProductVO> datas = dao.selectAll();
				view.printMenuList(datas);
				int num = view.getProductNum(); // ���� ��ȣ�ޱ�
				if (dao.delete(num)) {
					view.printInfo_D_End();
				} else {
					view.printFalse();
				}
				view.printReturn();

			} else if (menuNum == 5) {
				// ���α׷� ��������
				view.printInfo_Program_End();
				break;
			}

		}
		cart.clear();
	}
}