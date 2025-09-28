package lotto;
import java.util.ArrayList;
import java.util.List;


public class WinningLotto {
    // lotto class를 모두가 갖고 있는건 종속성이 너무 강해진다.
    private List<Integer> winningNumbers = new ArrayList<Integer>();
    private int bonusNumber;

    public WinningLotto(List<Integer> winningNumbers, int bonusNumber) {
        this.winningNumbers = winningNumbers;
        this.bonusNumber = bonusNumber;
    }

    public List<Integer> getTotalNumbers() {
        List<Integer> totalNumbers = new ArrayList<>();
        for(Integer winningNumber : winningNumbers){
            totalNumbers.add(winningNumber);
        }
        totalNumbers.add(bonusNumber);

        return totalNumbers;
    }


}
