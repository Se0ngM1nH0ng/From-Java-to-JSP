package ctrl;

import java.util.ArrayList;

import model.MemberDAO;
import model.MemberVO;
import model.ProductDAO;
import model.ProductVO;
import view.AdminView;
import view.ClientView;

public class Ctrl { // DAO ,view �ΰ� 
	private MemberDAO mDAO; // ȸ�������� �����
	private ProductDAO pDAO; // ��ǰ 
	private AdminView admin;
	private ClientView client;
	private MemberVO member; // ���� �α����� ȸ������ // ��������� ���� �غ��� �ִ�.
	//	private CommonView common;// �ΰ��� �� �̿��Ҷ� common �� ���� // ��𿡼��� ����� ������ ������ ����ֱ��� 

	public Ctrl() { 
		mDAO=new MemberDAO();
		pDAO=new ProductDAO();
		admin=new AdminView();
		client=new ClientView();
		member=null; // �ڵ��α����� �����ϸ� �̰� �ʱ�ȭ�� �ȴ�  
		// ���� �α��� ������ ��� �θ� ~ ���߿� ������ ����  
		// ���α׷��� �����Ѵٰ� �ؼ� , ���ڱ� �α��� ������ �ʱ� ������ null �� �ʱ�ȭ 
	}

	public void startApp() {
		while(true) {
			int action=client.printClientMenu01(); // ���α׷� ��� 
			if(action==1234) { // ������ ��� ����  1234��?
				while(true) { // ������ ��� ����
					action=admin.printAdminMenu();
					if(action==1) { // ȸ����� ���
						//1. ����ڰ� �������� ��Ȳ 
						//if(action==1) // 2. �����ڰ� ȸ����Ϻ���~

						//model.selectAll(); // ��.ȸ�������(); 
						// 3. V�� C���� ���մϴ�. ȸ����Ϻ��ڴٴµ�?
						// 4. C�� ��, ȸ����ϵ����Ͱ� �ʿ��ϱ���? ����
						// 5. M���� ȸ����� �� ��~
						// 6. M�� selectAll()�մϴ�.

						ArrayList<MemberVO> mdatas=mDAO.selectAll(null); //selectAll�Ϸ���
						//���ڰ� �־�� �ϴµ� �Ѱ��� ���ڰ� �츮���� ���� ������ �׳� null�� �Ѵ�.
						// 7. AL<MVO>�� ��ȯ�ǰ� C�� �װ�-

						//view.ȸ�� ��� ���(datas);
						admin.printMemberList(mdatas); // view ���
						// 8. -V���� �ݴϴ�.


						// ���� �ڵ�
						//admin.printMemberList(mDAO.selectAll(null));
					}
					else if(action==2) { // ������ ��� ���� 
						admin.printAdminEnd();
						break;
					}
				}
			}
			else if(action==1) { // ȸ������
				//				int action=client.printClientMenu01(); 
				// 1. ����ڰ� CONSOLE�� ȸ������ �ҷ� 1�� �Է�
				//2. V�� �Է��� ���� C���� ���� -> ���޵Ȱ� action 

				//				else if(action==1) 
				// 3. C�� �� ȸ������ �ϰ� �ͱ��� ? ����


				// ���̵�,��й�ȣ, �̸� �Է±��� �ؼ� �װ��� ���� �ϴ� �� ���� 
				MemberVO mVO = client.signUp(); // �������� mVO�� ��´�.
				//ȸ������ ���� = view.ȸ������ȭ��(); ��� ȸ������ ȭ�� (); ������� 
				// �׷��� ȸ������ ������ �޾ƿ;��� 
				//4.C�� V���� ȸ�������� ������ �Է¹޾ƿ���� ����  // client.signup 
				//5.V�� ��������� ȸ������ â ������ // ȸ������ �Է��� �޵��� ����
				//6.����ڴ� ������ �Է�  // ����ڰ� �Է��� �Ϸ� 
				//7.V�� ����ڰ� �Է��� ������ C���� ����  signup���� ������ �͵� mVO�� ���� // ȸ������ ����

				// ȸ�������̴ϱ� mDAO�� �´�.
				boolean flag = mDAO.insert(mVO); // true�� �س��� ���� // ȸ�������̴ϱ� mDAO�� pDAO ���� ---> mDAO�� �´�.
				//boolean �������п��� = mDAO.insert(a);
				//8.C�� �� ������ M���� ����  // model�� ȸ������ ������ ��߰ڴ�. // model.ȸ������(a); // ȸ�������� == insert�� �ش�
				//9.M�� ȸ�������� ���� ---> model insert�ʿ��� ��� ����
				// boolean �������� ���� = model.insert(a);
				//10.M�� insert()�� �� �Ǿ����� �ƴ����� T,F ��ȯ ---> boolean


				if(flag) {//�����߾� ?
					client.signUpTrue();//view.����ȭ��();
				}else {
					client.signInFalse();// view.����ȭ��();
				}
				//11.C�� ����� ���� �´� Vȭ���� �����ټ� �ֵ��� ����
				//12.����ڴ� V�� �����ִ� ȭ�鿡 ���Ե� 


				// �ڵ带 ���̸� �̷��� ���� 
				//				if(mDAO.insert(client.signUp())) {
				//					client.signUpTrue();
				//				}
				//				else {
				//					client.signUpFalse();
				//				}
			}
			else if(action==2) { // �α���

				// ���̵��Է��غ�! ��� V�� ����ڿ��� ��û
				// ��й�ȣ�� ���� �Է���
				MemberVO mVO = client.signIn(); //�α��� �Ұž� // ���̵�� ��� �Է��ϴ� �޼��� 
				//mVO���� ����ڰ� �Է��� ���̵�, ��й�ȣ�� ����Ǿ� �ִ�!!
				// ȸ������ �Ҷ��� ��� �޼���


				//MemberVO mdata=mDAO.selectOne(mVO);
				// mdata���� ��ȿ�� ����� ���� or null
				
				
				// C�� �� ������ �ִ���, �׸��� �´���(==��ȿ����) //�� ���̵� �ִ�? �� ȸ���� ������?
				member=mDAO.selectOne(mVO); // model�� ���� ���Ѿ� �� ��
				// �ִ��� ������ �� �˷���  // ��ϵ� ������ �ִ� ������ �˷���
				// ��ȿ�� ����� ���� == "���� �α����� ȸ��"---> member 
				// ��ȯ�� �ְ� ���� �α��� �� �� ��. 
				// �α��ο� ������ �ؼ� ��ȯ�� ������ �α��ο� ������ �� �̴�.
				
				// �ϳ��� �����͸� �䱸�ϴ� ��Ȳ �̶� 
				// ���� ���θ� M���� �Ǵ��� ��Ź��
				//  --->> selectOne() // �α����Ҷ� ��ϵ� ���̵� ���� �ƴ���


				if(member==null) { //���� ���̵�� ����̸� // �α����� �ȵȰ� 
					// member�� null �̴�? �׷��� �� �α��� ����
					//null�� ��ȯ == ���ų�, ��й�ȣ�� Ʋ��!
					// -> �α��� ���� V
					//  => ���α׷� ��忡 ��� �־����...
					client.signInFalse();
					continue; // �ٽ� �ֻ������ �ö󰣴�. 
					// ���α׷� ��忡 ��� ����
				}
				//�α��� ����
				client.signInTrue(); // �α����� �Ȱ� 
				// M�� VO�� ��ȯ == �����ϴ� ȸ��
				// -> �α��� ���� V
				//  => ���� �������� �̵� // �� �ٸ� while��

				// ���ο� ���� ���� 
				while(true) { // �α����� ���������� ���� �ƴٸ� // ����� ���� ���� 
					action=client.printClientMenu02(member); // �α��ε� ������� ������ �Ѱ� �޾Ҵ�.
					if(action==1) { // �α׾ƿ�
						//����� ��带 �����ϰ� ���α׷� ���� �����°� 
						
						// ���� �α����� ȸ�� �̱� ������ 

						// ����ڰ� �α׾ƿ��� ���ϸ�, 
						
						member=null; // ����α����� ȸ�����̱� ������
						//C�� mdata�� ���� �����ϴµ�, �̰� 
						//�����ϰ� 

						//�α׾ƿ��� �Ǿ����� ����ڿ��� �˷����� !
						//���� DB�� �ǵ�� ���ٸ� v->c->m->c->v ������ 
						//�α׾ƿ��� M�� �θ��� ���� ���� . 
						//�α׾ƿ��� DB�� �ǵ帮�� �ʰ� m�κ��� �ǵ帮�� �ʱ� ������ V->C->V�� ���� 

						client.logout(); // �α׾ƿ��մϴ�
						client.printClientEnd02(); // ����� ��� ����
						break;
					}
					else if(action==2) { // ����������
						// ����������
						//����ڰ� ������������ ���Ͽ� action���� ���´�.
						// �䰡 ����� �Է¹���
						//client.printMpw(); // �̰� �޾Ƽ� ���� �����ϰ� �Ѱܾ��� !
						String mpw = client.printMpw(member);   
						// String ���� ��ȯ ������ ������ String�� ���
						//v���� ������ ������ �Է¹޴´�.
						//(��й�ȣ ���� �� ��й�ȣ�� �Է¹޴� �޼��� Ȱ��)

						//�䰡 ����� c���� ����. ��ü �ϳ� ����
						MemberVO mdata = new MemberVO(member.getMid(),mpw,null); 
						// c�� �̰� m���� ��� �����ǵ� 
						// �ϴ� ��ü ������ ��´�.
						// ���޸� �Ҷ�


						boolean flag=mDAO.update(mdata); // model�� ���� ���Ѿ� �Ҷ� 
						//c->model�� ��� ���� ������ m.update()�����ش޶�� ��Ź��
						//m-> c �� �ٽ� �������ش�.
						if(flag) { // �����ϸ� //��й�ȣ ���� ���� !
							client.printMemberUpdateTrue();
						}
						else {//��й�ȣ ���� ���� !
							client.printMemberUpdateFalse();
						}
					}

					//c���� ������ ��й�ȣ ���� ���� !
					//���н� ��й�ȣ ���� ���� ���� .


					else if(action==3) { // ȸ��Ż��
						// 1.���� �α��� �� ��Ȳ -> �̹� ����� ���ִ� ��Ȳ
						
						//<�ѱ��ڵ�>
						//String mpw = view.��й�ȣ �Է��غ� (); // ��й�ȣ�� �Է� �ϸ�
						//if(���� �α����� ����� ��й�ȣ(member.getMpw())�� 
						// ����ڰ� �Է��� ��й�ȣ(mpw) �� Ȯ���ϴ� ����) ���� equals
						
						// 		��й�ȣ ����ġ
						//else
						//  	��й�ȣ ��ġ
						
						
						
						String mpw = client.getMpw(); // view���� ��й�ȣ�� �ٽ� �Է¹޵��� ���� �޴´�.
						if(!member.getMpw().equals(mpw)) { // !flag�� ��Ȳ // ������ �ƴ��� üũ 
							// ���� �α����� ����� ��й�ȣ�� ����ڰ� �Է��� ��й�ȣ�� Ȯ���ϴ� ����
							// ���� ��й�ȣ�� �ƴ϶�� ������
							// 2.��й�ȣ�� ����ġ �Ѵٰ� ���� �ϰ� not! �� ���� 
							//��й�ȣ ����ġ
							client.printFalse(); // ��й�ȣ ���� �޼��� ��� 
							continue; // ��й�ȣ�� ��ġ �ʾҴٸ� ~ continue
						}
						// if �� �ȵ��ٸ� ��ġ! ���� ���� ���� 
						//mDAO.delete(member)  << �̰� ��ü�� if������ ����Ǿ�����⶧����
						//boolean flag=mDAO.delete(member);
						//if(flag) �� �����ϱ⶧���� ����˴ϴ�
						if(!mDAO.delete(member)) { // !flag �� ��Ȳ //model.delete(���� �α��� �� ���)�� �� �ȵƴٸ� false
							//ȸ�� ���� ������ �ȵƴٸ� 
							client.printMemberDeleteFalse(); // ȸ�� Ż�� ����
							continue; // �ǹ� : false�� ����Ȯ���� ������ ? ������ ��� 
							// �ٵ� Ȥ�ó� ��Ŀ�� ���� ���� ������츦 ����� ��ȿ���� ������
						}
						
						
						//if(model.delete(���� �α����� ���)){
							// �� ������ true;
					    //}else{
							// �� �ȵ����� false;
						//}
						
						// �ٵ� if������ �� �ȵȻ���� �ɷ����� �� true�� ������ 
						// else�� ������ �ٲ㼭 if���� �� �ȵ� false�� ����.
						// ���ǽĿ� �Ȱɸ��� ������ �� �������� true�̴�.
						
						
						
						// 3.��й�ȣ�� ��ġ�ϸ� �α��� �Ǿ��ִ� ȸ���� ��üȸ����Ͽ��� ����   
						client.printMemberDeleteTrue();  // ȸ�� Ż�� ����
						client.printClientEnd02(); //����� ��� ����
						break;
					}
					// �ߵ����� true 

					// ��й�ȣ�� �ѹ��� Ȯ�� �ϴ� ������ ������ �� ����  // ȸ��Ż�� �Ϸ��� ��й�ȣ�� �Է��� 
					// ��й�ȣ�� ����ġ (������ �ƴҼ� ������) -> ȸ��Ż��x

					// ��й�ȣ ��ġ �� 
					// -> �α����� �Ǿ��ִ� ȸ���� 
					// ��ü ȸ�� ��Ͽ��� ����



					else if(action==4) { // ��ǰ������ // ��ǰ�� �׳� �����ֱ⸸ �ϸ�� 
						// M���� �޾Ƽ� C ��� 
						ArrayList<ProductVO> pdatas=pDAO.selectAll(null);
						client.printProductList(pdatas); // ȸ���������̶� �ƶ��� ����.
					}
					else if(action==5) { // ��ǰ��ϰ˻�_ �̸����� �˻� // �˻��� ��ǰ�� �̸��� �Է¹޾Ƽ� ������� �ȴٴ� �������� �ִ�.
						String name = client.getSearchContent(); // �˻�� ��� ���� �޾ƿ���
						// �˻�� �� �޾ƿ÷� ?
						// �� �˻�� �� ���� �Ѱ��ֱ� 
						ProductVO pVO = new ProductVO (0,name,0,0); // �츮�� �̸��� �ʿ��ϴϱ� 
						pDAO.selectAll(pVO);
						ArrayList<ProductVO> pdatas = pDAO.selectAll(pVO);
						client.printProductList(pdatas);

					}
					else if(action==6) { // ��ǰ��ϰ˻�_�������� �˻�
						//����ڰ� V���� �˻��� �ϰ�ʹٰ� ���ϸ鼭 ��ư�� ������.
						// ������ �˻����� �޾ƿ÷� ? price
						// C�� V���� �˻��� ���� �޾ƿ���� �Ѵ�
						// V�� ����ڿ��� �˻��� ���� ������ �Է¹޾ƿ´�.
						// V�� ������ �޾ƿ� C���� �����Ѵ�.
						ProductVO pVO=client.getSearchFilter();

						// C�� M���� �Ѱܼ� �� ���ݿ� ���� ���� ��� ��ǰ�˻������� �����Ѵ�
						pDAO.selectAll(pVO);
						// M�� ������ �Է¹޾� �� ���ݿ� ���� ������ �˻��Ѵ�.
						// M���� �˻��� ������ C���� �����Ѵ�.
						ArrayList<ProductVO> pdatas=pDAO.selectAll(pVO);
						// C�� V���� �˻��� ������ �����Ѵ�.
						// V�� ����ڿ��� �����ش�.
						client.printProductList(pdatas);
						// C�� View �˻��Ϸ� �ȳ���Ʈ�� ����.


					}
					else if(action==7) { // ��ǰ�˻�_�ְ� �˻�
						ProductVO pVO=new ProductVO(0,"�ְ�",0,0);
						ProductVO data=pDAO.selectOne(pVO);
						client.printProduct(data);
					}
					else if(action==8) { // ��ǰ�˻�_������ �˻�
						ProductVO pVO = new ProductVO(0,"������",0,0);
						ProductVO data = pDAO.selectOne(pVO);
						client.printProduct(data);
					}
				}
			}
			else if(action==3) { // ���α׷�����
				client.printClientEnd01();
				break;
			}
		}
	}
}

