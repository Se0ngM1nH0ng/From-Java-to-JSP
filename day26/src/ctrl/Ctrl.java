package ctrl;

import model.MemberDAO;
import model.MemberVO;
import model.ProductDAO;
import model.ProductVO;
import view.View;

public class Ctrl {
	private MemberDAO mDAO;
	private ProductDAO pDAO;
	private View view;
	private MemberVO member; // ���� �α����� ȸ��
	public Ctrl() {
		mDAO=new MemberDAO();
		pDAO=new ProductDAO();
		view=new View();
	}
	public void startApp() {
		// ���� �α����� ��� <--- ���� �ȿ� ������ ������ �����ϴ� ���ȿ� ����

		while(true) {
			int action=view.printMenu();
			if(action==1) {
				view.printList(pDAO.selectAll(new ProductVO()));
			}
			else if(action==2) {
				// �ǽ�(�̸�,�������� �˻��ϱ�)
				view.printList(pDAO.selectAll(view.funcC()));

				//����ڰ� �Է��� �˻�� ���� �𵨿��� �����͸� �����ͼ� �װ� �ٽ� �信�� �����ְڴ� ---> ���� ����
				//����ڰ� �˻��ϰ� �ʹ� 
				//����Ʈ ����Ʈ�� �ִ°� ��ǥ�̰� 
			}
			else if(action==3) { // �����ϱ�
				int proNum=view.getNum();
				ProductVO pVO=new ProductVO(proNum,"",0,0);
				ProductVO pdata=pDAO.selectOne(pVO);
				if(pdata==null) {
					System.out.println(" �α�: �ش��ǰ����");
					view.printFalse();
					continue;
				}
				if(pdata.getCnt()<=0) {
					System.out.println(" �α�: ��ǰ������");
					view.printFalse();
					continue;
				}

				if(!pDAO.update(pdata)) {
					System.out.println(" �α�: P update()�ȵ�");
					view.printFalse();
					continue;
				}
				member.setTmpPrice(pdata.getPrice()); // ȸ���� ��ǰ �� �ݾ��� !!�󸶸�ŭ(=�ӽú���)!! �÷��� 
				// ���� ���Ǽ������� ���� ���� VO�� ��������� Ȱ���� ����
				

				member.setAction("��Ż����");
				if(!mDAO.update(member)) {
					System.out.println(" �α�: M update()�ȵ�");
					view.printFalse();
					continue;
				}
				view.printTrue();
				// v�� ��ǰ�� �����ߴ��� �Է��� �޾ƿ�
				// �׷� �װ� ��ǰ���Ű� �������� Ȯ�� 
				//���Ű� �ȵɼ� �ִ� ����ex) 
				// ��ǰ ���Ű��� ���� Ȯ��
				//1. ���� ��ǰ���� 
				//2. ����ִ���
				// ���Ű� �����ϴٸ� 
				// ���Ÿ� ����
				//���Ÿ� �ϸ� ��� --
				// ����� total ++
				// ����ȭ�� 
			}
			else if(action==4) { // ȸ������
				if(!mDAO.insert(view.signin())) {
					view.printFalse();
					continue;
				}
				view.printTrue();
				//        	 MemberVO mVO=view.signin();
				//        	 mDAO.insert(mVO);

				//v���� ȸ�������� ������ �Է�
				//v�� �Է��� ������ c�� �޾Ƽ� 
				//m���� �ǳ���
				//m���� ����� ��ȯ�޾Ƽ� 
				//�´� ����� v�� ���� 
			}
			else if(action==5) { // �α���
				// v���� �α����� �õ��Ѵ� 

				//===========================================================================
				
				// �����ڵ�
				
				//MemberVO mVO = view.signin();
				//MemberVO mdata=mDAO.selectOne(mVO);
				member=mDAO.selectOne(view.signin()); // �α��� ���� �� //�װ� m���� �༭ Ȯ���ҰŴ� // output ȸ������
				// member�� �α��� �� ���� ����
		
				//===========================================================================
				//if(mdata==null) {
				//     view.printFalse();
				//     continue;
				//}
				//member= mdata;
				//view.printTrue();
				if(member==null) { // ȸ�������� null�̸� �α����� �ȵǾ��ִ�
					view.printFalse(); // ������ �α��� ����
					continue; // ó������ 
				}
				view.printTrue();
			}
			
			else if(action==6) { // �α׾ƿ�
				member=null;
			}
			
			else if(action==7) { // ����������
			
				// �α����� ���;� ����� ���� �� �� �ִ� 
				// �α����� �Ǿ��ֳ� ? �� ���� ���� �غ����� 
				// ���� ���Ȯ���� �ϰ� ��ġ�ϸ� 
				// ���ο� ������� ���� 
				
				//===========================================================================
				
				//if(�� �α��� �ȵǾ������� ){
				//		�ڷΰ� ;
				//}
				if(member==null) { // �α����� �ȵǾ� �ִ� // �α��� ������  
					view.printFalse();
					continue;
				}
				
				//===========================================================================
				
				// �α��� �߾� ?
				//��� Ȯ�κ��� �Ұ�
				//C�� "���� �α����� ȸ���� ����"�� �˰� �ֱ� ����! ---> ������� ������ Ȯ�� ���� 
				//�α����� �����͸� mVO�� ��� �ٴϱ⶧���� �����Ѱ� 
				
				// member ---> memberVO�� ������ (ȸ��ID , ȸ��PW, �� �ݾ�)
				String mpw=view.funcA(member); // ȸ��ID�� input���� �־��ְ� ����ڰ� �Է��� ��й�ȣ�� ��ȯ �޾Ҵ�.
				if(!member.getMpw().equals(mpw)) { //ȸ�������� �ִ� PW�� �����Է��� PW�� ���� �ʴٸ�
					view.printFalse(); // �α��� ���д�
					continue; // ó������ 
				}
				
				//===========================================================================				
				
				//���ο� ����� ���´� .
				//�̶� DB�� �ʿ��ϴ�. 
				//��� DAO�� ������Ʈ �Ұž� member �� �ٲ��� 

				//��� �¾� ?
				//��� �ٲ��� 
				//��� �ٲٰ��� �α׾ƿ��� �Ǿ�� �Ѵ�. 

				String newMpw=view.funcB(member.getMpw()); //ȸ���� PW�� input���� ���Դ�. ���ο� ��й�ȣ�� ��ȯ �޾Ҵ�.
				member.setTmpMpw(newMpw); //�ӽú��� TmpMpw�� ���ο� ��й�ȣ�� �־��� // �̷��� ��� �Ⱥ����� �𵨷� ���̷�Ʈ�� ������ �ִ�.
				// �𵨿����� getTmpMpw�� ���� ���⼭ set���� ��������
				member.setAction("�������"); // �̰� ���� �ӽú��� setAction ���� ������ Model ���� getAction ���� ����
				if(!mDAO.update(member)) { // update�� ���� �ʾҴٸ�
					view.printFalse(); // ����
					continue; // ó������ 
				}
					// update�� �� �ƴٸ�

				member=null;  // ��й�ȣ�� ����Ǿ����� �α׾ƿ��� �����ش�
				view.printTrue(); // ��й�ȣ ���� ���� 
				
				
				//===========================================================================							
				
				//�ӽú����� �������� ���� �����Ϳ� ħ���� ���� �ʱ� ������ ���ο� ��й�ȣ���� �ӽú����� ��Ƴ��´�. 			
				//�ӽú����� ��Ÿ ���� �̷��� �� ������ �ȵ� !!! ���� 
				// C�� "���� �α����� ȸ���� ����"�� �˰��ֱ⶧��!
			}
			else if(action==8) { // ȸ�� Ż�� 
				if(member==null) { // �α��� �ƴ��� �ȵƴ��� ���� üũ 
					view.printFalse();
					continue;
				}

				if(!mDAO.delete(member)) { // input���� ȸ�� ������ ���� ������ ���� �ʾҴٸ� 
					view.printFalse(); // ����
					continue;
				}
				
				// �� ���� �Ǿ��ٸ�
				member=null; // �α��� ������ Ǯ������� // �α��� ������ Ǯ�����. 
				view.printTrue();
				// ȸ���� Ż�� �ϰڴ� 
				// �׷�? �׷� m���� ���� Ż������ �˷��� 
				// �׷� m �� Ż�� ���ٰž� 
				// �α����� �س���� Ż�� �Ҽ� �ִ� 
			}
			else {
				break;
			}
		}
	}
}