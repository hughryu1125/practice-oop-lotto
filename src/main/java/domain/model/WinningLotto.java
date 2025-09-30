package domain.model;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class WinningLotto {
    // lotto class를 모두가 갖고 있는건 종속성이 너무 강해진다.
    private List<Integer> winningNumbers = new ArrayList<Integer>();
    private int bonusNumber;

    public WinningLotto(List<Integer> winningNumbers, int bonusNumber) {
        this.winningNumbers = winningNumbers;
        Collections.sort(winningNumbers);
        this.bonusNumber = bonusNumber;
    }

    public List<Integer> getNumbers() {

        return winningNumbers;
    }

    public int getBonusNumber() {
        return bonusNumber;
    }


}
