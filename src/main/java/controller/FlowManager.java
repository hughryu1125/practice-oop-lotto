package controller;

import java.util.ArrayList;
import java.util.List;

import domain.model.BunchOfLotties;
import view.*;
import domain.service.*;
import domain.model.*;

public class FlowManager {
    Input input;
    Output output;
    Validator validator;
    Calculator calculator;

    public void Run() {
        output.printAskPrice();
        int amountOfMoney = input.readInputMoney();
        validator.validateAmountOfMoney(amountOfMoney);

        output.printAskNumbers();
        List<Integer> winningNumbers = input.readLottoNumbers();

        output.printAskNumbers();
        int bonusNumber = input.readBonusNumber();

        BunchOfLotties lotties = new BunchOfLotties(amountOfMoney);
        User user = new User(lotties);


        WinningLotto winningLotto = new WinningLotto(winningNumbers, bonusNumber);

        int winnerCount = user.getWinnerCount(winningLotto);
        int secondWinnerCount = user.get2ndWinnerCount(winningLotto);
        int thirdWinnerCount = user.get3rdWinnerCount(winningLotto);
        int fourthWinnerCount = user.get4thWinnerCount(winningLotto);
        int fifthWinnerCount = user.get5thWinnerCount(winningLotto);

        output.printLotties(user.getLotties().getLottoList());
        output.printMatchingResult(winnerCount, secondWinnerCount, thirdWinnerCount, fourthWinnerCount, fifthWinnerCount);

        double profitability = calculator.getProfitablity(amountOfMoney,winnerCount, secondWinnerCount, thirdWinnerCount, fourthWinnerCount, fifthWinnerCount);
        output.printProfitability(profitability);
    }
}
