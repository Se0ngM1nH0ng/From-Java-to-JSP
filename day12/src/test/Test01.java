/*package test;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// 관리자 비밀번호 : 1234
class Product {
	private int number; // PK // 고유 상품번호
	private String name;
	private int price;
	private int cnt;

	Product() {
		this(0, "과자");
	}

	Product(int number, String name) {
		this(0, "과자", 1000);
	}

	Product(int number, String name, int price) {
		this.number = number;
		this.name = name;
		this.price = price;
		Random rand = new Random();
		this.cnt = rand.nextInt(21); // 재고는 랜덤으로 받을 예정
	}

	int sell(int cnt) { // 판매
		int sum = 0; // 합계
		int result = 0; // 거스름돈
		sum = cnt * this.price; // 합계
		System.out.println("가격은 " + sum + "원 입니다.");

		Scanner sc = new Scanner(System.in);
		System.out.print("돈 입력 ) "); // 사용자에게 돈입력받기
		int money = sc.nextInt();
		if (money >= sum) { // 가진돈이 합계보다 일단 많아야한다.
			this.cnt -= cnt; // 현재 재고에서 구매한 재고만큼 빼주기
			result = money - sum; // (입력한돈 - 합계)를 result에 담았다
			// 거스름돈
			System.out.println("구매 성공 !");
			System.out.println("거스름돈은 " + result + "원 입니다.");
			System.out.println("이용해 주셔서 감사합니다.");
		} else {
			System.out.println("잔액이 부족합니다...!");
		}
		return result; // 거스름돈 반환

	}

	void changeProduct(int cnt) {// 재고변경
		this.cnt += cnt;
		System.out.println("재고 변경 완료 !");
		System.out.println("[재고 : " + this.cnt + "]");
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	@Override
	public String toString() {
		return "상품번호 " + this.number + "번 " + this.name + ", " + this.price + "원" + "[재고: " + this.cnt + "]";
	}

}

public class Test01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Product> data = new ArrayList<Product>();

		int number = 1; // 상품 번호는 1번부터 시작

		while (true) {
			System.out.println("===== 목록 =====");
			System.out.println("1. 상품 목록 출력");
			System.out.println("2. 구매하기");
			System.out.println("3. 프로그램 종료");
			System.out.println("===============");
			System.out.print("입력 ) ");
			int action = sc.nextInt();

			if (action == 1) { // 상품 목록 출력
				for (Product product : data) { // 배열에 저장된 상품들을
					System.out.println(product); // product 객체에 넣는다
				}
			} else if (action == 2) { // 구매하기
				for (Product product : data) {
					System.out.println(product);// 목록 출력
				}
				System.out.println("어떤 상품을 구매하시겠습니까 ?");
				System.out.println("상품 번호를 입력하세요.");
				number = sc.nextInt();
				for (int i = 0; i < data.size(); i++) {
					if (data.get(i).getNumber() == number) { // 상품의 번호와 number가 같으면
						System.out.println(data.get(i)); // 배열 인덱스번호의 값을 불러온다
						System.out.println("몇개 구입하시겠습니까 ?");
						int cnt = sc.nextInt(); // 수량 입력 받기
						data.get(i).sell(cnt);
					}
				}
				// 배열 인덱스 번호의 판매 메서드 실행
				// INPUT : 구입할 수량 int cnt
				// OUTPUT : 거스름돈 result

			} else if (action == 3) { // 프로그램 종료
				System.out.println("프로그램을 종료 합니다.");
				break;
			} else if (action == 1234) { // 관리자모드
				System.out.println("관리자 모드 입니다");
				while (true) {
					System.out.println("====== 목록 =====");
					System.out.println("1. 상품 추가");
					System.out.println("2. 상품 재고 변경");
					System.out.println("3. 상품 삭제");
					System.out.println("4. 관리자 모드 종료");
					System.out.println("================");
					System.out.print("입력 ) ");
					int select = sc.nextInt();

					if (select == 1) { // 상품 추가
						System.out.println("상품의 이름을 입력하세요.");
						String name = sc.next();
						sc.nextLine();
						System.out.println("상품의 가격을 입력하세요.");
						int price = sc.nextInt();
						data.add(new Product(number++, name, price));
					} else if (select == 2) { // 상품 재고 변경
						for (Product product : data) {
							System.out.println(product);
						}
						System.out.println("재고를 추가할 상품의 번호를 입력하세요.");
						number = sc.nextInt();
						for (int i = 0; i < data.size(); i++) {
							if (data.get(i).getNumber() == number) { // 상품의 번호와 number가 같으면
								System.out.println(data.get(i));
								System.out.println("추가하고 싶은 재고의 수량을 입력하세요.");
								int cnt = sc.nextInt();
								data.get(i).changeProduct(cnt);
								// 데이터 배열 인덱스 번호의 상품을 불러온다
								// 그 상품의 재고를 변경한다 // 재고변경 메서드
							}
						}
					} else if (select == 3) { // 상품 삭제
						for (Product product : data) {
							System.out.println(product);
						}
						System.out.println("상품의 번호를 입력하세요.");
						int num = sc.nextInt();
						for (int i = 0; i < data.size(); i++) { // 상품 배열 사이즈에 들어가있는 상품번호
							if (num == data.get(i).getNumber()) {// 입력받은 상품 번호가 저장해놓은 번호중
								// 같은 번호가 있니?
								System.out.println(data.get(i));
								data.remove(i); // 그러면 삭제해줘
								System.out.println("삭제 완료 !");
								break;
							}
						}
					} else if (select == 4) { // 관리자 모드 종료
						System.out.println("관리자 모드를 종료 합니다.");
						break;
					}

				}
			}

		}
		sc.close();
	}

}
*/