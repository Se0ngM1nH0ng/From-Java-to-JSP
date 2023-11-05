# JAVA, DB , WEB, JSP

## JAVA
[ 객체지향 언어 JAVA ] 

[ 객체지향 프로그래밍(OOP)의 특성 ]

​

▶특성 4가지 

★  추상화    // 너무 추상적. 인식하는것에 따라 다 바뀔수 있음

ex ) "자동차" 코딩해줘. 각자 생각하는게 다 다르다

1) 스포츠카 : 속도, 브레이크() 가 중요해 

2) 버스 (대중교통을 생각) : 탑승인원수,요금정산()

3) 차: 주유상태 출력(), 벨트(), 네비()

어떻게 정의하느냐에 따라, 서로다른 OUTPUT이 생성될수 있다

그래서 "설계"가 매우 중요하다!

​

★ 캡슐화     EX )약의 내부구성성분을 몰라도 약의 효과를 알면 먹는다.내부 구성성분을 몰라도, 효과를 알면 우리는 그냥 먹는다.

-> 내부로직코드를 정확히 몰라도, INPUT/ OUTPUT /기능 /활용하는 상황을 알면 사용한다. 

PRINTLN , SCANNER, RANDOM



기존의 코드들을 분석하여 '모듈화'된 코드들을 가져다가 쓸수있다!

* 오류의 파급효과 줄어듦 

* 개발시간단축

* 개발비용절감 

* 이익증가

* 유지보수가 용이

​

★ 상속

부모(상위) 클래스에서 미리 공통부분을 코딩해둔다음, 

자식(하위) 클래스에서 '상속'받아 세부적인 부분을 구현

EX ) 함수, 반복문, 캡슐화 ... 등등등 

※캡슐화 와의 차이점 

캡슐화는 포함관계 X

          상속은 포함관계 O ----> "설계" 단계에서 집중적으로 고민하는 부분 !!!

​

★ 다형성 

★일반적으로 흔히 만들수 있는 " 함수에게 주어(주체)가 생기는 생겼기 " 때문에 발생하는 현상 ★

함수: 일반적인 프로그래밍 언어에서 흔히 만들수 있음. 주어 XXX

메서드: 객체지향언어에서만 작성가능 . 주어 O

함수를 실행시키는 주어(주체) == 객체

객체가 실행하는 함수 => 메서드 

같은 함수를 실행시켜도, 주어(주체) 따라 다른 기능이 실행되는 현상

EX1) 강아지.울음소리(); -> 멍멍

고양이.울음소리(); -> 야옹
