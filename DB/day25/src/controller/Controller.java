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

		ArrayList<MovieVO> mdatas=Crawling.sample(); //크롤링한 샘플을 배열리스트에 저장한다.
		// Q. 배열리스트를 받아오는데,
		// insert()를 그럼 1번하나요?
		// A. NO! insert()를 배열리스트.size()만큼 for문(반복) 돌립니다!
		for(int i=0;i<mdatas.size();i++) { // 데이터 사이즈만큼
			MovieVO mdata=mdatas.get(i); // 정보들을 담는다.
			boolean flag=mDAO.insert(mdata); //정보 추가 // boolean 타입이라 flag
			if(!flag) { // false일시
				view.printFalse();
				return;
			}
		}

		view.printTrue(); // 안거치고 내려오면 성공
		 




		// selectAll 전체출력
		MovieVO mVO=new MovieVO(0,"",null); // 빈칸으로 넘기기 ""
		ArrayList<MovieVO> mdatas2=mDAO.selectAll(mVO); // %% 일시 전체 출력이므로 검색과 전체 출력을 합쳐볼수 있다.
		view.printMovieList(mdatas2);// 목록을 출력해준다.


		// selectOne 하나 출력
		int num1=view.getNum(); // 숫자를 사용자에게 받아서 뷰가 넘겨준다.
		MovieVO mVO1=new MovieVO(num1,null,null); // 모델에게 보낼때 PK를 넘겨줌  
		MovieVO mdata1=mDAO.selectOne(mVO1); // 사용자에게 받은 번호 자리 영화를 불러와 
		view.printMovie(mdata1); // 영화를 출력해준다.


		// delete 삭제하기 
		int num2=view.getNum(); // 사용자에게 번호를 받아 
		MovieVO mVO2=new MovieVO(num2,null,null); // pk로 넘겨줘 
		boolean flag2=mDAO.delete(mVO2); // 삭제는 boolean 타입이라 flag 써줘 
		if(flag2) { // true 
			view.printTrue();
		}
		else { // false
			view.printFalse();
		}

		
		
		// update 영화 번호 받고 이름 받아서 그 해당하는 번호의 영화 이름 바꿔줘 
		int num3=view.getNum(); // 번호를 받아 
		String name3=view.getName(); // 이름도 입력 받아 
		MovieVO mVO3=new MovieVO(num3,name3,null); // 넘겨줘 모델로 
		boolean flag3=mDAO.update(mVO3); //선택한 영화 번호의 이름을 뭘로 바꾸고 싶어 ? 바꿔줘 
		if(flag3) { // true
			view.printTrue();
		}
		else { // false
			view.printFalse();
		}


		
		
		// selectAll 이름 검색 
		String name4=view.getName(); // 이름을 입력받아줘 
		MovieVO mVO4=new MovieVO(0,name4,null); // 이름 부분에 받아서 모델로 넘겨줄게 
		ArrayList<MovieVO> mdatas4=mDAO.selectAll(mVO4); // 검색에 해당하는 단어 목록 출력받았어 
		view.printMovieList(mdatas4); // 목록 출력 해줘 






	}












}
