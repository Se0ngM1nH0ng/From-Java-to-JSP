package ctrl;

import java.util.ArrayList;

import model.DrinkDAO;
import model.DrinkVO;
import view.DrinkView;

public class DrinkCtrl {
	private DrinkView view;
	private DrinkDAO dao;
	public DrinkCtrl() {
		view=new DrinkView();
		dao=new DrinkDAO();
	}

	public void startApp() {
		while(true) {// while������ �ѹ� �� ���մ�. 
			// ��ٱ��ϰ� ����Ǳ� ������ ����� ������ �ʴ� ���� 

			System.out.println(" �α�: ����ڰ� ���� �����մϴ�."); 
			// ��ٱ��ϸ� �����ϱ� ���� ���� �����Ѵٴ� ��
			// �α�
			//  : Ȯ���� ���� ��
			//  : ���� ���񽺿����� ��� xxx
			ArrayList<DrinkVO> cart=new ArrayList<DrinkVO>(); 
			// īƮ��� ������ �ϳ� ���� �����.
			// ����ڰ� ���� �����ϸ� ��ٱ��ϰ� �ʱ�ȭ �žߵȴ�
			// ��ٱ����� Ÿ���� ArrayList 
			// ��ٱ��� ��ٱ��� = �ʱ�ȭ;


			while(true) {
				int action=view.printMenu();

				if(action==1) { // �����߰�
					String name=view.getDrinkName(); // �̸��� �Է¹ް�
					int price=view.getDrinkPrice(); // ���ݵ� �Է¹ް�
					int cnt=view.getDrinkCnt(); // ������ �Է¹ް�
					DrinkVO vo=new DrinkVO(0,name,price,cnt); 
					// vo�� ��¦ ���� ���� �״����� ���� �ʴ� ģ�� 
					// pk�� ���� ���� �׳� 0���� ����
					// �䷸�� ���� ���ְ� ����ϱ� // ���� 4��
					// ���������ʾƵ��Ǵ� ������ 0,null ������ ����

					System.out.println("CTRL: vo: "+vo); // vo �α� ����
					// DAO�� CRUD���� �����ؾ��ϴ� ���� ����

					if(dao.insert(vo)) { // DrinkVO�� vo��� ���� �߰�����  
						view.printTrue(); // true�� ����
					}
					else { 
						view.printFalse(); // false�� ����
					}
				}
				else if(action==2) { //���� ��� ��� 
					ArrayList<DrinkVO> datas=dao.selectAll(new DrinkVO(0,null,0,0)); 
					// ��Ͽ� ��ȯ�Ǵ� ���� ������ null�� ������ ������ �߹Ƿ� 
					// �ʿ��� ���� ������ �ʱ�ȭ ���ֱ� 
					//��ü ����� �ҷ��ðǵ� 
					// ���ڰ� vo�ε� �������� vo�� ������� �ʾƼ� 
					// selectAll(vo ������ ����ϴ� �� ���� ������)
					// selectAll(null) null ���� �־��ش�.
					// �ʱⰪ pk =0, �̸� = null, ���� = 0, ���� =0 ;
					view.printDrinkList(datas); // ����� �����͵��� forEach������ �� �ҷ����� 
				}
				else if(action==3) { // �����ϱ�
					int num=view.getDrinkNum(); // ���� ��ȣ �Է� �ޱ�
					int cnt=1; // ������ 1�� ���س���.
					DrinkVO vo=new DrinkVO(num,null,0,-cnt);  
					// �����ϰ��� �ϴ� ���� �־��ָ� �ȴ�.
					// ���� ���ſ��� ������ �����ϸ� ����� ����� �ϱ� ������
					// -cnt��� ǥ�����ش� 
					// �Է��ϸ� ������ �ÿ� cnt�� ���ټ� �ְ�

					if(dao.update(vo)) {
						// ���ſ� �������������� ��ٱ��Ͽ� �ش� ��ǰ�� �߰�
						// ���ſ� ���� �ߴ�~~ �׷��� 
						DrinkVO data=dao.selectOne(vo); 
						//�𵨿��� PK,name,price�� �ٷ� ? �ѵ� ���� data�� �ٷ�?
						// data �ϳ� �ϱ� selectOne
						// �̶� selectOne �ؼ� ���� �����ʹ� ���Ǳ⿡ ����ִ� ��� ������ �Ǿ��ֱ� ������
						// data�� ���� ���� ���ϴ� ���� ��������� 


						// data�� ������ ��Ƽ� �ϳ� ������ //���纻�� �����Դ�.
						// �ٵ� ���纻�� ������ �����ϹǷ� �޾ƿ� �����͸� �״�� ����Ѱ� 
						// ��Ͽ� �ݶ� 5�� �ִµ� 
						// ���� ���� ������ 1���� �ݶ� ������� �ϹǷ� 
						// ���� ���� �ݶ� 1�� ¥���� data�� �ٽ� �����Ѵ�.
						// data�� ����
						data.setCnt(cnt); 
						// �� PK,name,price�� ���Ǳ⿡ ����� ��ǰ ������ ����������,
						// �� cnt�� ����ڰ� �Է��ߴ� ������ �����ؾ���! 


						// Ŀ���͸���¡ ������ ���⶧���� flag �˰����� ��� 
						boolean flag=false; // īƮ�� �װ� �־����� ��������~
						int index=0; // �ε��� ��ȣ ���� ���� 
						for(int i=0;i<cart.size();i++) { //��ٱ����� ũ�⸸ŭ
							if(data.equals(cart.get(i))) { // ����ڰ� ������ ��ǰ�̶� īƮ ��ǰ�� ������?
								//������ �ε��� ��ȣ �ڸ��� īƮ�� �� �ε��� ��ȣ�� ���� ��ǰ�϶�
								//�����ڰ� �ȵǼ� �������̵�
								index=i;  //�ε��� ��ġ�� ��� ���ѳ����� �ٷ� �߰��ϸ� �Ǵϱ�
								// �ε��� ��ȣ�� ������� //�ε��� ��ȣ ǥ��
								flag=true; // true�϶� �۵� // ������ ������ �۵�
							}
						}
						if(flag) {
							// true �϶� �̰͵� true�� �Ǹ鼭 
							// �ε�����ȣ�ڸ��� �������� �ٽ� ���� 
							// ���� ǰ���̴ϱ� 1-> 2�� ������ ���� 
							// īƮ�� �ε��� ��ȣ �ڸ��� ������ �ٽ� ����
							// ������ ���� + ������ �߰� 
							cart.get(index).setCnt(cart.get(index).getCnt()+cnt);
							// ���� ������ �߰��� ������ ���� 
						}
						else {
							// Ȥ�� cart�� ���� ��ǰ�̾��� ? �׷��� add
							cart.add(data); // �����Ϳ� ���� : PK,name,price,cnt �˾ƾ��Ѵ�
							// �ٵ� ! ���� �����Ϳ��� PK,name,price�� �˾Ƴ��� �ִµ�
							// cnt�� input ������ ���� �ִ�.
							// ��ٱ���.add(������ ����� ���� : ���� ������ ��ǰ �ֱ�);
							// ��ٱ��Ͽ��� ������ ���� ���� �׸��� ���� �������� �ٸ� ��ǰ�̶�� 
							// ��� ��ø�����ʰ� ���� 1��, ���� 1�� �̷��� ����
							// �� , ���� Ŀ���͸���¡ �Ҽ� �ִ� ��ǰ�� 1��, 1�� �̷��� ����
							//ex)�Ƹ޸�ī�� �÷�����, �Ƹ޸�ī�� �������� ��� 
							// ���� ������ ��ǰ�� �������� 
						}

						view.printDrinkList(cart); // ��ٱ��Ͽ� �߰��� �׸� ���� 
						view.printTrue();
					}
					else {
						view.printFalse();
					}
				}
				else if(action==4) { // ���� ����
					int num=view.getDrinkNum();
					DrinkVO vo=new DrinkVO(num,null,0,0);
					if(dao.delete(vo)) {
						view.printTrue();
					}
					else {
						view.printFalse();
					}
				}
				else if(action==5) { // ��� �߰�
					int num=view.getDrinkNum();
					int cnt=view.getDrinkCnt();// ����߰��� �Է��� ��ŭ ���ϴ°�
					DrinkVO vo=new DrinkVO(num,null,0,cnt); //������ �󸶸�ŭ �߰��ҷ� ?
					if(dao.update(vo)) {
						view.printTrue();
					}
					else {
						view.printFalse();
					}
				}
				else if(action==6) { // ���� �˻�
					String name=view.getDrinkName(); // �� �� �˻��ҷ� ? �̸��ޱ�
					// �״��� ����ϱ� 
					ArrayList<DrinkVO> datas=dao.selectAll(new DrinkVO(0,name,0,0));
					view.printDrinkList(datas);
				}
				else if(action==7) { // ���α׷� ����
					view.printEnd();
					break;
				}
			}
			System.out.println(" �α�: ����ڰ� �����߽��ϴ�.");
			cart.clear();
		}
	}
}
