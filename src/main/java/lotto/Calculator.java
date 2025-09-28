package lotto;

public class Calculator {
    public static final int MATCHING_THREE_PRIZE = 5000;
    public static final int MATCHING_FOUR_PRIZE = 50000;
    public static final int MATCHING_FIVE_PRIZE = 1500000;
    public static final int WINNING_PRIZE = 2000000000;

    public int getLottoCountByMoney(int money) {
        return money / 1000;
    }

    public double getProfitablity(int originalMoney,int matchingThree, int matchingFour, int matchingFive, int winning) {
        int totalPrize = matchingThree * MATCHING_THREE_PRIZE + matchingFour * MATCHING_FOUR_PRIZE + matchingFive * MATCHING_FIVE_PRIZE + winning * WINNING_PRIZE;
        double profitability = (double) totalPrize / originalMoney * 100;

        return profitability;
    }

}
