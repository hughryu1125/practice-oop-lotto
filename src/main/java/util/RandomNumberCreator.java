package util;
import java.util.*;
import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberCreator {
    public static final int MAX_NUMBER = 45;
    public static final int MIN_NUMBER = 1;
    public static final int MAX_LOTTO_COUNT = 6;
    Random rand = new Random();

    public List<Integer> createRandomNumbers(){
        List<Integer> numbers = Randoms.pickUniqueNumbersInRange(MIN_NUMBER, MAX_NUMBER, MAX_LOTTO_COUNT);
        return numbers;
    }

}
