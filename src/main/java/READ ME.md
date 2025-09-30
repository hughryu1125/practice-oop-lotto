## 입력:
로또 금액: 1000원 단위, 나누어 떨어지지 않으면 예외 처리
당첨 금액: 6개(", "으로 구분) + 1개

## 출력:
로또 수량
로또 번호 정렬해서 보여주기

당첨내역 출력
수익률 출력

## RULE:: 내 state를 남이 건드리면 안돼!

# 구현하고 싶은 기능들.
* 금액 입력 받기 (개수 자동 계산) [Input]

-> validation check: 1000원 단위?[validator]

* 로또 Winning 번호 입력 받기 + 보너스 넘버도.[Input] 

-> Check validation: 개수/중복/범위 [validator]
-> 입력한 값들 오름차순으로 정렬 []

* Lotto 생성(사용자 입력도 고려) []

-> 1-45 무작위 생성 [RandomNumberCreator]
-> 오름차순 정렬 *** 얘가 문제인데, 많이 쓰이는 기능임. but lotto의 내부의 값을 건드리는 거라서 외부 클래스를 두는 것은 적절하지 않아. [Lotto]
-> Check validation: 개수/중복/범위 [Lotto]

* 사용자 로또 <-> Winning Lotto 비교
-> 일치 개수 비교

* 사용자 당첨 금액 계산



* 수익률 계산
-> 당첨금액 / 소비 금액
-------------
## FLOW
1. input 사실상 개수 + winning number
2. validate
3. input에 맞는 로또 생성 (User에!!) with RandomNumberCreator + WinningNumber에 사용자 입력 + bonus number 저장.
4. Winning Number <-> User Number랑 비교! (어디서...??)
5. 비교 결과를 바탕으로 수익 계산 + 수익률 계산
6. 수익률 출력

## Lotto Class


---------------------------------

## 배운 내용:

* public static final int => #define과 거의 유사!
* List 활용법
1) 정의: import java.util.List; + List< type> name; 이런 식으로 정의

* 겹치지 않고 정수 리스트 생성법
1) 가장 단순한 방법: 랜덤으로 숫자 생성 -> 기존의 리스트와 비교해서 없으면 ok 아니면 다시! count 세서 원하는 만큼 while loop
2) set이용! 
set으로 랜덤 넘버 생성 -> list로 변환
import java.util.Set;

Set<Integer> uniqueNumbers = new HashSet<>();
int min = 1; 
int max = 45;
count = 6;

while(uniqueNumebr.size() < count){
int num = random.nextInt(max - min +1) + min;
uniqueNubers.add(num);
}

List<Integer> list = new ArrayList<uniqueNumbers>
3) 오름차순 정렬방법
- Collections.sort( list ); 

// 내부 list를 자체로 바꿈. 즉, return하는 것이 아니고 리스트의 값들에 접근해서 순서를 바꾸고 영구적으로 저장함.