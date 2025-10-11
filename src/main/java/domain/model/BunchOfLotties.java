package domain.model;
import domain.service.LOTTOINFO;
import domain.service.WINNERCOUNT;
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

    public List<Integer> getWinningLottiesCounts(WinningLotto winningLotto) {

        List<Integer> winningLottiesCounts = new ArrayList<>();
        List<Integer> winningLottoNumbers = winningLotto.getNumbers();

        int[] winnerCount = new int[WINNERCOUNT.MAXWINNER];

        for(int i = 0; i < lottoList.size(); i++){
            if(lottoList.get(i).getSameNumberCount(winningLottoNumbers) == LOTTOINFO.MAX_LOTTO_COUNT)
            {
                winnerCount[WINNERCOUNT.WINNER]++;
            }
            else if (lottoList.get(i).getSameNumberCount(winningLottoNumbers) == LOTTOINFO.MAX_LOTTO_COUNT -1){
                winnerCount[WINNERCOUNT.SECONDWINNER]++;
            }
            else if (lottoList.get(i).getSameNumberCount(winningLottoNumbers) == LOTTOINFO.MAX_LOTTO_COUNT -2){
                winnerCount[WINNERCOUNT.THIRDWINNER]++;
            }
            else if (lottoList.get(i).getSameNumberCount(winningLottoNumbers) == LOTTOINFO.MAX_LOTTO_COUNT -3){
                winnerCount[WINNERCOUNT.FOURTHWINNER]++;
            }
            else if (lottoList.get(i).getSameNumberCount(winningLottoNumbers) == LOTTOINFO.MAX_LOTTO_COUNT -4){
                winnerCount[WINNERCOUNT.FIFTHWINNER]++;
            }
        }

        for(int i =0; i < WINNERCOUNT.MAXWINNER; i++){
            winningLottiesCounts.add(winnerCount[i]);
        }

        return winningLottiesCounts;
    }



}
