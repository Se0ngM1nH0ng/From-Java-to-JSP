package controller;

import java.util.ArrayList;

import model.Crawling;
import model.MovieDAO;
import model.MovieVO;
import view.View;

public class Controller {

	private MovieDAO mDAO;
	private View view;
	public Controller() {
		mDAO=new MovieDAO();
		view=new View();
	}

	public void startApp() {
		
		view.printMenu();

		ArrayList<MovieVO> mdatas=Crawling.sample(); //ũ�Ѹ��� ������ �迭����Ʈ�� �����Ѵ�.
		// Q. �迭����Ʈ�� �޾ƿ��µ�,
		// insert()�� �׷� 1���ϳ���?
		// A. NO! insert()�� �迭����Ʈ.size()��ŭ for��(�ݺ�) �����ϴ�!
		for(int i=0;i<mdatas.size();i++) { // ������ �����ŭ
			MovieVO mdata=mdatas.get(i); // �������� ��´�.
			boolean flag=mDAO.insert(mdata); //���� �߰� // boolean Ÿ���̶� flag
			if(!flag) { // false�Ͻ�
				view.printFalse();
				return;
			}
		}

		view.printTrue(); // �Ȱ�ġ�� �������� ����
		 




		// selectAll ��ü���
		MovieVO mVO=new MovieVO(0,"",null); // ��ĭ���� �ѱ�� ""
		ArrayList<MovieVO> mdatas2=mDAO.selectAll(mVO); // %% �Ͻ� ��ü ����̹Ƿ� �˻��� ��ü ����� ���ĺ��� �ִ�.
		view.printMovieList(mdatas2);// ����� ������ش�.


		// selectOne �ϳ� ���
		int num1=view.getNum(); // ���ڸ� ����ڿ��� �޾Ƽ� �䰡 �Ѱ��ش�.
		MovieVO mVO1=new MovieVO(num1,null,null); // �𵨿��� ������ PK�� �Ѱ���  
		MovieVO mdata1=mDAO.selectOne(mVO1); // ����ڿ��� ���� ��ȣ �ڸ� ��ȭ�� �ҷ��� 
		view.printMovie(mdata1); // ��ȭ�� ������ش�.


		// delete �����ϱ� 
		int num2=view.getNum(); // ����ڿ��� ��ȣ�� �޾� 
		MovieVO mVO2=new MovieVO(num2,null,null); // pk�� �Ѱ��� 
		boolean flag2=mDAO.delete(mVO2); // ������ boolean Ÿ���̶� flag ���� 
		if(flag2) { // true 
			view.printTrue();
		}
		else { // false
			view.printFalse();
		}

		
		
		// update ��ȭ ��ȣ �ް� �̸� �޾Ƽ� �� �ش��ϴ� ��ȣ�� ��ȭ �̸� �ٲ��� 
		int num3=view.getNum(); // ��ȣ�� �޾� 
		String name3=view.getName(); // �̸��� �Է� �޾� 
		MovieVO mVO3=new MovieVO(num3,name3,null); // �Ѱ��� �𵨷� 
		boolean flag3=mDAO.update(mVO3); //������ ��ȭ ��ȣ�� �̸��� ���� �ٲٰ� �;� ? �ٲ��� 
		if(flag3) { // true
			view.printTrue();
		}
		else { // false
			view.printFalse();
		}


		
		
		// selectAll �̸� �˻� 
		String name4=view.getName(); // �̸��� �Է¹޾��� 
		MovieVO mVO4=new MovieVO(0,name4,null); // �̸� �κп� �޾Ƽ� �𵨷� �Ѱ��ٰ� 
		ArrayList<MovieVO> mdatas4=mDAO.selectAll(mVO4); // �˻��� �ش��ϴ� �ܾ� ��� ��¹޾Ҿ� 
		view.printMovieList(mdatas4); // ��� ��� ���� 






	}












}
