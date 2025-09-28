package lotto;


///  else 쓰지 말기 / enum 쓰기 / bonus ball원리

import java.util.List;

public class Output {
    public void printAskPrice(){
        System.out.println("구입하실 금액을 입력하세요: ");
    }

    public void printAskNumbers(){
        System.out.println("당첨번호를 입력하세요: ");
    }

    public void printAskBonusNumber(){
        System.out.println("보너스 번호를 입력하세요: ");
    }

    private void printLotto(List<Integer> numbers){
        int count = numbers.size(); // 과연 이게 좋을까?? 이미 로또의 사이즈가 확정적으로 정해져있음.. 그치만 혹시 모를 상황을 생각해서 일단 이렇게 함...
        System.out.println(count + "개를 구매했습니다.");
        System.out.print("[ ");
        for(int i = 0; i < count; i++) {
            if(i == count-1) System.out.print(numbers.get(i));
            else System.out.print(numbers.get(i) + ", ");
        }
        System.out.println(" ]");
    }

    public void printLotties(List<Lotto> lottoList){
        for(int i =0; i < lottoList.size(); i++) {
            Lotto lotto = lottoList.get(i);

            printLotto(lotto.getNumbers());
        }
    }

    public void printMatchingResult(int matchingThree, int matchingFour, int matchingFive, int winning){
        System.out.println("3개 일치 (5,000원) -- " + matchingThree + "개");
        System.out.println("4개 일치 (50,000원) -- " + matchingFour + "개");
        System.out.println("5개 일치 (1,500,000원) -- " + matchingFive + "개");
        System.out.println("6개 일치 (2,000,000,000원) -- " + winning + "개");
    }

    public void printProfitability(double profitability){
        System.out.println("총 수익률은 " + profitability + "% 입니다.");
    }


}