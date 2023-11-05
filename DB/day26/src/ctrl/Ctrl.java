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
	private MemberVO member; // 현재 로그인한 회원
	public Ctrl() {
		mDAO=new MemberDAO();
		pDAO=new ProductDAO();
		view=new View();
	}
	public void startApp() {
		// 현재 로그인한 멤버 <--- 여기 안에 넣으면 어플을 실행하는 동안에 실행

		while(true) {
			int action=view.printMenu();
			if(action==1) {
				view.printList(pDAO.selectAll(new ProductVO()));
			}
			else if(action==2) {
				// 실습(이름,가격으로 검색하기)
				view.printList(pDAO.selectAll(view.funcC()));

				//사용자가 입력한 검색어를 보고 모델에서 데이터를 가져와서 그걸 다시 뷰에서 보여주겠다 ---> 한줄 설명
				//사용자가 검색하고 싶대 
				//프린트 리스트에 넣는게 목표이고 
			}
			else if(action==3) { // 구매하기
				int proNum=view.getNum();
				ProductVO pVO=new ProductVO(proNum,"",0,0);
				ProductVO pdata=pDAO.selectOne(pVO);
				if(pdata==null) {
					System.out.println(" 로그: 해당상품없음");
					view.printFalse();
					continue;
				}
				if(pdata.getCnt()<=0) {
					System.out.println(" 로그: 상품재고없음");
					view.printFalse();
					continue;
				}

				if(!pDAO.update(pdata)) {
					System.out.println(" 로그: P update()안됨");
					view.printFalse();
					continue;
				}
				member.setTmpPrice(pdata.getPrice()); // 회원의 상품 총 금액을 !!얼마만큼(=임시변수)!! 올려줘 
				// 개발 편의성때문에 새로 만든 VO의 멤버변수를 활용한 로직
				

				member.setAction("토탈변경");
				if(!mDAO.update(member)) {
					System.out.println(" 로그: M update()안됨");
					view.printFalse();
					continue;
				}
				view.printTrue();
				// v가 상품뭐 구매했는지 입력을 받아옴
				// 그럼 그거 상품구매가 가능한지 확인 
				//구매가 안될수 있는 예시ex) 
				// 상품 구매가능 여부 확인
				//1. 없는 상품인지 
				//2. 재고있는지
				// 구매가 가능하다면 
				// 구매를 진행
				//구매를 하면 재고 --
				// 사용자 total ++
				// 성공화면 
			}
			else if(action==4) { // 회원가입
				if(!mDAO.insert(view.signin())) {
					view.printFalse();
					continue;
				}
				view.printTrue();
				//        	 MemberVO mVO=view.signin();
				//        	 mDAO.insert(mVO);

				//v에서 회원가입할 정보를 입력
				//v가 입력한 정보를 c가 받아서 
				//m에게 건네줌
				//m에게 결과를 반환받아서 
				//맞는 결과를 v와 연결 
			}
			else if(action==5) { // 로그인
				// v에서 로그인을 시도한대 

				//===========================================================================
				
				// 간결코드
				
				//MemberVO mVO = view.signin();
				//MemberVO mdata=mDAO.selectOne(mVO);
				member=mDAO.selectOne(view.signin()); // 로그인 정보 줘 //그거 m한테 줘서 확인할거다 // output 회원정보
				// member에 로그인 된 정보 저장
		
				//===========================================================================
				//if(mdata==null) {
				//     view.printFalse();
				//     continue;
				//}
				//member= mdata;
				//view.printTrue();
				if(member==null) { // 회원정보가 null이면 로그인이 안되어있다
					view.printFalse(); // 없으면 로그인 실패
					continue; // 처음으로 
				}
				view.printTrue();
			}
			
			else if(action==6) { // 로그아웃
				member=null;
			}
			
			else if(action==7) { // 마이페이지
			
				// 로그인을 들어와야 비번을 변경 할 수 있다 
				// 로그인이 되어있나 ? 를 먼저 생각 해봐야함 
				// 현재 비번확인을 하고 일치하면 
				// 새로운 비번으로 변경 
				
				//===========================================================================
				
				//if(너 로그인 안되어있으면 ){
				//		뒤로가 ;
				//}
				if(member==null) { // 로그인이 안되어 있다 // 로그인 먼저해  
					view.printFalse();
					continue;
				}
				
				//===========================================================================
				
				// 로그인 했어 ?
				//비번 확인부터 할게
				//C가 "현재 로그인한 회원의 정보"를 알고 있기 때문! ---> 약식으로 빠르게 확인 가능 
				//로그인한 데이터를 mVO로 들고 다니기때문에 가능한것 
				
				// member ---> memberVO의 정보들 (회원ID , 회원PW, 총 금액)
				String mpw=view.funcA(member); // 회원ID를 input으로 넣어주고 사용자가 입력한 비밀번호를 반환 받았다.
				if(!member.getMpw().equals(mpw)) { //회원정보에 있던 PW와 지금입력한 PW가 맞지 않다면
					view.printFalse(); // 로그인 실패다
					continue; // 처음으로 
				}
				
				//===========================================================================				
				
				//새로운 비번이 들어온다 .
				//이때 DB가 필요하다. 
				//멤버 DAO야 업데이트 할거야 member 얘 바꿔줘 

				//비번 맞아 ?
				//비번 바꾸자 
				//비번 바꾸고나면 로그아웃이 되어야 한다. 

				String newMpw=view.funcB(member.getMpw()); //회원의 PW가 input으로 들어왔다. 새로운 비밀번호를 반환 받았다.
				member.setTmpMpw(newMpw); //임시변수 TmpMpw에 새로운 비밀번호를 넣어줌 // 이러면 묶어서 안보내도 모델로 다이렉트로 보낼수 있다.
				// 모델에서는 getTmpMpw로 받음 여기서 set으로 날렸으니
				member.setAction("비번변경"); // 이거 또한 임시변수 setAction 으로 날리고 Model 에서 getAction 으로 받음
				if(!mDAO.update(member)) { // update가 되지 않았다면
					view.printFalse(); // 실패
					continue; // 처음으로 
				}
					// update가 잘 됐다면

				member=null;  // 비밀번호가 변경되었으니 로그아웃을 시켜준다
				view.printTrue(); // 비밀번호 변경 성공 
				
				
				//===========================================================================							
				
				//임시변수를 가져오면 원래 데이터에 침범이 되지 않기 때문에 새로운 비밀번호값을 임시변수에 담아놓는다. 			
				//임시변수는 오타 띄어쓰기 이런게 다 적용이 안됨 !!! 주의 
				// C가 "현재 로그인한 회원의 정보"를 알고있기때문!
			}
			else if(action==8) { // 회원 탈퇴 
				if(member==null) { // 로그인 됐는지 안됐는지 먼저 체크 
					view.printFalse();
					continue;
				}

				if(!mDAO.delete(member)) { // input으로 회원 정보가 들어가서 삭제가 되지 않았다면 
					view.printFalse(); // 실패
					continue;
				}
				
				// 잘 삭제 되었다면
				member=null; // 로그인 정보를 풀어줘야함 // 로그인 정보를 풀어줬다. 
				view.printTrue();
				// 회원이 탈퇴 하겠대 
				// 그래? 그럼 m한테 누가 탈퇴할지 알려줘 
				// 그럼 m 이 탈퇴 해줄거야 
				// 로그인을 해놨어야 탈퇴를 할수 있다 
			}
			else {
				break;
			}
		}
	}
}