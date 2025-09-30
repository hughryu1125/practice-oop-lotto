package view;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {

    public int readInputMoney(){
        String moneyString = Console.readLine().trim();

        int money = Integer.parseInt(moneyString);

        return money;
    }

    public List<Integer> readLottoNumbers(){
        String rawInput = Console.readLine().trim();
        String[] inputs = rawInput.split(", ");

        List<Integer> inputNumbers = new ArrayList<>();
        for (String input : inputs) {
            inputNumbers.add(Integer.parseInt(input.trim()));
        }

        return inputNumbers; // validation하지 않은 raw값을 보냄.
    }

    public int readBonusNumber(){
        String bonusNumString = Console.readLine().trim();
        int bonusNum = Integer.parseInt(bonusNumString);
        return bonusNum;
    }

}
