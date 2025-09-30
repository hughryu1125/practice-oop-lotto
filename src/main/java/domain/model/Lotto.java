package domain.model;

import java.util.Collections;
import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        this.numbers = numbers;
        Collections.sort(numbers); // 정렬 함.
        // this.type = Type.DEFAULT; // 굳이 type 필요한가?? 지금이 직관적인 듯....
    }

    public int getSameNumberCount(List<Integer> winningNumbers) { // 외부에서 직접 체크를 하지말고 내부에서 체크하자. = lotto내부의 값들을 외부에서 들여다보는게 적절치X
        int count = 0;
        for(int i = 0; i < numbers.size(); i++) { // MAX_LOTTO_COUNT -> numbers.size()
            if(winningNumbers.contains(numbers.get(i))) {
                count++;
            }
        }

        return count; //몇개가 같은지 내보내는 함수
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public boolean hasBonusNumber(int bonusNum){
        for(Integer number : numbers){
            if(number == bonusNum){
                return true;
            }
        }
        return false;
    }

    // TODO: 추가 기능 구현
}
