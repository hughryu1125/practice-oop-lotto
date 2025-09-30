package domain.model;
import domain.service.LOTTOINFO;
import util.RandomNumberCreator;

import java.util.ArrayList;
import java.util.List;

public class BunchOfLotties {
    int lottiesCount;
    RandomNumberCreator randomCreator = new RandomNumberCreator(); // 이걸 instance로 진짜 해야돼?
    List<Lotto> lottoList = new ArrayList<>();

    public BunchOfLotties(int numOfLotties) {
        lottoList = createLottoList(numOfLotties);
    }

    private List<Lotto> createLottoList(int numberOfLotties){
        List<Lotto> lottoList = new ArrayList<>();
        for(int i = 0; i < numberOfLotties; i++){
            Lotto lotto = new Lotto(randomCreator.createRandomNumbers());
            lottoList.add(lotto);
        }
        return lottoList;
    }

    public List<Lotto> getLottoList() {
        return lottoList;
    }

    public int getWinnerCount(WinningLotto winningLotto) {
        List<Integer> winningNumbers = winningLotto.getNumbers();
        int count = 0;
        for(int i = 0; i < lottoList.size(); i++){
            if (lottoList.get(i).getSameNumberCount(winningNumbers) == LOTTOINFO.MAX_LOTTO_COUNT) count++;//
        }

        return count;
    }

    public int get2ndWinnerCount(WinningLotto winningLotto) {
        List<Integer> winningNumbers = winningLotto.getNumbers();
        int count = 0;
        for(int i = 0; i < lottoList.size(); i++){
            if(lottoList.get(i).getSameNumberCount(winningNumbers) == LOTTOINFO.MAX_LOTTO_COUNT -1
                    && lottoList.get(i).hasBonusNumber(winningLotto.getBonusNumber())){
                count++;
            }
        }

        return count;
    }

    public int get3rdWinnerCount(WinningLotto winningLotto) {
        List<Integer> winningNumbers = winningLotto.getNumbers();
        int count = 0;
        for(int i = 0; i < lottoList.size(); i++){
            if (lottoList.get(i).getSameNumberCount(winningNumbers) == LOTTOINFO.MAX_LOTTO_COUNT-1
                    && !lottoList.get(i).hasBonusNumber(winningLotto.getBonusNumber())){
                count++;
            }
        }

        return count;
    }

    public int get4thWinnerCount(WinningLotto winningLotto) {
        List<Integer> winningNumbers = winningLotto.getNumbers();
        int count = 0;
        for(int i = 0; i < lottoList.size(); i++){
            if (lottoList.get(i).getSameNumberCount(winningNumbers) == LOTTOINFO.MAX_LOTTO_COUNT -2) count++;//
        }

        return count;
    }

    public int get5thWinnerCount(WinningLotto winningLotto) {
        List<Integer> winningNumbers = winningLotto.getNumbers();
        int count = 0;
        for(int i = 0; i < lottoList.size(); i++){
            if (lottoList.get(i).getSameNumberCount(winningNumbers) == LOTTOINFO.MAX_LOTTO_COUNT-3) count++;//
        }

        return count;
    }


}
