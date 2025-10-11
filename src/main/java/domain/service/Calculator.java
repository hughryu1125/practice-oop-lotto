package domain.service;

public class Calculator {

    public int getLottoCountByMoney(int money) {
        return money / PRIZE.LOTTO_PRICE;
    }

    public double getProfitMargin(int originalMoney,int winnerCount, int secWinnerCount, int thirdWinnerCount, int fourthWinnerCount, int fifthWinnerCount) {
        int totalPrize = winnerCount * PRIZE.WINNING_PRIZE + secWinnerCount * PRIZE.SECOND_WINNER_PRIZE + thirdWinnerCount * PRIZE.THIRD_WINNER_PRIZE
                + fourthWinnerCount * PRIZE.FOURTH_WINNER_PRIZE + fifthWinnerCount * PRIZE.FIFTH_WINNER_PRIZE;
        double profitability = (double) totalPrize / originalMoney * 100; // %계산

        return profitability;
    }

}
