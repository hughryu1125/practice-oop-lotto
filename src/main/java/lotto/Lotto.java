package lotto;

import java.util.Collections;
import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public static final int MAX_NUMBER = 45;
    public static final int MIN_NUMBER = 1;
    public static final int MAX_LOTTO_COUNT = 6;

    public Lotto(List<Integer> numbers) {
        // validate(numbers);
        this.numbers = numbers;
        Collections.sort(numbers);
    }

    public int getSameNumberCount(List<Integer> winningNumbers) { // 외부에서 직접 체크를 하지말고 내부에서 체크하자. = lotto내부의 값들을 외부에서 들여다보는게 적절치X
        int count = 0;
        for(int i = 0; i < MAX_LOTTO_COUNT; i++) {
            if(winningNumbers.contains(numbers.get(i))) {
                count++;
            }
        }

        return count;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }



    // TODO: 추가 기능 구현
}
