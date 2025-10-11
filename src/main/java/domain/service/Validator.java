package domain.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import domain.service.ErrorMessage;

public class Validator {

    private static final int MINIMUM_ALLOWED_MOENY = 0;
    private static final int MONEY_UNIT = 1000;

    public void validateAmountOfMoney(int money){
        if(money % MONEY_UNIT != 0 || money < MINIMUM_ALLOWED_MOENY) throw new IllegalArgumentException(ErrorMessage.MONEY_RANGE);
    }

    public void validateNumbers(List<Integer> numbers) { // 파라미터의 list가 적절한지 check
        if(numbers.size() != LOTTOINFO.MAX_LOTTO_COUNT) { // 개수 체크
            throw new IllegalArgumentException(ErrorMessage.NUMBER_COUNT);
        }

        for(int i = 0; i < LOTTOINFO.MAX_LOTTO_COUNT; i++) { // 범위체크
            if(numbers.get(i) < LOTTOINFO.MIN_NUMBER || numbers.get(i) > LOTTOINFO.MAX_NUMBER) {
                throw new IllegalArgumentException(ErrorMessage.MONEY_RANGE);
            }
        }

        //중복 체크 (사용자가 입력할 경우, 겹칠 수도 있음.)
        Set<Integer> numbersSet = new HashSet<>(numbers);
        if(numbersSet.size() != LOTTOINFO.MAX_LOTTO_COUNT) {
            throw new IllegalArgumentException(ErrorMessage.SAME_NUMBER);
        }

    }
    public void validateBonusNumber(int bonusNumber, List<Integer> numbers) { // 중복체크 때문에 어쩔 수 없이 얘도 list를 받아와야 한다.
        //범위 체크
        if(bonusNumber < LOTTOINFO.MIN_NUMBER || bonusNumber > LOTTOINFO.MAX_NUMBER) {
            throw new IllegalArgumentException(ErrorMessage.NUMBER_RANGE);
        }

        //중복 체크
        for(int i = 0; i < LOTTOINFO.MAX_LOTTO_COUNT; i++) {
            if(numbers.get(i) == bonusNumber) {
                throw new IllegalArgumentException(ErrorMessage.SAME_NUMBER);
            }
        }

    }
}
