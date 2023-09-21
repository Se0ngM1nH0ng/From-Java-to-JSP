package ctrl;

import java.util.ArrayList;

import model.MemberDAO;
import model.MemberVO;
import model.ProductDAO;
import model.ProductVO;
import view.AdminView;
import view.ClientView;

public class Ctrl { // DAO ,view 두개 
	private MemberDAO mDAO; // 회원가입한 사용자
	private ProductDAO pDAO; // 상품 
	private AdminView admin;
	private ClientView client;
	private MemberVO member; // 현재 로그인한 회원정보 // 멤버변수로 관리 해볼수 있다.
	//	private CommonView common;// 두개를 다 이용할때 common 을 붙임 // 어디에서나 사용할 법ㅁ한 로직이 담겨있구나 

	public Ctrl() { 
		mDAO=new MemberDAO();
		pDAO=new ProductDAO();
		admin=new AdminView();
		client=new ClientView();
		member=null; // 자동로그인을 해제하면 이게 초기화가 된다  
		// 세션 로그인 데이터 라고 부름 ~ 나중에 웹가서 배우기  
		// 프로그램을 실행한다고 해서 , 갑자기 로그인 되지는 않기 때문에 null 로 초기화 
	}

	public void startApp() {
		while(true) {
			int action=client.printClientMenu01(); // 프로그램 모드 
			if(action==1234) { // 관리자 모드 진행  1234야?
				while(true) { // 관리자 모드 진입
					action=admin.printAdminMenu();
					if(action==1) { // 회원목록 출력
						//1. 사용자가 관리자인 상황 
						//if(action==1) // 2. 관리자가 회원목록볼래~

						//model.selectAll(); // 모델.회원목록줘(); 
						// 3. V가 C한테 말합니다. 회원목록보겠다는데?
						// 4. C가 아, 회원목록데이터가 필요하구나? ㅇㅋ
						// 5. M한테 회원목록 좀 줘~
						// 6. M이 selectAll()합니다.

						ArrayList<MemberVO> mdatas=mDAO.selectAll(null); //selectAll하려면
						//인자가 있어야 하는데 넘겨줄 인자가 우리에겐 없기 때문에 그냥 null로 한다.
						// 7. AL<MVO>가 반환되고 C는 그걸-

						//view.회원 목록 출력(datas);
						admin.printMemberList(mdatas); // view 목록
						// 8. -V한테 줍니다.


						// 줄인 코드
						//admin.printMemberList(mDAO.selectAll(null));
					}
					else if(action==2) { // 관리자 모드 종료 
						admin.printAdminEnd();
						break;
					}
				}
			}
			else if(action==1) { // 회원가입
				//				int action=client.printClientMenu01(); 
				// 1. 사용자가 CONSOLE에 회원가입 할래 1번 입력
				//2. V는 입력한 값을 C한테 전달 -> 전달된값 action 

				//				else if(action==1) 
				// 3. C는 아 회원가입 하고 싶구나 ? ㅇㅋ


				// 아이디,비밀번호, 이름 입력까지 해서 그것을 전달 하는 것 까지 
				MemberVO mVO = client.signUp(); // 정보들을 mVO에 담는다.
				//회원가입 정보 = view.회원가입화면(); 뷰야 회원가입 화면 (); 띄워야지 
				// 그러면 회원가입 정보를 받아와야지 
				//4.C는 V한테 회원가입할 정보를 입력받아오라고 지시  // client.signup 
				//5.V는 사용자한테 회원가입 창 보여줌 // 회원가입 입력을 받도록 세팅
				//6.사용자는 정보를 입력  // 사용자가 입력을 완료 
				//7.V는 사용자가 입력한 정보를 C한테 전달  signup에서 수행한 것들 mVO에 담음 // 회원가입 정보

				// 회원가입이니까 mDAO가 맞다.
				boolean flag = mDAO.insert(mVO); // true로 해놓은 상태 // 회원가입이니까 mDAO와 pDAO 둘중 ---> mDAO가 맞다.
				//boolean 성공실패여부 = mDAO.insert(a);
				//8.C는 이 정보를 M한테 전달  // model아 회원가입 정보좀 줘야겠다. // model.회원가입(a); // 회원가입은 == insert에 해당
				//9.M은 회원가입을 수행 ---> model insert쪽에서 기능 수행
				// boolean 성공실패 여부 = model.insert(a);
				//10.M은 insert()가 잘 되었는지 아닌지를 T,F 반환 ---> boolean


				if(flag) {//성공했어 ?
					client.signUpTrue();//view.성공화면();
				}else {
					client.signInFalse();// view.실패화면();
				}
				//11.C는 결과에 따라 맞는 V화면을 보여줄수 있도록 지시
				//12.사용자는 V가 보여주는 화면에 보게됨 


				// 코드를 줄이면 이렇게 변함 
				//				if(mDAO.insert(client.signUp())) {
				//					client.signUpTrue();
				//				}
				//				else {
				//					client.signUpFalse();
				//				}
			}
			else if(action==2) { // 로그인

				// 아이디입력해봐! 라고 V가 사용자에게 요청
				// 비밀번호도 같이 입력해
				MemberVO mVO = client.signIn(); //로그인 할거야 // 아이디랑 비번 입력하는 메서드 
				//mVO에는 사용자가 입력한 아이디, 비밀번호가 저장되어 있다!!
				// 회원가입 할때도 썼던 메서드


				//MemberVO mdata=mDAO.selectOne(mVO);
				// mdata에는 유효한 사용자 정보 or null
				
				
				// C는 이 정보가 있는지, 그리고 맞는지(==유효한지) //이 아이디가 있니? 이 회원이 존재해?
				member=mDAO.selectOne(mVO); // model을 실행 시켜야 할 때
				// 있는지 없는지 좀 알려줘  // 등록된 정보에 있는 애인지 알려줘
				// 유효한 사용자 정보 == "현재 로그인한 회원"---> member 
				// 반환된 애가 현재 로그인 한 애 다. 
				// 로그인에 성공을 해서 반환된 정보가 로그인에 성공한 애 이다.
				
				// 하나의 데이터를 요구하는 상황 이라서 
				// 위의 여부를 M한테 판단을 부탁함
				//  --->> selectOne() // 로그인할때 등록된 아이디 인지 아닌지


				if(member==null) { //없는 아이디랑 비번이면 // 로그인이 안된것 
					// member가 null 이니? 그러면 너 로그인 못해
					//null을 반환 == 없거나, 비밀번호가 틀림!
					// -> 로그인 실패 V
					//  => 프로그램 모드에 계속 있어야함...
					client.signInFalse();
					continue; // 다시 최상단으로 올라간다. 
					// 프로그램 모드에 계속 존재
				}
				//로그인 성공
				client.signInTrue(); // 로그인이 된것 
				// M은 VO를 반환 == 존재하는 회원
				// -> 로그인 성공 V
				//  => 다음 스텝으로 이동 // 또 다른 while문

				// 새로운 루프 시작 
				while(true) { // 로그인을 정상적으로 진행 됐다면 // 사용자 모드로 진입 
					action=client.printClientMenu02(member); // 로그인된 사용자의 정보를 넘겨 받았다.
					if(action==1) { // 로그아웃
						//사용자 모드를 종료하고 프로그램 모드로 나가는것 
						
						// 현재 로그인한 회원 이기 때문에 

						// 사용자가 로그아웃을 원하면, 
						
						member=null; // 현재로그인한 회원들이기 때문에
						//C에 mdata가 현재 존재하는데, 이걸 
						//제거하고 

						//로그아웃이 되었음을 사용자에게 알려주자 !
						//만약 DB가 건드려 진다면 v->c->m->c->v 이지만 
						//로그아웃은 M을 부르는 일이 없다 . 
						//로그아웃은 DB를 건드리지 않고 m부분을 건드리지 않기 때문에 V->C->V로 진행 

						client.logout(); // 로그아웃합니다
						client.printClientEnd02(); // 사용자 모드 종료
						break;
					}
					else if(action==2) { // 마이페이지
						// 마이페이지
						//사용자가 마이페이지를 원하여 action으로 들어온다.
						// 뷰가 비번을 입력받음
						//client.printMpw(); // 이걸 받아서 어디다 저장하고 넘겨야지 !
						String mpw = client.printMpw(member);   
						// String 으로 반환 했으니 무조건 String에 담아
						//v에서 변경할 정보를 입력받는다.
						//(비밀번호 변경 시 비밀번호를 입력받는 메서드 활용)

						//뷰가 비번을 c에게 전달. 객체 하나 생성
						MemberVO mdata = new MemberVO(member.getMid(),mpw,null); 
						// c는 이걸 m에게 묶어서 보낼건데 
						// 일단 객체 공간에 담는다.
						// 전달만 할때


						boolean flag=mDAO.update(mdata); // model을 실행 시켜야 할때 
						//c->model로 묶어서 보낸 정보를 m.update()수행해달라고 부탁함
						//m-> c 로 다시 전달해준다.
						if(flag) { // 성공하면 //비밀번호 변경 성공 !
							client.printMemberUpdateTrue();
						}
						else {//비밀번호 변경 실패 !
							client.printMemberUpdateFalse();
						}
					}

					//c에서 성공시 비밀번호 변경 성공 !
					//실패시 비밀번호 변경 실패 띄우기 .


					else if(action==3) { // 회원탈퇴
						// 1.현재 로그인 한 상황 -> 이미 멤버에 들어가있는 상황
						
						//<한글코딩>
						//String mpw = view.비밀번호 입력해봐 (); // 비밀번호를 입력 하면
						//if(현재 로그인한 사람의 비밀번호(member.getMpw())와 
						// 사용자가 입력한 비밀번호(mpw) 를 확인하는 로직) 서로 equals
						
						// 		비밀번호 불일치
						//else
						//  	비밀번호 일치
						
						
						
						String mpw = client.getMpw(); // view에게 비밀번호만 다시 입력받도록 값을 받는다.
						if(!member.getMpw().equals(mpw)) { // !flag인 상황 // 같은지 아닌지 체크 
							// 현재 로그인한 사람의 비밀번호와 사용자가 입력한 비밀번호를 확인하는 로직
							// 같은 비밀번호가 아니라고 했을시
							// 2.비밀번호가 불일치 한다고 생각 하고 not! 을 붙임 
							//비밀번호 불일치
							client.printFalse(); // 비밀번호 실패 메세지 띄움 
							continue; // 비밀번호가 일치 않았다면 ~ continue
						}
						// if 에 안들어갔다면 일치! 이제 삭제 진행 
						//mDAO.delete(member)  << 이거 자체가 if문에서 수행되어버리기때문에
						//boolean flag=mDAO.delete(member);
						//if(flag) 와 동일하기때문에 수행됩니다
						if(!mDAO.delete(member)) { // !flag 인 상황 //model.delete(지금 로그인 한 사람)이 잘 안됐다면 false
							//회원 정보 삭제가 안됐다면 
							client.printMemberDeleteFalse(); // 회원 탈퇴 실패
							continue; // 의문 : false가 나올확률이 있을까 ? 굉장히 희박 
							// 근데 혹시나 해커가 뚫을 수도 있을경우를 대비해 유효성을 만들자
						}
						
						
						//if(model.delete(지금 로그인한 사람)){
							// 잘 됐으면 true;
					    //}else{
							// 잘 안됐으면 false;
						//}
						
						// 근데 if문으로 잘 안된사람만 걸러내면 다 true기 때문에 
						// else의 순서를 바꿔서 if문에 잘 안된 false를 쓴다.
						// 조건식에 안걸리고 끝까지 쭉 내려오면 true이다.
						
						
						
						// 3.비밀번호가 일치하면 로그인 되어있는 회원을 전체회원목록에서 제거   
						client.printMemberDeleteTrue();  // 회원 탈퇴 성공
						client.printClientEnd02(); //사용자 모드 종료
						break;
					}
					// 잘됐으면 true 

					// 비밀번호를 한번더 확인 하는 로직이 있으면 더 좋다  // 회원탈퇴를 하려면 비밀번호를 입력해 
					// 비밀번호가 불일치 (본인이 아닐수 있을때) -> 회원탈퇴x

					// 비밀번호 일치 시 
					// -> 로그인이 되어있는 회원을 
					// 전체 회원 목록에서 제거



					else if(action==4) { // 상품목록출력 // 상품은 그냥 보여주기만 하면됨 
						// M에서 받아서 C 출력 
						ArrayList<ProductVO> pdatas=pDAO.selectAll(null);
						client.printProductList(pdatas); // 회원목록출력이랑 맥락이 같다.
					}
					else if(action==5) { // 상품목록검색_ 이름으로 검색 // 검색은 상품의 이름을 입력받아서 보여줘야 된다는 차이점이 있다.
						String name = client.getSearchContent(); // 검색어를 뷰로 부터 받아오기
						// 검색어를 뭘 받아올래 ?
						// 그 검색어를 모델 한테 넘겨주기 
						ProductVO pVO = new ProductVO (0,name,0,0); // 우리는 이름만 필요하니까 
						pDAO.selectAll(pVO);
						ArrayList<ProductVO> pdatas = pDAO.selectAll(pVO);
						client.printProductList(pdatas);

					}
					else if(action==6) { // 상품목록검색_가격으로 검색
						//사용자가 V에서 검색을 하고싶다고 말하면서 버튼을 누른다.
						// 무엇을 검색으로 받아올래 ? price
						// C가 V한테 검색할 것을 받아오라고 한다
						// V는 사용자에게 검색에 대해 가격을 입력받아온다.
						// V가 가격을 받아와 C에게 전달한다.
						ProductVO pVO=client.getSearchFilter();

						// C는 M에게 넘겨서 이 가격에 대해 가장 비싼 상품검색해줘라고 전달한다
						pDAO.selectAll(pVO);
						// M은 가격을 입력받아 그 가격에 대한 정보를 검색한다.
						// M에서 검색한 정보를 C에게 전달한다.
						ArrayList<ProductVO> pdatas=pDAO.selectAll(pVO);
						// C는 V에게 검색한 정보를 전달한다.
						// V는 사용자에게 보여준다.
						client.printProductList(pdatas);
						// C는 View 검색완료 안내멘트를 띄운다.


					}
					else if(action==7) { // 상품검색_최고가 검색
						ProductVO pVO=new ProductVO(0,"최고가",0,0);
						ProductVO data=pDAO.selectOne(pVO);
						client.printProduct(data);
					}
					else if(action==8) { // 상품검색_최저가 검색
						ProductVO pVO = new ProductVO(0,"최저가",0,0);
						ProductVO data = pDAO.selectOne(pVO);
						client.printProduct(data);
					}
				}
			}
			else if(action==3) { // 프로그램종료
				client.printClientEnd01();
				break;
			}
		}
	}
}

