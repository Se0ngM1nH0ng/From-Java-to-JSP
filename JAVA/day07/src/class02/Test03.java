package class02;

import java.util.Random;

class Home{// Home의 구성원 객체
	String name;			//각 객체들은 고유한 이름(name)을 가짐
				//Home의 구성원 객체들이 공유하는 계좌가 있음//== money// money에 10000원있음

	static int money = 10000;// 클래스 변수는 여기서 초기화 하는것이 가능하다.
	
	Home(String name){
		this.name = name;
		System.out.println(this.name + "님 안녕하세요");
	}
	//person.use(5000);<- 얘가 객체인 이유 : 소문자로 시작하고 ,뒤에 .이 붙어서
	boolean use(int cnt) {
		System.out.println("현재 잔액: " + money);
		System.out.println("현재 잔액: " + money +" " + this.name + " 님이 출금했습니다.");
		if(Home.money<=money) {
			System.out.println(this.name + "님 돈이 없습니다..! 실패 !");
			return false;
		}
		Home.money -= cnt;// 돈은 계산이 되면 안되니까 긁히기 전에 위에서 막는다.
						// 이게 순서가 밑으로 내려와야 하는게 맞음
		// 클래스 변수인것을 보여주기 위해 기재 !! 쓰거나 안쓰거나
		return true;
	}
}

public class Test03 {

	public static void main(String[] args) {
		
		Home person = new Home("홍길동");
		Home person2 = new Home("길동엄마");
		Home person3 = new Home("길동아빠");
		
		Home[] datas = new Home[3];
		datas[0]=new Home("홍길동");
		datas[1]=new Home("길동엄마");
		datas[2]=new Home("길동아빠");
		
		while(true) {
			person.use(1000);
			if(!(person.use(1000))) {// 공유자원이 0이하면 이름출력하고 
				break;
			}
			person2.use(1000);
			if(!(person.use(1000))) {
				break;
			}
			person3.use(1000);
			if(!(person.use(1000))) {
				break;
			}
		}
		 Random rand=new Random(); // 랜덤을 돌릴수도 있다.
	      int i=0;
	      while(true) {
	         int randMoney=(rand.nextInt(50)+1)*100;
	         if(!datas[i++].use(randMoney)) {
	            break;
	         }
	         if(i==datas.length) {
	            i=0;
	         }
	      }

		
		
		
		
		
		
		
		
		
		
	}

}
