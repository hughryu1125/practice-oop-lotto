package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import camp.nextstep.edu.missionutils.Console;

public class Input {
    Scanner console = new Scanner(System.in); // 라이브러리 가져오면 오류 생겨서 일단 이걸로 처리함.
    public int readInputMoney(){
// 오류 생김        String moneyString = Console.readLine();

//        int money = Integer.parseInt(moneyString);

        int money = console.nextInt();
        return money;
    }

    public List<Integer> readLottoNumbers(){
// 오류 생김        String rawInput = Console.readLine();
        String rawInput = console.nextLine();
        String[] inputs = rawInput.split(", ");

        List<Integer> inputNumbers = new ArrayList<Integer>();
        for (String input : inputs) {
            inputNumbers.add(Integer.parseInt(input));
        }

        return inputNumbers; // validation하지 않은 raw값을 보냄.
    }

    public int readBonusNumber(){
//        String bonusNumString = Console.readLine();
//        int bonusNum = Integer.parseInt(bonusNumString);
        int bonusNum = console.nextInt();
        return bonusNum;
    }

}
