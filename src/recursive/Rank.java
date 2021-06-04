package recursive;

public class Rank {

    public static Integer makeRank(Integer baseNumber, Integer currentNumber, Integer currentLoop, Integer maxLoop) {
        if(currentLoop == maxLoop - 1) {
            return currentNumber;
        } else {
            return makeRank(baseNumber,
                    (currentNumber == 0 ? baseNumber : currentNumber) * baseNumber,
                    currentLoop + 1,
                            maxLoop);
        }
    }
}
