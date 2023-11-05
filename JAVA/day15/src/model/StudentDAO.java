package model;

import java.util.ArrayList;

// CRUD (비즈니스 메서드, 핵심 로직) 구현이 목표
// : 일반적으로 output 이 boolean 타입이다 !!! ★★★★★★
// 다 boolean으로 바꿔주고 return true인지 false인지
// 기능구현 
// 로그들만 syso() 가능 -> 나중에 로그는 주석으로 제거함 !
// 나머지 syso() ------> view 의 기능!
public class StudentDAO {

	// model은 데이터를 가지고 있다
	// 이것이 모델이 가진 데이터 이다.

	// static이 아니라서 생성자에서 구현 

	// 외부로 부터 뭘 받아와야 되고 뭘 줘야하는지 
	// 로그를 어떤 패키지 어디 에서 받아왔는지

	/*
	PK는 사용자로부터 입력받으면 안됨!!!!!
	ID를 입력받을수는있으나, "중복검사"를 함!
	시스템에서 int값을 부여해야함!!!!!
	 */
	private static int PK = 1001; // 이 pk는 이제 각 생성된 것들의 번호 // 번호의 기준이 생김
	private ArrayList<StudentVO> datas;
	public StudentDAO(){
		this.datas=new ArrayList<StudentVO>();
		this.datas.add(new StudentVO(PK++,"홍길동",85));
		this.datas.add(new StudentVO(PK++,"아무무",92));
		this.datas.add(new StudentVO(PK++,"티모",51));
	}


	// 이름 고정


	// C :  학생을 추가하는 행위
	public boolean insert(String name,int score) {
		this.datas.add(new StudentVO(PK++,name,score));
		return true;
	}

	// 내가 가진 데이터스 공간에 ADD 할거야 
	//add를 하려면 pk,name,score 가 필요해 





	// R : 목록을 보는 행위 , 목록 출력
	// 학생 목록을 줘야함 

	public ArrayList<StudentVO> selectAll() {
		return this.datas;
	}

	// R : 1개를 출력하는 행위 , select
	// PK 를 받아서,
	public StudentVO selectOne(int num) { // PK를 받아서,
		for(int i=0;i<this.datas.size();i++) {
			if(this.datas.get(i).getNum()==num) {
				return this.datas.get(i);
			}
		} // -> 향상된 for문(forEach문)
		System.out.println("  로그: model: StudentDAO: selectOne(): 반환할 학생이 없습니다!");
		return null; // 해당 PK를 가진 학생이 없는 상태
	}





	// U : 어떤학생은 어떤 성적으로  
	public boolean update(int num,int score) {
		for(int i=0;i<this.datas.size();i++) {
			if(this.datas.get(i).getNum()==num) {
				this.datas.get(i).setScore(score);// > int
				return true;
			}
		}
		System.out.println("  로그: model: StudentDAO: update(): 성적변경할 학생이 없습니다!");
		return false;
	}





	// D : 학생을 삭제하는 행위
	public boolean delete(int num) { // 일단 번호를 알아야함 
		for(int i=0;i<this.datas.size();i++) {
			if(this.datas.get(i).getNum()==num) {
				this.datas.remove(i);
				return true;
			}
		}
		System.out.println("  로그: model: StudentDAO: delete(): 제거할 학생이 없습니다!");
		return false;
	}












}
