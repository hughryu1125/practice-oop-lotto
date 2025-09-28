package lotto;
import java.util.ArrayList;
import java.util.List;

public class LottoController {

    RandomNumberCreator randomCreator = new RandomNumberCreator(); // 이걸 instance로 진짜 해야돼?
    // List<Lotto> lottoList = new ArrayList<>(); 얘가 이걸 인스턴스로 갖고 있는거 적절치X

    WinningLotto winningLotto;

    public List<Lotto> createLottoList(int numberOfLotties){
        List<Lotto> lottoList = new ArrayList<>();
        for(int i = 0; i < numberOfLotties; i++){
            Lotto lotto = new Lotto(randomCreator.createRandomNumbers());
            lottoList.add(lotto);
        }
        return lottoList;
    }

    public void setWinningLotto(WinningLotto winningLotto) {
        this.winningLotto = winningLotto;
    }
}
