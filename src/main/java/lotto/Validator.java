package lotto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Validator {
    public static final int MAX_NUMBER = 45;
    public static final int MIN_NUMBER = 1;
    public static final int MAX_LOTTO_COUNT = 6;

    public void validateAmountOfMoney(int money){
        if(money % 1000 != 0) throw new IllegalArgumentException();
    }

    public void validateNumbers(List<Integer> numbers) { // 파라미터의 list가 적절한지 check
        if(numbers.size() != MAX_LOTTO_COUNT) { // 개수 체크
            throw new IllegalArgumentException();
        }

        for(int i = 0; i < MAX_LOTTO_COUNT; i++) { // 범위체크
            if(numbers.get(i) < MIN_NUMBER || numbers.get(i) > MAX_NUMBER) {
                throw new IllegalArgumentException();
            }
        }

        //중복 체크 (사용자가 입력할 경우, 겹칠 수도 있음.)
        Set<Integer> numbersSet = new HashSet<>(numbers);
        if(numbersSet.size() != MAX_LOTTO_COUNT) {
            throw new IllegalArgumentException();
        }

    }
    public void validateBonusNumber(int bonusNumber, List<Integer> numbers) { // 중복체크 때문에 어쩔 수 없이 얘도 list를 받아와야 한다.
        //범위 체크
        if(bonusNumber < MIN_NUMBER || bonusNumber > MAX_NUMBER) {
            throw new IllegalArgumentException();
        }

        //중복 체크
        for(int i = 0; i < MAX_LOTTO_COUNT; i++) {
            if(numbers.get(i) == bonusNumber) {
                throw new IllegalArgumentException();
            }
        }

    }
}
