package test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

// 관리자모드 입장 : 1234
// 관리자 모드 비밀번호 : 123 

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

	void sell(int cnt) { // 판매
		if (this.cnt >= cnt) {
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
				System.out.println("구매 실패 !");
			}
		} else { // 재고보다 더 구매하려고 했을시
			System.out.println("재고가 부족합니다 !");
			System.out.println("다시 입력해주세요 !");
		}
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
		if (this.cnt == 0) {
			System.out.println("[품절] ");
		}
		return "상품번호 " + this.number + "번 " + this.name + ", " + this.price + "원" + "[재고: " + this.cnt + "]";

	}

}

public class Test03 {

	public static int tryCatch() { // 번호 선택 trycatch 메서드
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				int action = sc.nextInt();
				sc.nextLine();
				return action;

			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력해주세요 !");
				sc.nextLine();
				return -1;

			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Product> data = new ArrayList<Product>();
		final String path = "D:\\KIM\\resource";
		final String fileName = "test.txt";
		File file = new File(path + fileName); // 새로운 파일 생성

		int number = 1; // 상품 번호는 1번부터 시작
		int num = 0; // 임시변수

		while (true) {
			try {
				Thread.sleep(1500);
				System.out.println("===== 목록 =====");
				System.out.println("1. 상품 목록 출력");
				System.out.println("2. 구매하기");
				System.out.println("3. 프로그램 종료");
				System.out.println("===============");
				System.out.print("입력 ) ");
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			int action = tryCatch();

			if (action == 1) { // 상품 목록 출력
				if (data.isEmpty()) { // 등록된 상품이 없다면
					System.out.println("상품이 등록되지 않았습니다.");
					continue;
				}
				for (int i = 0; i < data.size(); i++) {
					System.out.println(data.get(i)); // 등록된 상품 모두 보여주기
				}
			}

			else if (action == 2) { // 구매하기
				if (data.isEmpty()) { // 등록된 상품이 없다면
					System.out.println("상품이 등록되지 않았습니다.");
					continue;
				}
				for (int i = 0; i < data.size(); i++) {
					System.out.println(data.get(i)); // 등록된 상품 모두보여주기
				}
				System.out.println("어떤 상품을 구매하시겠습니까 ?");
				System.out.println("상품 번호를 입력하세요.");
				num = tryCatch(); // 상품 번호 고르기
				boolean flag = false; // flag 알고리즘 // for문이 다 돌고 true 찾기
				for (int i = 0; i < data.size(); i++) {
					if (data.get(i).getNumber() == num) { // 상품의 번호와 number가 같으면
						flag = true;
						System.out.println(data.get(i)); // 배열 인덱스번호의 값을 불러온다
						System.out.println("몇개 구입하시겠습니까 ?");
						int cnt = tryCatch(); // 수량 입력 받기
						if (cnt != -1) {
							data.get(i).changeProduct(cnt);
						}
					}
				}
				if (!flag) { // flag가 아니라면// 계속 false라면
					System.out.println("상품번호를 잘못입력 하셨습니다.");
					System.out.println("다시 시도해주세요.");
				}
				// for문이 아니라면
				// 상품번호 이외의 숫자는 유효하지 않다
			} else if (action == 3) { // 프로그램 종료
				System.out.println("프로그램을 종료 합니다.");
				try {
					file.createNewFile();
					FileWriter writer = new FileWriter(path + fileName, true);
					writer.write("===== 목록 =====");
					writer.write("\r\n");
					writer.write("1. 상품 목록 출력");
					writer.write("\r\n");
					writer.write("2. 구매하기");
					writer.write("\r\n");
					writer.write("3. 프로그램 종료");
					writer.write("\r\n");
					writer.write("===============");
					writer.write("\r\n");
					writer.write("\r\n");

					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					System.out.println("파일 저장 완료");
					System.out.println("목록 출력 완료");
				}
				break;
			} else if (action == 1234) { // 관리자모드
				int count = 0; // 비밀번호 틀린횟수

				while (true) { // 비밀번호 3회 카운트 반복
					System.out.print("password : ");
					int password = tryCatch(); // 임시변수
					if (password == 123) {
						System.out.println("관리자 모드 입니다");
						while (true) {
							try {
								Thread.sleep(1500);
								System.out.println("====== 목록 =====");
								System.out.println("1. 상품 추가");
								System.out.println("2. 상품 재고 변경");
								System.out.println("3. 상품 삭제");
								System.out.println("4. 관리자 모드 종료");
								System.out.println("================");
								System.out.print("입력 ) ");
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							int select = tryCatch();

							if (select == 1) { // 상품 추가
								System.out.println("상품의 이름을 입력하세요.");
								String name = sc.next();
								sc.nextLine();
								System.out.println("상품의 가격을 입력하세요.");
								int price = tryCatch();
								if (price <= 0) { // 가격이 0 밑으로는 떨어질수 없다.
									System.out.println("유효하지 않습니다");
									System.out.println("다시 입력해주세요.");
									continue;
								}
								data.add(new Product(number++, name, price));
								System.out.println("상품 등록 완료 !");
							} // 관리자 모드 1
							else if (select == 2) { // 상품 재고 변경
								if (data.isEmpty()) { // 등록된 상품이 없다면
									System.out.println("상품이 등록되지 않았습니다.");
									continue;
								}
								for (Product product : data) {
									System.out.println(product);
								}
								System.out.println("재고를 추가할 상품의 번호를 입력하세요.");
								num = tryCatch();
								boolean flag = false; // flag 알고리즘
								for (int i = 0; i < data.size(); i++) {
									if (data.get(i).getNumber() == num) { // 상품의 번호와 number가 같으면
										flag = true;
										System.out.println(data.get(i));
										System.out.println("추가하고 싶은 재고의 수량을 입력하세요.");
										int cnt = tryCatch();
										if (cnt != -1) {
											if (cnt < 0) {
												System.out.println("재고를 1개이상 추가해주세요.");
											} else {
												data.get(i).changeProduct(cnt);
											}
										}
										// 데이터 배열 인덱스 번호의 상품을 불러온다
										// 그 상품의 재고를 변경한다 // 재고변경 메서드
									}
								}
								if (!flag) {// 상품번호 이외의 숫자는 유효하지 않다 항목 추가 !
									System.out.println("상품번호를 잘못입력 하셨습니다.");
									System.out.println("다시 시도해주세요.");
								}

							} // 관리자 모드 2

							else if (select == 3) { // 상품 삭제
								if (data.isEmpty()) { // 등록된 상품이 없다면
									System.out.println("상품이 등록되지 않았습니다.");
									continue;
								}
								for (Product product : data) {
									System.out.println(product); // 상품 목록 출력
								}
								System.out.println("상품의 번호를 입력하세요.");
								num = tryCatch();
								boolean flag = false; // flag 알고리즘
								for (int i = 0; i < data.size(); i++) { // 상품 배열 사이즈에 들어가있는 상품번호
									if (num == data.get(i).getNumber()) {// 입력받은 상품 번호가 저장해놓은 번호중
										flag = true;// 조건이 맞았을때 ! 스위치 같은 개념// 같은 번호가 있니?
										System.out.println(data.get(i));
										data.remove(i); // 그러면 삭제해줘
										System.out.println("삭제 완료 !");
										break;
									}
								}
								if (!flag) { // flag가 못찾았을 시 계속 false였을때
									System.out.println("상품번호를 잘못입력 하셨습니다.");
									System.out.println("다시 시도해주세요.");
								}

							} // 관리자 모드 3
							else if (select == 4) { // 관리자 모드 종료
								System.out.println("관리자 모드를 종료 합니다.");
								try {
									file.createNewFile();
									FileWriter writer = new FileWriter(path + fileName, true);
									writer.write("===== 목록 =====");
									writer.write("\r\n");
									writer.write("1. 상품 추가");
									writer.write("\r\n");
									writer.write("2. 상품 재고 변경");
									writer.write("\r\n");
									writer.write("3. 상품 삭제");
									writer.write("\r\n");
									writer.write("4. 관리자 모드 종료");
									writer.write("\r\n");
									writer.write("===============");
									writer.write("\r\n");
									writer.write("\r\n");

									writer.close();
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} finally {
									System.out.println("사용자 모드로 돌아갑니다.");
								}
								break;
							} else { // 입력값이 잘못되었을때
								System.out.println("잘못 입력하셨습니다.");
								System.out.println("다시 입력해주세요.");
							} // 관리자 모드 목록 선택 유효성검사
						} // 관리자 페이지 종료
						break;
					} else { // 관리자 password 가 틀렸을 때
						System.out.println("비밀번호가 틀렸습니다.");
						count++; // 첫번째 입력 틀렸을때 1
					} // 관리자모드 비밀번호 틀렸을때

					if (count == 3) { // 비밀번호가 3회 틀렸다면
						System.out.println("처음으로 돌아갑니다");
						count = 0;
						break; // 반복종료
					}
				} // 비밀번호 입력 반복

			} else {
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("다시 입력해주세요.");
			} // 사용자 목록 선택 유효성
		} // 상품목록 while
		sc.close();
	} // main 메서드

} // class

