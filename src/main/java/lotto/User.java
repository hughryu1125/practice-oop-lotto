package lotto;
import java.util.ArrayList;
import java.util.List;

public class User { // 실제 인스턴스를 누가 가질 것인가...
    private List<Lotto> lottoList = new ArrayList<Lotto>(); // 일단 생성했어.
//    private int lottoTotalCount;

    private int threeNumberMatchingLottoCount;
    private int fourNumberMatchingLottoCount;
    private int fiveNumberMatchingLottoCount;
    private int winningLottoCount;

    public void setLottoList(List<Lotto> lottoList) { // 생성자를 만들지 않음. user가 먼저 존재하고 이후에 input을 받아야 하기 때문.
        this.lottoList = lottoList;
    }

    public List<Lotto> getLottoList() {
        return lottoList;
    }

    public void checkMatchingNumbers(WinningLotto winningLotto) {
        List<Integer> totalList = winningLotto.getTotalNumbers();
        for(Lotto lotto : lottoList){
            if (lotto.getSameNumberCount(totalList) == 3){
                threeNumberMatchingLottoCount++;
            }
            else if (lotto.getSameNumberCount(totalList) == 4){
                fourNumberMatchingLottoCount++;
            } else if (lotto.getSameNumberCount(totalList) == 5) {
                fiveNumberMatchingLottoCount++;
            }
            else if (lotto.getSameNumberCount(totalList) == 6) {
                winningLottoCount++;
            }
        }
    }

    public int getThreeNumberMatchingLottoCount() {
        return threeNumberMatchingLottoCount;
    }

    public int getFourNumberMatchingLottoCount() {
        return fourNumberMatchingLottoCount;
    }

    public int getFiveNumberMatchingLottoCount() {
        return fiveNumberMatchingLottoCount;
    }

    public int getWinningLottoCount() {
        return winningLottoCount;
    }
    /*
    public void setLottoTotalCount(int lottoTotalCount) {
        this.lottoTotalCount = lottoTotalCount;
    } */
    
}
