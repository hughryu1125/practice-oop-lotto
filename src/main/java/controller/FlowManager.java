/// user없는 버전.

package controller;

import java.util.List;

import domain.model.BunchOfLotties;
import view.*;
import domain.service.*;
import domain.model.*;

public class FlowManager {
    Input input = new Input();
    Output output = new Output();
    Validator validator = new Validator();
    Calculator calculator = new Calculator();

    public void Run() {

        output.printAskPrice(); // 묻고
        int amountOfMoney = input.readInputMoney(); // 입력받고
        validator.validateAmountOfMoney(amountOfMoney); // validation check

        output.printAskNumbers();
        List<Integer> winningNumbers = input.readNumbers();
        validator.validateNumbers(winningNumbers);

        output.printAskBonusNumber();
        int bonusNumber = input.readBonusNumber();
        validator.validateBonusNumber(bonusNumber, winningNumbers);

        int numberOfLotties = calculator.getLottoCountByMoney(amountOfMoney); // 지불 금액 -> 로또 개수로 변환.

        BunchOfLotties lotties = new BunchOfLotties(numberOfLotties); // 로또 개수에 맞게 생성

        WinningLotto winningLotto = new WinningLotto(winningNumbers, bonusNumber); // 당첨 로또도 생성함.

        int winnerCount = lotties.getWinnerCount(winningLotto);
        int secondWinnerCount = lotties.get2ndWinnerCount(winningLotto);
        int thirdWinnerCount = lotties.get3rdWinnerCount(winningLotto);
        int fourthWinnerCount = lotties.get4thWinnerCount(winningLotto);
        int fifthWinnerCount = lotties.get5thWinnerCount(winningLotto);

        output.printLotties(lotties.getLottoList()); // 생성한 사용자의 로또들을 print.

        output.printMatchingResult(winnerCount, secondWinnerCount, thirdWinnerCount, fourthWinnerCount, fifthWinnerCount);

        double profitMargin = calculator.getProfitMargin(10000,winnerCount, secondWinnerCount, thirdWinnerCount, fourthWinnerCount, fifthWinnerCount);
        output.printProfitMargin(profitMargin);

    }
}
