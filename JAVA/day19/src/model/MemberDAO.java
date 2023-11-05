package model;

import java.util.ArrayList;

// 구현할 기능
// 회원목록출력
// 회원가입,로그인,로그아웃,마이페이지,회원탈퇴
public class MemberDAO {
	private ArrayList<MemberVO> datas;
	public MemberDAO() {
		datas=new ArrayList<MemberVO>();
		datas.add(new MemberVO("admin","1234","관리자")); // 아이디, 비밀번호, 
		datas.add(new MemberVO("coding_helper","timo","작은 티모"));
	}

	public ArrayList<MemberVO> selectAll(MemberVO mVO){
		return datas; // 내가 가진 현재 회원목록 반환 하면 된다
	}
	public MemberVO selectOne(MemberVO mVO){
		// 받은 값이 내 리스트에 있어 ?
		for(MemberVO v : datas) { // 전체를 쭉 훑어 봤을때
			if(mVO.getMid().equals(v.getMid())) {// 내가 받은 값이 배열에 있어 ? // 혹시 내가 받은값이 datas에 있어 ?
				//내가 받은 아이디가 v한테 기존 정보에 있어 ?
				if(mVO.getMpw().equals(v.getMpw()))  {//비밀번호 확인해보기
					return v;  //걔 반환해 
				}
				System.out.println(" 로그: MemberDAO: selectOne(): 비밀번호가 일치하지않습니다!");
				return null;  //아이디는 맞는데 비밀번호 검사중 // 비밀번호가 틀렸다면 
			}
		}
		System.out.println(" 로그: MemberDAO: selectOne(): 해당 아이디가 없습니다!");
		return null; // 아이디가 아예 등록이 안되어있다면
	}

	public boolean insert(MemberVO mVO) {  // C -> M 정보로 회원가입 가능 ?
		//mVO 가 의미하는것 == 회원가입할 정보 <--- 로직에 들어갈 내용 //mVO -> 나 회원가입 시켜줘
		//mVO를 내가가진 datas 에 넣어줄 예정
		//PK 중복검사를 해야하고, 성공하면 add()

		// 중복 검사를 꼭 하자 !!!
		// 회원가입 시켜주세요 ~~ 하면 -> 일단 아이디 중복 검사 부터 해
		// 내가 갖고있는걸 이거인지 저거인지 다 ~~~ 살펴봐야 아는 상황 --> flag 로직을 써야한다
		//		if(혹시 PK가 중복되었어?) { 
		//			return false; //실패하면 false 반환
		//		}
		//		datas에 mVO정보를 저장 add() // 중복검사가 통과가 되면 
		//		return true;


		boolean flag = false; // 처음부터 끝까지 돌면서 나와같은 아이디가 있는지 체크하겠습니다
		for(MemberVO data : datas) { // 아이디가 같은지 볼려면 데이터를 다 봐야한다. for문으로 데이터 다 ~ 보기 
			if(data.equals(mVO)) { //객체비교는 equals //오버라이딩 하러 가자 //data == mVO<--- 객체비교를 연산자로 하고 있음 xx
				// 하나라도 회원가입한 정보랑 같아 ?
				flag = true;
				System.out.println(" 로그: MemberDAO: insert(): 아이디 중복"); // 로그 달아줌 
				break;
			}
		}
		if(flag) { // PK가 중복 되었어? // 중복검사를 일단 하고 
			return false;
		}
		//if를 들어가지 않아 잘 내려왔다면 
		//datas 에 새로운 사람을 추가 하게 되고 // 새로운 아이디, 새로운 비번, 새로운 닉네임
		datas.add(new MemberVO(mVO.getMid(),mVO.getMpw(),mVO.getName())); // 객체 new 써주고 객체
		//새로운사람을 만들적에(인자였던 mVO에서 추출);	
		return true;
		//datas 에 mVO정보를 저장 add() // 중복검사 성공하면 저장을 해
		//mVO 를 datas 에 넣어줄 예정
		// 인자였던 mVO 순으로 꺼내면 됨 
		/* 51 번라인 설명 
		 *1) datas.add(new MemberVO());
		 * -> datas DB공간에 new 새로운 데이터를 추가 // new 객체
		 *2)   MemberVO(데이터1,데이터2,데이터3)
       		-> 데이터들을 mVO에서 추출하면됨
		 */



	}
	public boolean update(MemberVO mVO) {
//		정보를 입력받아서 새로운 비밀번호로 바꿔줘
//		전체를 돌려봤을때 입력한 정보와 내가 입력한 번호가 같으면 
//		새로운 비밀번호로 바꿔줘 
		
		for (int i = 0; i < datas.size(); i++) {
			if(datas.get(i).equals(mVO)) { // 새로운 것으로 변경
				datas.get(i).setMpw(mVO.getMpw()); // 기존것을 다시 설정 
				return true;
			}
		}
		return false;
	}
	public boolean delete(MemberVO mVO) {
		for (int i = 0; i < datas.size(); i++) {
			if(datas.get(i).equals(mVO)) { //전체를 돌렸을때  입력한 정보와 내가 가진 정보의 인덱스가 일치하면 
				datas.remove(i); // 삭제 한다.
				return true;
			}
		}
		return false; // 그렇지 않을시 false이다.
	}
}
