package domain.model;

import java.util.ArrayList;
import java.util.List;

public class User { // 실제 인스턴스를 누가 가질 것인가...
    BunchOfLotties lotties;

    public User(BunchOfLotties bunchOfLotties) {
        lotties = bunchOfLotties;
    }

    public int getWinnerCount(WinningLotto winningLotto) {
        return lotties.getWinnerCount(winningLotto);
    }

    public int get2ndWinnerCount(WinningLotto winningLotto) {
        return lotties.getWinnerCount(winningLotto);
    }

    public int get3rdWinnerCount(WinningLotto winningLotto) {
        return lotties.getWinnerCount(winningLotto);
    }

    public int get4thWinnerCount(WinningLotto winningLotto) {
        return lotties.getWinnerCount(winningLotto);
    }

    public int get5thWinnerCount(WinningLotto winningLotto) {
        return lotties.getWinnerCount(winningLotto);
    }

    public BunchOfLotties getLotties() {
        return lotties;
    }

}
