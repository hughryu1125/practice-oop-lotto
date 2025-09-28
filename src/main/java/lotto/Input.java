package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import camp.nextstep.edu.missionutils.Console;

public class Input {

    public int readInputMoney(){
        String moneyString = Console.readLine();
        int money = Integer.parseInt(moneyString);
        return money;
    }

    public List<Integer> readLottoNumbers(){
        String rawInput = Console.readLine();
        String[] inputs = rawInput.split(", ");

        List<Integer> inputNumbers = new ArrayList<Integer>();
        for (String input : inputs) {
            inputNumbers.add(Integer.parseInt(input));
        }

        return inputNumbers; // validation하지 않은 raw값을 보냄.
    }

    public int readBonusNumber(){
        String bonusNumString = Console.readLine();
        int bonusNum = Integer.parseInt(bonusNumString);
        return bonusNum;
    }

}
