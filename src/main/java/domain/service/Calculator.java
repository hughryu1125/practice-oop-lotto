package domain.service;
import java.util.List;

public class Calculator {

    public int getLottoCountByMoney(int money) {
        return money / PRIZE.LOTTO_PRICE;
    }

    public double getProfitMargin(int originalMoney,List<Integer> winnerCount) {
        int totalPrize = winnerCount.get(WINNERCOUNT.WINNER) * PRIZE.WINNING_PRIZE + winnerCount.get(WINNERCOUNT.SECONDWINNER) * PRIZE.SECOND_WINNER_PRIZE + winnerCount.get(WINNERCOUNT.THIRDWINNER) * PRIZE.THIRD_WINNER_PRIZE
                + winnerCount.get(WINNERCOUNT.THIRDWINNER) * PRIZE.FOURTH_WINNER_PRIZE + winnerCount.get(WINNERCOUNT.FIFTHWINNER) * PRIZE.FIFTH_WINNER_PRIZE;
        double profitability = (double) totalPrize / originalMoney * 100; // %계산

        return profitability;
    }

}
